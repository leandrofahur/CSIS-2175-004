package P300326046;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Q1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("app.fxml"));
        primaryStage.setTitle("Q1 Window");
        primaryStage.setScene(new Scene(root, 443, 565));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
