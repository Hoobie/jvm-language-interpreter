package language.memory;

import language.util.Constants;
import language.util.VariableData;
import language.util.VariableType;

import java.util.Map;

public class NPJSemiSpaceCopyingMemory implements Collector, Allocator {

    private int halfOfHeapSize;
    private int toSpace = 1;
    private int fromSpace;
    private int allocPtr;

    public NPJSemiSpaceCopyingMemory(int heapSize) {
        halfOfHeapSize = heapSize / 2;
        fromSpace = halfOfHeapSize + 1;
        allocPtr = toSpace;
    }

    @Override
    public int allocateT(int[] heap, Map<Object, Object> objects) {
        int size = VariableType.T.getBaseSize();
        int ptr = allocate(heap, objects, size);
        heap[ptr] = VariableType.T.getCode();
        heap[ptr + 1] = Constants.NULLPTR;
        heap[ptr + 2] = Constants.NULLPTR;
        heap[ptr + 3] = 0;
        return ptr;
    }

    @Override
    public int allocateS(int[] heap, Map<Object, Object> objects, int stringLength) {
        int size = VariableType.S.getBaseSize() + stringLength;
        int ptr = allocate(heap, objects, size);
        heap[ptr] = VariableType.S.getCode();
        heap[ptr + Constants.STRING_LENGTH_OFFSET] = stringLength;
        return ptr;
    }

    private int allocate(int[] heap, Map<Object, Object> objects, int size) {
        if (allocPtr + size > toSpace + halfOfHeapSize) {
            collect(heap, objects);
        }
        if (allocPtr + size > toSpace + halfOfHeapSize) {
            throw new RuntimeException("Out of memory.");
        }
        int newPtr = allocPtr;
        allocPtr += size;
        return newPtr;
    }

    @Override
    @SuppressWarnings(value = "unchecked")
    public void collect(int[] heap, Map<Object, Object> params) {
        swapSpaces();
        allocPtr = toSpace;
        Map<Integer, VariableData> variables = (Map) params;
        for (VariableData root : variables.values()) {
            root.ptr = copy(heap, root.ptr);
        }
    }

    private void swapSpaces() {
        int temp = fromSpace;
        fromSpace = toSpace;
        toSpace = temp;
    }

    private int copy(int[] heap, int root) {
        if (heap[root] < 0) {
            int newPtr = allocPtr;
            int variableSize = getSize(heap, root);
            allocPtr += variableSize;
            System.arraycopy(heap, root, heap, newPtr, variableSize);
            heap[root] = newPtr;
            if (VariableType.getType(heap[newPtr]) == VariableType.T) {
                int f1 = heap[root + 1];
                int f2 = heap[root + 2];
                heap[newPtr + 1] = copy(heap, f1);
                heap[newPtr + 2] = copy(heap, f2);
            }
            return newPtr;
        } else {
            return heap[root];
        }
    }

    private int getSize(int[] heap, int ptr) {
        VariableType type = VariableType.getType(heap[ptr]);
        if (type == VariableType.T) {
            return type.getBaseSize();
        } else if (type == VariableType.S) {
            return type.getBaseSize() + heap[ptr + Constants.STRING_LENGTH_OFFSET];
        }
        throw new RuntimeException("Failed to get size.");
    }
}
