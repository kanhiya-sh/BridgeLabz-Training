

import java.util.Scanner;

public class MayaBmiFitnessTracker {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        double weight = scc.nextDouble();
        double heightInCm = scc.nextDouble();
        double height = heightInCm / 100.0;
        double bmi = weight / (height * height);
        System.out.printf("BMI: %.2f\n", bmi);
        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        }
        else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        }
        else {
            status = "Obese";
        }

        System.out.println("\n--- BMI Result ---");
        System.out.println("BMI: " + bmi);
        System.out.println("Weight Status: " + status);
    }
}
