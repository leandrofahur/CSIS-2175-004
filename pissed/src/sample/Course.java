package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Course {
    private String courseOpted;
    private int fee;

    public Course(String courseOpted, int fee) {
        this.courseOpted = courseOpted;
        this.fee = fee;
    }

    public String getCourseOpted() {
        return courseOpted;
    }

    public void setCourseOpted(String courseOpted) {
        this.courseOpted = courseOpted;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
