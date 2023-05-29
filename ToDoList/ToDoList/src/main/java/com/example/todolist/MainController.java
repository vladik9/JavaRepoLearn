package com.example.todolist;

import com.example.todolist.dataModel.ToDoData;
import com.example.todolist.dataModel.ToDoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

public class MainController {
    private List<ToDoItem> toDoItems;
    @FXML
    private ListView<ToDoItem> todoListView;
    @FXML
    private TextArea itemDetailsTextArea;
    @FXML
    private Label dueData;
    @FXML
    private BorderPane mainBorderPane;
    @FXML
    private MenuItem newItemMenu;
    @FXML
    private MenuItem exitItemMenu;

    public void initialize() throws IOException {

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
        todoListView.setItems(ToDoData.getInstance().getToDoItems());
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();

    }

    public void controlMenuActions(ActionEvent e) {
        if (e.getSource() == newItemMenu) {
            Dialog<ButtonType> dialog = new Dialog<>();
            dialog.setTitle("Add new item");
            dialog.initOwner(mainBorderPane.getScene().getWindow());
            FXMLLoader fxmlPaneLoader = new FXMLLoader(getClass().getResource("dialogPane.fxml"));
            try {
                dialog.getDialogPane().setContent(fxmlPaneLoader.load());
            } catch (IOException ex) {
                System.out.println("Not able to load dialog");
                ex.printStackTrace();
                return;
            }
            dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
            dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

            Optional<ButtonType> result = dialog.showAndWait();

            if (result.isPresent() && result.get() == ButtonType.OK) {

                DialogController controller = fxmlPaneLoader.getController();
                ToDoItem newItem = controller.processResult();
                todoListView.getSelectionModel().select(newItem);
            }
        } else if (e.getSource() == exitItemMenu) {
            System.out.println("Close window");
        }
    }

}