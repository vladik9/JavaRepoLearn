package com.example.todolist;

import com.example.todolist.dataModel.ToDoData;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @FXML
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("mainWindow.fxml"));
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        Scene scene = new Scene(fxmlLoader.load(), 1000, 300);
        stage.setTitle("Todo list!");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        try {
            ToDoData.getInstance().storeToDoItems();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void init() throws Exception {
        try {
            ToDoData.getInstance().loadToDoItems();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}