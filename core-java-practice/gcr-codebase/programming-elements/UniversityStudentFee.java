
import java.util.Scanner;

public class UniversityStudentFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int universityFee = sc.nextInt();
        int discountPercentage = sc.nextInt();
        int discountAmount = (universityFee * discountPercentage) / 100;
        int discountedPrice = universityFee - discountAmount;
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedPrice);
    }
}
