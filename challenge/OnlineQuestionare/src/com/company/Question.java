package com.company;

public abstract class Question {
    private String qText;
    private double point;

    public Question() {
        // ...
    }

    public Question(String qText) {
        this.qText = qText;
    }

    public String getqText() {
        return qText;
    }

    public void setqText(String qText) {
        this.qText = qText;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public abstract double grade(String answer);
    public abstract String getCorrectAnswer();
}
