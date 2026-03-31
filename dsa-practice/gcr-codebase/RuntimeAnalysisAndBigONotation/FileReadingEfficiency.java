package BridgeLabz_Day28_RuntimeBigONotation;

import java.io.*;
public class FileReadingEfficiency {
    public static void main(String[] args) throws Exception {
        File file = new File("large.txt");
        long start = System.nanoTime();
        FileReader fr = new FileReader(file);
        while (fr.read() != -1);
        fr.close();
        long end = System.nanoTime();
        System.out.println("FileReader Time is : " + (end - start)/1e6 + " ms");

        start = System.nanoTime();
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
        while (isr.read() != -1);
        isr.close();
        end = System.nanoTime();
        System.out.println("InputStreamReader Time is : " + (end - start)/1e6 + " ms");
    }
}