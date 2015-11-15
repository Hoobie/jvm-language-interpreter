package language;

import language.generated.NPJBaseListener;
import language.generated.NPJParser;
import language.memory.NPJSemiSpaceCopyingMemory;
import language.util.Constants;
import language.util.VariableData;
import language.util.VariableType;

import java.util.*;

public class NPJListenerImpl extends NPJBaseListener {

    private NPJSemiSpaceCopyingMemory memory;
    private int[] heap;
    private Map<String, VariableData> variables = new HashMap<>();

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
        declareString(variableName, variableValue);
    }

    @Override
    public void exitVariableDeclarationSNull(NPJParser.VariableDeclarationSNullContext ctx) {
        String variableName = ctx.STRING().getText();
        VariableData variableData = new VariableData(Constants.NULLPTR, VariableType.S);
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
        NPJ.print(buildString(ptr));
    }

    @Override
    public void exitCollect(NPJParser.CollectContext ctx) {
        NPJ.collect(heap, memory, (Map) variables);
    }

    @Override
    public void exitAssignment(NPJParser.AssignmentContext ctx) {
        String lValue = ctx.lValue().getText();
        String rValue = ctx.rValue().getText();
        int leftPtr = resolvePtr(lValue);
        if (Constants.NULL.equals(rValue)) {
            heap[leftPtr] = Constants.NULLPTR;
            return;
        } else if (rValue.startsWith("\"")) {
            declareString(lValue, rValue.substring(1, rValue.length() - 1));
            return;
        }
        try {
            heap[leftPtr] = Integer.parseInt(rValue);
        } catch (NumberFormatException nfe) {
            heap[leftPtr] = resolvePtr(rValue);
        }
    }

    @Override
    public void exitHeapAnalyze(NPJParser.HeapAnalyzeContext ctx) {
        Collection<Integer> variablesT = new ArrayList<>();
        Collection<String> variablesS = new ArrayList<>();
        int ptr = memory.toSpace;
        while (ptr < memory.toSpace + (heap.length / 2)) {
            int code = heap[ptr];
            VariableType type = code < 0 ? VariableType.getType(code) : null;
            if (type == VariableType.T) {
                ptr += 3;
                variablesT.add(heap[ptr]);
                ptr++;
            } else if (type == VariableType.S) {
                variablesS.add(buildString(ptr));
                ptr += VariableType.S.getBaseSize() + heap[ptr + Constants.STRING_LENGTH_OFFSET];
            } else {
                break;
            }
        }
        NPJ.heapAnalyze(variablesT, variablesS);
    }

    private void declareString(String variableName, String variableValue) {
        int stringLength = variableValue.length();
        int ptr = memory.allocateS(heap, (Map) variables, stringLength);
        for (int i = 0; i < stringLength; i++) {
            heap[ptr + VariableType.S.getBaseSize() + i] = variableValue.charAt(i);
        }
        VariableData variableData = new VariableData(ptr, VariableType.S);
        variables.put(variableName, variableData);
    }

    private String buildString(int ptr) {
        if (heap[ptr] == Constants.NULLPTR) {
            return Constants.NULL;
        }

        String stringConstant = "";
        for (int i = 0; i < heap[ptr + Constants.STRING_LENGTH_OFFSET]; i++) {
            stringConstant += (char) heap[ptr + VariableType.S.getBaseSize() + i];
        }
        return stringConstant;
    }

    private int resolvePtr(String value) {
        List<String> parts = Arrays.asList(value.split("\\."));
        Iterator<String> it = parts.iterator();
        VariableData variableData = variables.get(it.next());
        int ptr = variableData.ptr;
        while (it.hasNext()) {
            String part = it.next();
            switch (part) {
                case Constants.FIELD_1_NAME:
                    ptr += 1;
                    break;
                case Constants.FIELD_2_NAME:
                    ptr += 2;
                    break;
                case Constants.DATA_FIELD_NAME:
                    ptr += 3;
                    break;
                default:
                    throw new RuntimeException("Wrong reference.");
            }
            if (it.hasNext()) {
                ptr = heap[ptr];
            }
        }
        return ptr;
    }
}
