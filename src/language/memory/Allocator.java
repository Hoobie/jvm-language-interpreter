package language.memory;

import java.util.Map;

public interface Allocator {
    int allocateT(int[] heap, Map<Object, Object> objects);

    int allocateS(int[] heap, Map<Object, Object> objects, int stringLength);
}
