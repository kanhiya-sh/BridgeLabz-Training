package BridgeLabz_Day27_LinearBinarySearch;

import java.io.*;
public class InputStreamReaderReadFile {
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("sample.txt");
            InputStreamReader ir = new InputStreamReader(fs,"UTF-8");
            BufferedReader br = new BufferedReader(ir);
            String line;
            while ( (line = br.readLine() ) != null ) {
                System.out.println(line);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}