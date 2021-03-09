package com.company;

public class TFQuestion extends Question {
    private boolean answer;

    public TFQuestion() {
        super();
    }

    public TFQuestion(String qText, boolean answer, double point) {
        super();
        super.setqText(qText);
        super.setPoint(point);
        this.answer = answer;
    }

    public boolean getAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public double grade(String answer) {
        return 0.0;
    }

    public String getCorrectAnswer() {
        return "";
    }
}
