package com.example.todolist;

import com.example.todolist.dataModel.ToDoItem;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class HelloController {
    private List<ToDoItem> toDoItems;
    @FXML
    private ListView<ToDoItem> todoListView;
    @FXML
    private TextArea itemDetailsTextArea;

    public void initialize() {
        ToDoItem item1 = new ToDoItem("Buy some stuff", "Go to store and buy it.",
                LocalDate.of(2023, Month.APRIL, 25));

        ToDoItem item2 = new ToDoItem("Do dishes", "Clear All",
                LocalDate.of(2023, Month.APRIL, 26));

        ToDoItem item3 = new ToDoItem("Make clean", "Clean apartment.",
                LocalDate.of(2023, Month.APRIL, 27));

        ToDoItem item4 = new ToDoItem("Go in vacation", "Select a place for vacation",
                LocalDate.of(2023, Month.APRIL, 20));
        toDoItems = new ArrayList<ToDoItem>();

        toDoItems.add(item1);
        toDoItems.add(item2);
        toDoItems.add(item3);
        toDoItems.add(item4);
        todoListView.getItems().setAll(toDoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

    }

    @FXML
    public void handleClickListView() {
        ToDoItem selectedItem = todoListView.getSelectionModel().getSelectedItem();
        StringBuilder sb = new StringBuilder(selectedItem.getDetails());
        itemDetailsTextArea.setText(selectedItem.getDetails());

        sb.append("\n\n\n\n");
        sb.append("Due: ");
        sb.append(selectedItem.getDeadLine().toString());
        itemDetailsTextArea.setText(sb.toString());


    }


}