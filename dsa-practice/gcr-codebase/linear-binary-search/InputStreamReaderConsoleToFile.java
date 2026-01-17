package BridgeLabz_Day27_LinearBinarySearch;

import java.io.*;
public class InputStreamReaderConsoleToFile {
    public static void main(String[] args) {
        try {
            InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(ir);
            FileWriter fw = new FileWriter("output.txt");
            System.out.println("Enter text (type exit to stop) : ");
            String line;
            while(!(line=br.readLine()).equals("exit")) {
                fw.write(line + "\n");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}