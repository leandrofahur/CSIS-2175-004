package app;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    /*
     * @Description: Attributes related to the GUI:
     */

    // Button:
    @FXML private Button addBtn;
    @FXML private Button deleteBtn;
    @FXML private Button searchBtn;
    @FXML private Button saveBtn;
    @FXML private Button deleteAllBtn;
    @FXML private Button loadBtn;

    // TextField:
    @FXML private TextField taskTextField;
    @FXML private TextField filterTaskTextField;

    // ListView:
    @FXML private ListView<String> listView;

    /*
     * @Description: Methods related to the GUI attributes:
     */

    public void onAddBtnClicked() {

    }

    public void onDeleteBtnClicked() {

    }

    public void onSearchBtnClicked() {

    }

    public void onSaveBtnClicked() {

    }

    public void onDeleteAllBtnClicked() {

    }

    public void onLoadBtnClicked() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
