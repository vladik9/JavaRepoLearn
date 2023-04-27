package com.example.todolist;

import com.example.todolist.dataModel.ToDoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HelloController {
    private List<ToDoItem> toDoItems;
    @FXML
    private ListView<ToDoItem> todoListView;
    @FXML
    private TextArea itemDetailsTextArea;
    @FXML
    private Label dueData;

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

        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ToDoItem>() {
            @Override
            public void changed(ObservableValue<? extends ToDoItem> observableValue, ToDoItem oldItem, ToDoItem newItem) {
                if (newItem != null) {
                    ToDoItem selectedItem = todoListView.getSelectionModel().getSelectedItem();
                    itemDetailsTextArea.setText(selectedItem.getDetails().toString());
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
                    dueData.setText(dateTimeFormatter.format(selectedItem.getDeadLine()));
                }
            }
        });
        todoListView.getItems().setAll(toDoItems);
        System.out.println(toDoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();


    }

    public void stop() {
    }

//
//    @FXML
//    public void handleClickListView() {
//        ToDoItem selectedItem = todoListView.getSelectionModel().getSelectedItem();
//        itemDetailsTextArea.setText(selectedItem.getDetails().toString());
//        dueData.setText(selectedItem.getDeadLine().toString());
//
//
//    }


}