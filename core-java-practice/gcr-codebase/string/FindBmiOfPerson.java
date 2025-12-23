

import java.util.Scanner;

public class FindBmiOfPerson {
    public static void main(String[] args) {
        Scanner my_scan = new Scanner(System.in);
        double[][] personData = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) and height (cm) for person " + (i + 1));
            personData[i][0] = my_scan.nextDouble();
            personData[i][1] = my_scan.nextDouble();
        }
        String[][] result = processBmi(personData);
        displayResult(result);
    }
    public static String[][] calculateBmiAndStatus(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double heightInMeter = data[i][1] / 100.0;

            double bmi = weight / (heightInMeter * heightInMeter);
            String status;

            if (bmi <= 18.4) {
                status = "Underweight";
            }
            else if (bmi <= 24.9) {
                status = "Normal";
            }
            else if (bmi <= 39.9) {
                status = "Overweight";
            }
            else {
                status = "Obese";
            }

            result[i][0] = String.valueOf(data[i][1]); // Height
            result[i][1] = String.valueOf(weight);     // Weight
            result[i][2] = String.format("%.2f", bmi); // BMI
            result[i][3] = status;                     // Status
        }
        return result;
    }

    public static String[][] processBmi(double[][] data) {
        return calculateBmiAndStatus(data);
    }

    public static void displayResult(String[][] result) {

        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");

        for (int i = 0; i < result.length; i++) {
            System.out.println(
                    result[i][0] + "\t\t" +
                            result[i][1] + "\t\t" +
                            result[i][2] + "\t" +
                            result[i][3]
            );
        }
    }
}
