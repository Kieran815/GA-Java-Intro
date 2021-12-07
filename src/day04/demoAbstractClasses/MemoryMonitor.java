package day04.demoAbstractClasses;

import java.io.IOException;
import java.util.Date;

public class MemoryMonitor extends AbstractMonitor{
    @Override
    public String process() {
        System.out.println(Runtime.getRuntime().freeMemory());
        return new Date() + " " + Runtime.getRuntime().freeMemory();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        MemoryMonitor memoryMonitor = new MemoryMonitor();
        memoryMonitor.startMonitoring("/home/crawling-chaos/interapt/unit2/src/day04/demoAbstractClasses/demo.txt");

    }
}
