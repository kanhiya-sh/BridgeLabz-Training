package Capgemini_Day16_ScenarioBased;

import java.util.Scanner;

public class StudentScoreManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int totalStudents = sc.nextInt();
        if (totalStudents <= 0) {
            System.out.println("Student count must be greater than zero");
            return;
        }
        int[] marks = new int[totalStudents];
        int total = 0;
        System.out.println("Enter student scores:");
        for (int i = 0; i < marks.length; i++) {
            if (!sc.hasNextInt()) {
                System.out.println("Only numeric values allowed");
                return;
            }
            int value = sc.nextInt();
            if (value < 0) {
                System.out.println("Score cannot be negative");
                return;
            }
            marks[i] = value;
            total += value;
        }
        double avgScore = total / (double) marks.length;
        System.out.println("Average Score: " + avgScore);
        int maxScore = marks[0];
        int minScore = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > maxScore) {
                maxScore = marks[i];
            }
            if (marks[i] < minScore) {
                minScore = marks[i];
            }
        }
        System.out.println("Highest Score: " + maxScore);
        System.out.println("Lowest Score: " + minScore);
        System.out.print("Scores above average: ");
        boolean isAny = false;
        for (int score : marks) {
            if (score > avgScore) {
                System.out.print(score + " ");
                isAny = true;
            }
        }
        if (!isAny) {
            System.out.print("None");
        }
    }
}
