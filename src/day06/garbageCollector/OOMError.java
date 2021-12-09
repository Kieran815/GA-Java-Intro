package day06.garbageCollector;

import java.util.ArrayList;
import java.util.List;

public class OOMError {
    public static void main(String[] args) {

        // This will run an INFINITE LOOP: (will crash program)
//        List<String[]> list = new ArrayList<>();
//
//        for(int i = 0; ; i++) {
//            Runtime runtime = Runtime.getRuntime();
//            System.out.printf("Iteration: %d total memory: %d free memory: %d%n", i, runtime.totalMemory(), runtime.freeMemory());
//            list.add(new String[10_000_000]);
//        }
    }
}
