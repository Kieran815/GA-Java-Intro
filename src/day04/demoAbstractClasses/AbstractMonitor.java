package day04.demoAbstractClasses;

import java.io.IOException;
import java.io.RandomAccessFile;

// Abstract classes can consist of abstract methods AND concrete methods

public abstract class AbstractMonitor {

    public abstract String process();

    public void startMonitoring(String fileName) throws IOException, InterruptedException {
        while(true) {
            String value = process();

            RandomAccessFile file = new RandomAccessFile(fileName, "rw");
            file.seek(file.length());
            file.write(value.getBytes());
            file.writeChar('\n');
            Thread.sleep(1000);
        }
    }
}
