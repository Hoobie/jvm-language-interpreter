package language;

import language.generated.NPJBaseListener;
import language.generated.NPJParser;
import language.memory.NPJSemiSpaceCopyingMemory;
import language.util.Constants;
import language.util.VariableData;
import language.util.VariableType;

import java.util.HashMap;
import java.util.Map;

public class NPJListenerImpl extends NPJBaseListener {

    private NPJSemiSpaceCopyingMemory memory;
    private int[] heap;
    private Map<String, VariableData> variables = new HashMap<String, VariableData>();

    public NPJListenerImpl(NPJSemiSpaceCopyingMemory memory, int[] heap) {
        this.memory = memory;
        this.heap = heap;
    }

    @Override
    public void exitVariableDeclarationT(NPJParser.VariableDeclarationTContext ctx) {
        String variableName = ctx.STRING().getText();
        int ptr = memory.allocateT(heap, (Map) variables);
        VariableData variableData = new VariableData(ptr, VariableType.T);
        variables.put(variableName, variableData);
    }

    @Override
    public void exitVariableDeclarationSConstant(NPJParser.VariableDeclarationSConstantContext ctx) {
        String variableName = ctx.STRING(0).getText();
        String variableValue = ctx.STRING(1).getText();
        int stringLength = variableValue.length();
        int ptr = memory.allocateS(heap, (Map) variables, stringLength);
        for (int i = 0; i < stringLength; i++) {
            heap[ptr + VariableType.S.getBaseSize() + i] = variableValue.charAt(i);
        }
        VariableData variableData = new VariableData(ptr, VariableType.S);
        variables.put(variableName, variableData);
    }

    @Override
    public void exitVariableDeclarationSNull(NPJParser.VariableDeclarationSNullContext ctx) {
        String variableName = ctx.STRING().getText();
        VariableData variableData = new VariableData(Constants.NULL, VariableType.S);
        variables.put(variableName, variableData);
    }

    @Override
    public void exitPrintStringMessage(NPJParser.PrintStringMessageContext ctx) {
        NPJ.print(ctx.STRING().getText());
    }

    @Override
    public void exitPrintStringConstant(NPJParser.PrintStringConstantContext ctx) {
        VariableData variableData = variables.get(ctx.STRING().getText());
        if (variableData.type != VariableType.S) {
            throw new RuntimeException("Could not print non-string value.");
        }

        Integer ptr = variableData.ptr;
        if (heap[ptr] == Constants.NULL) {
            NPJ.print("NULL");
            return;
        }

        String stringConstant = "";
        for (int i = 0; i < heap[ptr + Constants.STRING_LENGTH_OFFSET]; i++) {
            stringConstant += (char) heap[ptr + VariableType.S.getBaseSize() + i];
        }
        NPJ.print(stringConstant);
    }

    @Override
    public void exitCollect(NPJParser.CollectContext ctx) {
        NPJ.collect(heap, memory, (Map) variables);
    }
}
