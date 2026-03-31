package Capgemini_Day12_class_object;

class PalindromeChecker {
    private String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String clean = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String rev = new StringBuilder(clean).reverse().toString();
        return clean.equals(rev);
    }

    void display() {
        if (isPalindrome())
            System.out.println(text + " is a palindrome");
        else
            System.out.println(text + " is not a Palindrome");
    }
}

public class CreatePalindromeChecker {
    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("A man a plan a canal Panama");
        p1.display();

        PalindromeChecker p2 = new PalindromeChecker("Hello");
        p2.display();
    }
}
