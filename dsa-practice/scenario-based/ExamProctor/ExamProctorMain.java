package BridgeLabz_Day28_ScenarioBased.ExamProctor;

import java.util.*;
public class ExamProctorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExamSystem exam = new ExamSystem();
        int choice;
        do {
            System.out.println("\n1.Visit Question");
            System.out.println("2.Answer Question");
            System.out.println("3.Submit Exam");
            System.out.println("0.Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Question ID: ");
                    exam.visitQuestion(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Question ID: ");
                    String qid = sc.nextLine();
                    System.out.print("Answer: ");
                    String ans = sc.nextLine();
                    exam.saveAnswer(qid, ans);
                    break;

                case 3:
                    exam.submit();
                    break;

                case 0:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
        while (choice != 0);
    }
}
