package BridgeLabz_Day27_LinearBinarySearch;

import java.io.*;
import java.util.*;
public class FileReaderWordCount {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a word to search :");
        String word = myScan.next();
        int count=0;
        try {
            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while(( line = br.readLine()) != null) {
                String[] strArr = line.split("\\s+");
                for(String str : strArr){
                    if(str.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }
            System.out.println("Count is : "+count);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}