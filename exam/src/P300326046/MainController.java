package P300326046;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    /*
     * @Description: Auxiliary attributes:
     */

    // Database:
    DatabaseManager databaseManager;
    ResultSet resultSet;

    /*
     * @Description: Auxiliary methods:
     */


    /*
     * @Description: Attributes for the javafx menu:
     */

    @FXML private TextField textField;
    @FXML private Label nameOfTheStudentLabel;
    @FXML private Label programOptedByTheStudentLabel;
    @FXML private ChoiceBox<String> courseEligibleChoiceBox;
    @FXML private Alert alert;

    /*
     * @Description: Methods for the javafx:
     */

    @FXML
    void onCloseBtnClick(ActionEvent event) throws Exception {
        databaseManager.CloseDB();
    }

    @FXML
    void onCourseOptedClick(ActionEvent event) {

    }

    @FXML
    void onFindClick() throws SQLException {
        if(textField.getText().isEmpty()) {
            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Student ID can not be Empty");
            alert.show();
        } else {

        }

    }

    @FXML
    void onTotalFeeBtnClick(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        databaseManager = new DatabaseManager("/Users/leandro/Desktop/le/douglas_college/CSIS_2175/exam/db/CSIS2175.accdb");
        try {
            databaseManager.ConnectDB();
            resultSet = databaseManager.QueryMethod("SELECT * FROM student");
            databaseManager.DisplayTableFromDB(resultSet);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

