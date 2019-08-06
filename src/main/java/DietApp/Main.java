package DietApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        BorderPane borderPane = FXMLLoader.load(getClass().getResource("/fxml/MainScene.fxml"));
        Scene scene = new Scene(borderPane);
        stage.setScene(scene);
        stage.setTitle("Diet");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}