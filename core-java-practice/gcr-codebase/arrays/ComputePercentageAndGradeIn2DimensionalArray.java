

import java.util.Scanner;

public class ComputePercentageAndGradeIn2DimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // 2D array for marks
        // column 0 -> Physics
        // column 1 -> Chemistry
        // column 2 -> Maths
        double[][] marks = new double[n][3];

        double[] percentage = new double[n];
        char[] grade = new char[n];
        String[] remarks = new String[n];

        // -------- INPUT LOOP --------
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = sc.nextDouble();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextDouble();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextDouble();

            // validation
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks! Please enter positive values again.");
                i--;   // data of same student again
                continue;
            }
        }

        // -------- CALCULATION LOOP --------
        for (int i = 0; i < n; i++) {

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
                remarks[i] = "Level 4, above agency-normalized standards";
            }
            else if (percentage[i] >= 70) {
                grade[i] = 'B';
                remarks[i] = "Level 3, at agency-normalized standards";
            }
            else if (percentage[i] >= 60) {
                grade[i] = 'C';
                remarks[i] = "Level 2, below but approaching agency-normalized standards";
            }
            else if (percentage[i] >= 50) {
                grade[i] = 'D';
                remarks[i] = "Level 1, well below agency-normalized standards";
            }
            else if (percentage[i] >= 40) {
                grade[i] = 'E';
                remarks[i] = "Level 1-, too below agency-normalized standards";
            }
            else {
                grade[i] = 'R';
                remarks[i] = "Remedial standards";
            }
        }

        // -------- DISPLAY RESULT --------
        System.out.println("\n----- STUDENT RESULT -----");
        for (int i = 0; i < n; i++) {
            System.out.println(
                    "Student " + (i + 1) +
                            " -> Physics: " + marks[i][0] +
                            ", Chemistry: " + marks[i][1] +
                            ", Maths: " + marks[i][2] +
                            ", Percentage: " + percentage[i] + "%" +
                            ", Grade: " + grade[i] +
                            ", Remarks: " + remarks[i]
            );
        }
    }
}
