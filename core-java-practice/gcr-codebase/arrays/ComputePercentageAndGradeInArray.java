
import java.util.Scanner;

public class ComputePercentageAndGradeInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];
        String[] remarks = new String[n];

        // -------- INPUT LOOP --------
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            physics[i] = sc.nextDouble();

            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextDouble();

            System.out.print("Maths: ");
            maths[i] = sc.nextDouble();

            // validation
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks! Please enter positive values again.");
                i--;   // same student data dobara lo
                continue;
            }
        }

        // -------- CALCULATION LOOP --------
        for (int i = 0; i < n; i++) {

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

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
            System.out.println("Student " + (i + 1) + " -> Physics: " + physics[i] + ", Chemistry: " + chemistry[i] + ", Maths: " + maths[i] + ", Percentage: " + percentage[i] + "%" + ", Grade: " + grade[i] + ", Remarks: " + remarks[i]);
        }
    }
}
