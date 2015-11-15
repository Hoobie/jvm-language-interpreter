package language;

import language.memory.Collector;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public class NPJ {
    public static void print(String string) {
        System.out.println(string);
    }

    public static void collect(int[] heap, Collector collector, Map<Object, Object> params) {
        collector.collect(heap, params);
    }

    public static void heapAnalyze(int heap[]) {
        print(Arrays.toString(heap));
    }

    public static void heapAnalyze(Collection<Integer> typeTVariables, Collection<String> typeSVariables) {
        print("");
        print("Type T variables:");
        for (int var : typeTVariables) {
            print(String.valueOf(var));
        }
        print("=================");
        print("Type S variables:");
        for (String var : typeSVariables) {
            print(var);
        }
    }
}
