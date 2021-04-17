package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    /*
     * @Description: Auxiliary attributes:
     */

    // Database:
    private DatabaseManager databaseManager;
    private ResultSet resultSet;

    // Classes:
    private ArrayList<Student> arrayListStudent = new ArrayList<>();
    private ArrayList<FeeCourse> arrayListFeeCourse = new ArrayList<>();
    private ObservableList<String> options;
    private String state;

    /*
     * @Description: Auxiliary methods:
     */

    public void setState(String state) {
        this.state = state;
    }

    /*
     * @Description: Attributes for the javafx menu:
     */

    @FXML private TextField textField;
    @FXML private Label nameOfTheStudentLabel;
    @FXML private Label programOptedByTheStudentLabel;
    @FXML private ChoiceBox<String> courseEligibleChoiceBox;
    @FXML private Alert alert;
    @FXML private Button closeBtn;
    @FXML private TableView tableView;
    @FXML private TableColumn courseColumn;
    @FXML private TableColumn feeColumn;

    /*
     * @Description: Methods for the javafx:
     */

    @FXML void onCloseBtnClick() throws Exception {
        databaseManager.CloseDB();
        Stage stage = (Stage) this.closeBtn.getScene().getWindow();
        stage.close();
    }

    @FXML void onCourseOptedClick() {
        for(int i = 0; i < arrayListFeeCourse.size(); i++) {
            if(arrayListFeeCourse.get(i).getCourse().equals(state)) {
                Course course = new Course(state,arrayListFeeCourse.get(i).getFee());
                tableView.getItems().add(course);
            }
        }

    }

    @FXML void onFindClick() throws SQLException {
        this.courseEligibleChoiceBox.getItems().clear();
        ArrayList<Integer> arrayListID = new ArrayList<>();
        ArrayList<String> arrayListCourse = new ArrayList<>();
        arrayListStudent.forEach(student -> {
            arrayListID.add(student.getID());
        });

        if(textField.getText().isEmpty()) {
            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Student ID can not be Empty");
            alert.show();
        }
        else  {
            boolean hasID = false;
            int index = 0;
            for(int i = 0; i < arrayListID.size(); i++) {
                if(textField.getText().equals(arrayListID.get(i).toString())) {
                    hasID = true;
                    index = i;
                    break;
                }
            }
            if(hasID) {
                this.nameOfTheStudentLabel.setText(arrayListStudent.get(index).getStudentName());
                this.programOptedByTheStudentLabel.setText(arrayListStudent.get(index).getProgram());

                String program = arrayListStudent.get(index).getProgram();

                for (int i=0; i < arrayListFeeCourse.size(); i++) {
                    if(program.equals(arrayListFeeCourse.get(i).getProgram())) {
                        arrayListCourse.add(arrayListFeeCourse.get(i).getCourse());
                    }
                }
                this.options = FXCollections.observableArrayList(arrayListCourse);
                this.courseEligibleChoiceBox.getItems().addAll(this.options);
            } else {
                alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Student ID can not be Empty");
                alert.show();
            }
        }
    }

    @FXML void onTotalFeeBtnClick() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Add event listeners to keep track on variable change for the choice box:
        courseEligibleChoiceBox.getSelectionModel().selectedItemProperty().addListener((value, oldValue, newValue)->{setState(newValue);});

        this.tableView = new TableView();

        this.courseColumn = new TableColumn("Course Opted");
        this.courseColumn.setCellFactory(new PropertyValueFactory<>("courseOpted"));

        this.feeColumn = new TableColumn("Fee ($)");
        this.feeColumn.setCellFactory(new PropertyValueFactory<>("fee"));

        tableView.getColumns().addAll(courseColumn,feeColumn);


        try {
            // Related to Student:
            databaseManager = new DatabaseManager("/Users/leandro/Desktop/le/douglas_college/CSIS_2175/exam/db/CSIS2175.accdb");
            databaseManager.ConnectDB();
            resultSet = databaseManager.QueryMethod("SELECT * FROM student");

            if(this.resultSet != null) {
                while (this.resultSet.next()) {
                    if(this.resultSet != null) {
                        int ID = resultSet.getInt("ID");
                        String studentName = resultSet.getString("StudentName");
                        String program = resultSet.getString("Program");
                        int semester = resultSet.getInt("Semester");
                        String gender = resultSet.getString("Gender");
                        Student student = new Student(ID,studentName, program, semester, gender);
                        arrayListStudent.add(student);
                    }
                }
            }

            // databaseManager.DisplayTableFromDB(arrayListStudent);

            // Related to FeeCourse:
            resultSet = databaseManager.QueryMethod("SELECT * FROM feecourse");

            if(this.resultSet != null) {
                while (this.resultSet.next()) {
                    if(this.resultSet != null) {
                        int ID = resultSet.getInt("ID");
                        String program = resultSet.getString("Program");
                        String course = resultSet.getString("Course");
                        int fee = resultSet.getInt("Fee");
                        FeeCourse feeCourse = new FeeCourse(ID,program, course, fee);
                        arrayListFeeCourse.add(feeCourse);
                    }
                }
            }

            // databaseManager.DisplayTableFromDB(arrayListFeeCourse);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}