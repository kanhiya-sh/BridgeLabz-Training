package Capgemini_Day16_ScenarioBased;

class EduQuiz {
    int calculateScore(String[] correct, String[] student) {
        int score = 0;
        for (int i = 0; i < correct.length; i++) {
            if (correct[i].equalsIgnoreCase(student[i])) {
                System.out.println("Question " + (i + 1) + ": Correct");
                score++;
            }
            else {
                System.out.println("Question " + (i + 1) + ": Incorrect");
            }
        }
        return score;
    }
}

public class EduQuizStudentQuizGrader {
    public static void main(String[] args) {
        String[] correctAnswers = {"A","B","C","D","A","C","B","D","A","B"};
        String[] studentAnswers = {"a","b","c","a","a","c","b","d","a","b"};
        EduQuiz quiz = new EduQuiz();
        int score = quiz.calculateScore(correctAnswers, studentAnswers);
        double percentage = (score / 10.0) * 100;
        System.out.println("Score: " + score + "/10");
        System.out.println("Percentage: " + percentage + "%");
        if (percentage >= 50) {
            System.out.println("Result: PASS");
        }
        else {
            System.out.println("Result: FAIL");
        }
    }
}
