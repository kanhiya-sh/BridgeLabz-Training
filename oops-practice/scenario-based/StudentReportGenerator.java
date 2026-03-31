package BridgeLabz_Day18_ScenarioBased;

import java.util.*;

class InvalidMarkException extends Exception { // here we defining a custom exception for invalid marks
    InvalidMarkException(String msg) {
        super(msg);
    }
}
public class StudentReportGenerator {
    public static void main(String[] args) {
        String[] subjects = {"Maths", "Science", "English"};
        int[] marks1 = {85, 70, 90};
        int[] marks2 = {60, 55, 65};
        ArrayList<String> studentRecords = new ArrayList<>();
        try {
            // Student 1
            validateMarks(marks1);
            double avg1 = calculateAverage(marks1);
            String grade1 = getGrade(avg1);
            studentRecords.add("Bhavy - " + grade1);
            displayReport("Bhavy", subjects, marks1, avg1, grade1);
            // now for Student 2
            validateMarks(marks2);
            double avg2 = calculateAverage(marks2);
            String grade2 = getGrade(avg2);
            studentRecords.add("Naman - " + grade2);
            displayReport("Naman", subjects, marks2, avg2, grade2);

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Final Student Records are : " + studentRecords);
    }
    public static void validateMarks(int[] marks) throws InvalidMarkException {
        for (int m : marks) { // this loop will check if marks are between 0 and 100 if not it will throw exception
            if (m < 0 || m > 100) {
                throw new InvalidMarkException("Marks must be between 0 and 100");
            }
        }
    }
    public static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum / (double) marks.length;
    }
    public static String getGrade(double avg) {
        if (avg >= 80) return "A";
        if (avg >= 60) return "B";
        if (avg >= 40) return "C";
        return "Fail";
    }
    public static void displayReport(String name, String[] subjects, int[] marks, double avg, String grade) {
        System.out.println("******** Report Card ********");
        System.out.println("Student Name : " + name);
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + " : " + marks[i]);
        }
        System.out.println("Average : " + avg);
        System.out.println("Grade   : " + grade);
        System.out.println("*****************************");
    }
}
