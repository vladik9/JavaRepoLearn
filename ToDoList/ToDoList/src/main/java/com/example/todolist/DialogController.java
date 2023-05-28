package com.example.todolist;

import com.example.todolist.dataModel.ToDoData;
import com.example.todolist.dataModel.ToDoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {
    @FXML
    private DialogPane dialogPane;
    @FXML
    private TextField shortDescription;
    @FXML
    private TextArea detailsArea;
    @FXML
    private DatePicker dueDatePicker;


    public void processResult() {
        String description = shortDescription.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate dueDate = dueDatePicker.getValue();

        ToDoData.getInstance().addToDoItem(new ToDoItem(description, details, dueDate));

    }
}
