

public class StudentFeesOfCourse {
    public static void main(String[] args) {
        int universityFee = 125000;
        int discountPercentage = 10;
        int discountAmount = (universityFee * discountPercentage) / 100;
        int discountedPrice = universityFee - discountAmount;
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedPrice);
    }
}
