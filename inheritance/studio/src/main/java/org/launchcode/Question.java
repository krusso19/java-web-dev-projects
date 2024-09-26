package org.launchcode;

import java.util.ArrayList;

public abstract class Question {
    private String question;
    private ArrayList answerChoices;
    private ArrayList correctAnswer;

    public Question(String question, ArrayList answerChoices, ArrayList correctAnswer){
        this.question = question;
        this.answerChoices = answerChoices;
        this.correctAnswer = correctAnswer;
    }
}