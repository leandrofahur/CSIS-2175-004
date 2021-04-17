package sample;

public class Student {
    private int ID;
    private String studentName;
    private String program;
    private int semester;
    private String gender;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student(int ID, String studentName, String program, int semester, String gender) {
        this.ID = ID;
        this.studentName = studentName;
        this.program = program;
        this.semester = semester;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", studentName='" + studentName + '\'' +
                ", program='" + program + '\'' +
                ", semester=" + semester +
                ", gender='" + gender + '\'' +
                '}';
    }
}
