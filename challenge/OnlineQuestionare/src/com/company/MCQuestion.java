package com.company;

import java.util.ArrayList;

public class MCQuestion extends Question{
    private ArrayList<String> options;  // represents 3-5 options on the question
    private String answer;              // represents the correct answer (single character)

    public MCQuestion() {
        super();
    }

    public MCQuestion(String qText, String options, double point) {
        super();
        super.setqText(qText);
        super.setPoint(point);
        this.answer = options;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    // sets the answer for the question out of a list of options:
    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public double grade(String answer) {
        return 0.0;
    }

    public String getCorrectAnswer() {
        return "";
    }
}
