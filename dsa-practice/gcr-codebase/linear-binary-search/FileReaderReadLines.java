package BridgeLabz_Day27_LinearBinarySearch;

import java.io.*;
public class FileReaderReadLines {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}