package app;

import javafx.fxml.Initializable;

import java.io.FileNotFoundException;
import java.net.URL;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    /*
     * @Description: Auxiliary attributes:
     */

    // Database:
    // DatabaseManager databaseManager;
    // ResultSet resultSet;

    /*
     * @Description: Auxiliary methods:
     */


    /*
     * @Description: Attributes for the javafx menu:
     */

    // ...

    /*
     * @Description: Methods for the javafx:
     */

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        /* If I need to use a database:
        databaseManager = new DatabaseManager("/Users/leandro/Desktop/le/douglas_college/CSIS_2175/exam/db/Student.accdb");
        try {
            databaseManager.ConnectDB();

            resultSet = databaseManager.QueryMethod("SELECT * FROM mystudent");
            databaseManager.QueryMethod("INSERT INTO mystudent(StudentName,age,Percentage) VALUES('Lola',25,99)");

            resultSet = databaseManager.QueryMethod("SELECT * FROM mystudent");
            databaseManager.DisplayTableFromDB(resultSet);

            databaseManager.CloseDB();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        */

        try {
            FileIO fileIO = new FileIO("/Users/leandro/Desktop/le/douglas_college/CSIS_2175/exam/src/app/test.txt");
            fileIO.ReadFile();
            ArrayList<String> columnArrayList = fileIO.GetColumn(0);
//            for(String column : columnArrayList) {
//                System.out.println(column);
//            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
