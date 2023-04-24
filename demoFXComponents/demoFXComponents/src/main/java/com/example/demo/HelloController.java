package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.controlsfx.control.action.Action;

public class HelloController {
    @FXML
    private Label labelText;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField userName;
    @FXML
    private TextArea textInput;
    @FXML
    private Label outMes;

    @FXML
    protected void onHelloButtonClick(ActionEvent event) {
        labelText.setText("Saved!");
        System.out.println("user name is " + userName.getText());
        System.out.println("user password is " + passwordField.getText());
    }

    @FXML
    protected void oneSaveUserName(ActionEvent event) {
        String userInput = textInput.getText();
        System.out.println(userInput);
        outMes.setText(userInput);
    }

}