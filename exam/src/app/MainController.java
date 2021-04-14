package app;

import javafx.fxml.Initializable;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    /*
     * @Description: Auxiliary attributes:
     */

    DatabaseManager databaseManager;
    ResultSet resultSet;

    /*
     * @Description: Auxiliary methods:
     */

    // ...

    /*
     * @Description: Attributes for the javafx menu:
     */

    // ...

    /*
     * @Description: Methods for the javafx:
     */

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        databaseManager = new DatabaseManager("/Users/leandro/Desktop/le/douglas_college/CSIS_2175/exam/db/Student.accdb");
        try {
            databaseManager.ConnectDB();
            resultSet = databaseManager.QueryMethod("SELECT * FROM mystudent");
            while(resultSet.next()) {
                System.out.println(resultSet.getString("StudentName") + "," + resultSet.getInt("Age") + "," + resultSet.getDouble("Percentage"));
            }

            databaseManager.QueryMethod("INSERT INTO mystudent(StudentName) VALUES('Lola')");

            resultSet = databaseManager.QueryMethod("SELECT * FROM mystudent");
            while(resultSet.next()) {
                System.out.println(resultSet.getString("StudentName") + "," + resultSet.getInt("Age") + "," + resultSet.getDouble("Percentage"));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
