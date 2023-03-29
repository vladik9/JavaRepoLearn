package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("hello-view.fxml"));
        stage.setTitle("Hello World!");
        stage.setScene(new Scene(fxmlLoader.load(), 320, 240));
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}