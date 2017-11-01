package shrralis.fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("front.fxml"));
        Scene scene = new Scene(root, 650, 420);

        scene.getStylesheets().add(Main.class.getResource("bootstrap3.css").toExternalForm());
        primaryStage.setTitle("About info generator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
