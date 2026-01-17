package BridgeLabz_Day27_LinearBinarySearch;

public class LinearSearchSentence {
    public static void main(String[] args) {
        String[] arr = {"Java is fun", "I love coding"};
        String word = "coding";
        for (String s : arr) {
            if (s.contains(word)) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Not Found");
    }
}