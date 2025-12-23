
import java.util.Scanner;

public class ComputePercentage {
    public static void main(String[] args) {
        int totalStudents = 5;
        int[][] marks = generateMarks(totalStudents);
        double[][] summary = calculateResult(marks);
        String[] grades = calculateGrades(summary);
        printReport(marks, summary, grades);
    }

    public static int[][] generateMarks(int totalStudents) {
        int[][] marks = new int[totalStudents][3];
        for (int index = 0; index < totalStudents; index++) {
            marks[index][0] = (int) (Math.random() * 101);
            marks[index][1] = (int) (Math.random() * 101);
            marks[index][2] = (int) (Math.random() * 101);
        }
        return marks;
    }

    public static double[][] calculateResult(int[][] marks) {
        double[][] summary = new double[marks.length][3];
        for (int row = 0; row < marks.length; row++) {
            int sum = marks[row][0] + marks[row][1] + marks[row][2];
            double avg = sum / 3.0;
            double percent = (sum / 300.0) * 100;
            summary[row][0] = sum;
            summary[row][1] = Math.round(avg * 100.0) / 100.0;
            summary[row][2] = Math.round(percent * 100.0) / 100.0;
        }
        return summary;
    }

    public static String[] calculateGrades(double[][] summary) {
        String[] grades = new String[summary.length];
        for (int i = 0; i < summary.length; i++) {
            double percentage = summary[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            }
            else if (percentage >= 70) {
                grades[i] = "B";
            }
            else if (percentage >= 60) {
                grades[i] = "C";
            }
            else if (percentage >= 50) {
                grades[i] = "D";
            }
            else if (percentage >= 40) {
                grades[i] = "E";
            }
            else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    public static void printReport(int[][] marks, double[][] summary, String[] grades) {
        System.out.println("ID  Phy  Chem  Math  Total  Avg  %  Grade");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                            marks[i][0] + "\t" +
                            marks[i][1] + "\t" +
                            marks[i][2] + "\t" +
                            (int) summary[i][0] + "\t" +
                            summary[i][1] + "\t" +
                            summary[i][2] + "\t" +
                            grades[i]
            );
        }
    }
}
