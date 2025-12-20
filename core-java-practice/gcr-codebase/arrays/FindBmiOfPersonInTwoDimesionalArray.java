
import java.util.Scanner;

public class FindBmiOfPersonInTwoDimesionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of people");
        int number = sc.nextInt();

        double[][] DataOfEachPerson = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.println("Enter weight and height");
            DataOfEachPerson[i][0] = sc.nextDouble();
            DataOfEachPerson[i][1] = sc.nextDouble();

            if (DataOfEachPerson[i][0] <= 0 || DataOfEachPerson[i][1] <= 0) {
                System.out.println("Invalid input Enter positive values.");
                i--;
                continue;
            }

            DataOfEachPerson[i][2] = DataOfEachPerson[i][0] / (DataOfEachPerson[i][1] * DataOfEachPerson[i][1]);

            if (DataOfEachPerson[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (DataOfEachPerson[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (DataOfEachPerson[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }


        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight " + DataOfEachPerson[i][0]);
            System.out.println("Height " + DataOfEachPerson[i][1]);
            System.out.println("BMI    " + DataOfEachPerson[i][2]);
            System.out.println("Status " + weightStatus[i]);
        }
    }
}
