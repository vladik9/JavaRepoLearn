package com.example.uithread;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label labelId;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    String s = Platform.isFxApplicationThread() ? "UI thread" : "Background thread";
                    System.out.println("Currently on " + s);
                    Thread.sleep(5000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            String s = Platform.isFxApplicationThread() ? "UI thread" : "Background thread";
                            System.out.println("Currently on " + s);
                            labelId.setText("New label!");
                        }
                    });
                } catch (InterruptedException exception) {
                }
            }
        };
        new Thread(task).start();
    }

    @FXML
    private CheckBox checkBoxState;

    @FXML
    protected void checkButtonActions(ActionEvent event) {
        System.out.println(checkBoxState.isSelected());
    }
}