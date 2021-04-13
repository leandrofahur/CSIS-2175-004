package application;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

public class loginController implements Initializable {
	  
		ObjectOutputStream ob;
		
		@FXML
	    private PasswordField pwd;
		@FXML
	    private Label qual;
	    @FXML
	    private Label mygender;
	    @FXML
	    private TextField myname;
	    @FXML
	    private Label mydob;
	    @FXML
	    private Button find;
	    @FXML
	    private Button myclear;
	    @FXML
	    private AnchorPane frame;
	    @FXML
	    private TextField user;	
	    @FXML
	    private Button login;
	    @FXML
	    private Button clear;
	    @FXML
	    private Button exit;	
	    @FXML
	    private TextField sname;	
	    @FXML
	    private ChoiceBox<String> qualification;	
	    @FXML
	    private RadioButton sgender;
	    @FXML
	    private ToggleGroup Gender;
	    @FXML
	    private DatePicker sdob;
	    @FXML
	    private Button add;
	    @FXML
	    private Button close;
	    
	    @FXML
	    void ClearScreen(ActionEvent event) {
	    		user.clear();
	    }
//To check login credentials
	    @FXML
	    void checkLogin(ActionEvent event) {//If login is successful
	    	if(user.getText().equals("CSIS2175") && pwd.getText().equals("2175"))
	    	{
    		Alert a=new Alert(AlertType.INFORMATION);
    		a.setTitle("Successful Login");
    		a.setHeaderText(null);
    		a.setContentText("Congratulations "+user.getText());
    		a.showAndWait();
    		Stage stage = (Stage) frame.getScene().getWindow();
    		stage.close();
    	
    		
    		Stage primaryStage=new Stage();
			Parent root = null;
			try {
				root = FXMLLoader.load(getClass().getResource("WindowNew.fxml"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Scene scene=new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
    		
    	}
    	else
    		if(user.getText().trim().isEmpty() || pwd.getText().trim().isEmpty())
    		{
    			Alert a=new Alert(AlertType.INFORMATION);
        		a.setTitle("Missing Login");
        		a.setHeaderText(null);
        		a.setContentText("Missing user name");
        		a.showAndWait();
    		}
    		else
    		{
    			Alert a=new Alert(AlertType.INFORMATION);
        		a.setTitle("UnSuccessful Login");
        		a.setHeaderText(null);
        		a.setContentText("Sorry wrong user name or passwprd");
        		a.showAndWait();
    		}
    }

    @FXML
    void getout(ActionEvent event) {
    	Platform.exit();
    }
    //List to be displayed in Choicebox
    private ObservableList<String> credentials = FXCollections.observableArrayList("P.Eng","BTech","BA");
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try
		{
			//Populate choice box
			qualification.getItems().addAll(credentials);
			qualification.setValue("PhD");}
			catch(NullPointerException e)
			{
				e.getMessage();
			
		}
	try {
		FileOutputStream fp=new FileOutputStream("Person.bin");
		ob=new ObjectOutputStream(fp); 
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	}
    @FXML
    void onadd(ActionEvent event) {
    	String name1=sname.getText();
    	String qualification1=qualification.getSelectionModel().getSelectedItem();
    	LocalDate dob1=sdob.getValue();
    	String gender1;
    	if(sgender.isSelected())
    		gender1="male";
    	else
    		gender1="female";
    	Person p=new Person(name1,qualification1,gender1,dob1);
    	try {
			ob.writeObject(p);
			sname.clear();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }

    @FXML
    void onclose(ActionEvent event) {
try {
	ob.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
    }
    
    @FXML
    void Onfind(ActionEvent event) {
    	sname.getText();
    	Person p=null;
    	FileInputStream fin;
    	try {
			fin=new FileInputStream("Person.bin");
			ObjectInputStream ois=new ObjectInputStream(fin);
			while(fin.available()>0)
			{
				try {
					p=(Person)ois.readObject();
					if(p.getName().equals(myname.getText()))
					{
						mydob.setText(p.getDob().toString());
						mygender.setText(p.getGender());
						qual.setText(p.getQualification());
						
					}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	

    }
    @FXML
    void onmyclear(ActionEvent event) {

    }
}
