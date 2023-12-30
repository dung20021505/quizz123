package com.example.quizz2;

import java.io.Serializable;



public class QuestionItem implements Serializable {

    private String questionText;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private String correct;

    public QuestionItem(String questionText, String answerA, String answerB, String answerC, String answerD, String correct) {
        this.questionText = questionText;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correct = correct;
    }

    // Thêm các phương thức get
    public String getQuestionText() {
        return questionText;
    }

    public String getAnswerA() {
        return answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public String getAnswerD() {
        return answerD;
    }

    public String getCorrectAnswer() {return correct;}

}
