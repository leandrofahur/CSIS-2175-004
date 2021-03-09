package com.company;

import java.util.ArrayList;

public class MCQuestion extends Question{
    private ArrayList<String> options;
    private String answer;

    public MCQuestion() {
        //...
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
