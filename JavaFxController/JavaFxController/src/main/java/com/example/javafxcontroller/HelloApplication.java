package com.example.javafxcontroller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("hello-view.fxml"));


        Scene scene = new Scene(loader.load(), 320, 240);
        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}