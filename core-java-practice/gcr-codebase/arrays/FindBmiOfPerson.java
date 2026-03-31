
import java.util.Scanner;

public class FindBmiOfPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];   // height in meters
        double[] bmi = new double[n];
        String[] status = new String[n];

        // -------- INPUT LOOP --------
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            double heightInCm = sc.nextDouble();
            height[i] = heightInCm / 100.0; // convert to meters
        }

        // -------- BMI & STATUS CALCULATION --------
        for (int i = 0; i < n; i++) {

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            }
            else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            }
            else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            }
            else {
                status[i] = "Obese";
            }
        }

        // -------- DISPLAY RESULT --------
        System.out.println("\n----- BMI REPORT -----");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " -> Height: " + height[i] + " m, " + "Weight: " + weight[i] + " kg, " + "BMI: " + bmi[i] + ", " + "Status: " + status[i]);
        }
    }
}
