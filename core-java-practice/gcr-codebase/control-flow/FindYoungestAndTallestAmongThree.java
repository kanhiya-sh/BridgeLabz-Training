
import java.util.Scanner;

public class FindYoungestAndTallestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ageAmar = sc.nextInt();
        int ageAkbar = sc.nextInt();
        int ageAnthony = sc.nextInt();
        int heightAmar = sc.nextInt();
        int heightAkbar = sc.nextInt();
        int heightAnthony = sc.nextInt();
        // First for Finding the youngest
        if(ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Amar is the youngest");
        }
        else if(ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("Akbar is the youngest");
        }
        else {
            System.out.println("Anthony is the youngest");
        }
        // Now for Finding the tallest
        if(heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Amar is the tallest");
        }
        else if(heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("Akbar is the tallest");
        }
        else {
            System.out.println("Anthony is the tallest");
        }
    }
}
