package BridgeLabz_Day18_ScenarioBased;

import java.util.*;

class InvalidQuizSubmissionException extends Exception {
    public InvalidQuizSubmissionException(String message) {
        super(message);
    }
}
public class OnlineQuizPlatform {
    public static void main(String[] args) {
        String[] correctAnswers = {"A", "B", "C", "D", "A"};
        String[] user1Answers = {"A", "B", "C", "D", "B"};
        String[] user2Answers = {"A", "C", "C", "B", "A"};
        ArrayList<Integer> scores = new ArrayList<>();
        try {
            int score1 = calculateScore(correctAnswers, user1Answers);
            scores.add(score1);
            System.out.println("User 1 Score is : " + score1);
            System.out.println("User 1 Grade is : " + getGrade(score1));
// now calculating score for user 2
            int score2 = calculateScore(correctAnswers, user2Answers);
            scores.add(score2);
            System.out.println("User 2 Score: " + score2);
            System.out.println("User 2 Grade: " + getGrade(score2));

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Scores of all users are : " + scores);
    }
    public static int calculateScore(String[] correct, String[] user) throws InvalidQuizSubmissionException {
        if (correct.length != user.length) {
            throw new InvalidQuizSubmissionException("Answer length mismatch");
        }
        int score = 0;
        for (int i = 0; i < correct.length; i++) {
            if (correct[i].equalsIgnoreCase(user[i])) {
                score++;
            }
        }
        return score;
    }
    public static String getGrade(int score) {
        if (score >= 8) return "A";
        if (score >= 5) return "B";
        return "C";
    }
}
