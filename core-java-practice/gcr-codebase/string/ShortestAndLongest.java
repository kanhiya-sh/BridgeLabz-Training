
import java.util.Scanner;

public class ShortestAndLongest {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = myScan.nextLine();
        String[] words = text.split("\\s+");
        String shortestString = words[0];
        String longestString = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < shortestString.length()) {
                shortestString = words[i];
            }
            if (words[i].length() > longestString.length()) {
                longestString = words[i];
            }
        }
        System.out.println("shortestString word: " + shortestString);
        System.out.println("longestString word: " + longestString);
    }
}
