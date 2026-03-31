package Capgemini_Day9_Methods_Level3;

import java.util.Scanner;

public class StudentScoreCard {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int countOfStudents = myScan.nextInt();
        int[][] pcmMarks = generateMarks(countOfStudents);
        double[][] results = calculateResults(pcmMarks);
        displayScoreCard(pcmMarks, results);
    }
//    Here we generate random marks for Physics, Chemistry, and Maths for each student
    public static int[][] generateMarks(int students) {
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            marks[i][0] = 10 + (int) (Math.random() * 90); // Physics
            marks[i][1] = 10 + (int) (Math.random() * 90); // Chemistry
            marks[i][2] = 10 + (int) (Math.random() * 90); // Maths
        }
        return marks;
    }
//    Here we calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] marks) {
        double[][] result = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = roundTwoDigits(average);
            result[i][2] = roundTwoDigits(percentage);
        }
        return result;
    }
    
//    ----- Display Score Card -----
    public static void displayScoreCard(int[][] marks, double[][] results) {
        System.out.println("\nStu\tPhy\tChem\tMath\tTotal\tAvg\t\t%\tGrade");
        for (int i = 0; i < marks.length; i++) {
            String grade = calculateGrade(results[i][2]);
            System.out.println((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t\t" + marks[i][2] + "\t\t" + (int) results[i][0] + "\t\t" + results[i][1] + "\t" + results[i][2] + "\t" + grade);
        }
    }
    // Method to calculate grade based on percentage
    public static String calculateGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }
    // Method to round values to 2 digits
    public static double roundTwoDigits(double value) {
        return Math.round(value * 100.0) / 100.0; // Rounding to 2 decimal places
    }
}
