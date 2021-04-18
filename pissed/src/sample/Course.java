package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Course {
    private SimpleStringProperty courseOpted;
    private SimpleIntegerProperty fee;

    public Course(String courseOpted, Integer fee) {
        this.courseOpted = new SimpleStringProperty(courseOpted);
        this.fee = new SimpleIntegerProperty(fee);
    }

    public StringProperty courseOptedProperty() {
        return courseOpted;
    }

    public IntegerProperty feeProperty() {
        return fee;
    }
}
