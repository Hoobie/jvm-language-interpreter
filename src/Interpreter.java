import language.NPJListenerImpl;
import language.generated.NPJLexer;
import language.generated.NPJParser;
import language.memory.NPJSemiSpaceCopyingMemory;
import language.util.Constants;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Interpreter {

    private final InputStream programStream;
    private final int heapSize;
    private final int[] heap;

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Wrong number of arguments.");
            System.exit(1);
        }

        int heapSize = getHeapSize();
        Interpreter interpreter = new Interpreter(args[0], heapSize);
        interpreter.start();
    }

    public Interpreter(String programFile, int heapSize) {
        programStream = getProgramStream(programFile);
        this.heapSize = heapSize;
        heap = new int[heapSize];
    }

    public void start() {
        try {
            NPJLexer lexer = new NPJLexer(new ANTLRInputStream(programStream));
            TokenStream tokens = new CommonTokenStream(lexer);
            NPJParser parser = new NPJParser(tokens);
            parser.addParseListener(new NPJListenerImpl(new NPJSemiSpaceCopyingMemory(heapSize), heap));
            parser.program();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(3);
        }
    }

    private InputStream getProgramStream(String programFile) {
        InputStream programStream = null;
        try {
            programStream = new FileInputStream(programFile);
        } catch (FileNotFoundException e) {
            System.out.println("Could not open program file: " + programFile);
            System.exit(2);
        }

        return programStream;
    }

    private static int getHeapSize() {
        return Integer.valueOf(System.getProperty(Constants.NPJ_HEAP_SIZE_PROPERTY));
    }
}
