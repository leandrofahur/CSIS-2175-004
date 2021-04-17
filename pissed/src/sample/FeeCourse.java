package sample;

public class FeeCourse {
    private int ID;
    private String program;
    private String Course;
    private int Fee;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public int getFee() {
        return Fee;
    }

    public void setFee(int fee) {
        Fee = fee;
    }

    public FeeCourse(int ID, String program, String course, int fee) {
        this.ID = ID;
        this.program = program;
        Course = course;
        Fee = fee;
    }

    @Override
    public String toString() {
        return "FeeCourse{" +
                "ID=" + ID +
                ", program='" + program + '\'' +
                ", Course='" + Course + '\'' +
                ", Fee=" + Fee +
                '}';
    }
}
