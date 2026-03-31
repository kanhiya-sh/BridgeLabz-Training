package BridgeLabz_Day28_ScenarioBased.ExamProctor;

import java.util.*;
class ExamSystem {
    private Stack<String> navigation = new Stack<>();
    private HashMap<String, String> answers = new HashMap<>();
    void visitQuestion(String qid) {
        navigation.push(qid);
        System.out.println("Visited Question : " + qid);
    }
    void saveAnswer(String qid, String answer) {
        answers.put(qid, answer);
        System.out.println("Answer Saved");
    }
    void submit() {
        int score = calculateScore();
        System.out.println("Exam Submitted");
        System.out.println("Score : " + score);
    }
    int calculateScore() {
        int score = 0;
        for (String ans : answers.values()) {
            if (!ans.isEmpty()) {
                score += 1;
            }
        }
        return score;
    }
}
