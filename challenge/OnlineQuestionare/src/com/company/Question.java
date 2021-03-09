package com.company;

public abstract class Question {
    private String qText;   // question text
    private double point;   // value of the question

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

    // return the amount of points of the question if the answer is correct
    public abstract double grade(String answer);

    public abstract String getCorrectAnswer();
}
