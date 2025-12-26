import java.util.Scanner;
public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Principal : ");
        double principal = myScan.nextDouble();
        System.out.print("Rate of Interest : ");
        double rateOfInterest = myScan.nextDouble();
        System.out.print("Time (in years) : ");
        double time = myScan.nextDouble();
        double simpleInterest = calculateSimpleInterest(principal, rateOfInterest, time);
        System.out.println("Simple Interest is: " + simpleInterest);
    }
    public static double calculateSimpleInterest(double principal, double rateOfInterest, double time) {
        return (principal * rateOfInterest * time) / 100;
    }
}
