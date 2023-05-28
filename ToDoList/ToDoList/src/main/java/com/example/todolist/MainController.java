package com.example.todolist;

import com.example.todolist.dataModel.ToDoData;
import com.example.todolist.dataModel.ToDoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
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
//        ToDoItem item1 = new ToDoItem("Buy some stuff", "Go to store and buy it.",
//                LocalDate.of(2023, Month.APRIL, 25));
//
//        ToDoItem item2 = new ToDoItem("Do dishes", "Clear All",
//                LocalDate.of(2023, Month.APRIL, 26));
//
//        ToDoItem item3 = new ToDoItem("Make clean", "Clean apartment.",
//                LocalDate.of(2023, Month.APRIL, 27));
//
//        ToDoItem item4 = new ToDoItem("Go in vacation", "Select a place for vacation",
//                LocalDate.of(2023, Month.APRIL, 20));
//        toDoItems = new ArrayList<ToDoItem>();
//
//        toDoItems.add(item1);
//        toDoItems.add(item2);
//        toDoItems.add(item3);
//        toDoItems.add(item4);
        //storing list

//        ToDoData.getInstance().setToDoItems(toDoItems);
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

//        todoListView.getItems().setAll(toDoItems);
        todoListView.getItems().setAll(ToDoData.getInstance().getToDoItems());
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();


    }

//    @FXML
//       old implementation for view toDoItem
//    public void handleClickListView() {
//        ToDoItem selectedItem = todoListView.getSelectionModel().getSelectedItem();
//        StringBuilder sb = new StringBuilder(selectedItem.getDetails());
//        itemDetailsTextArea.setText(selectedItem.getDetails());
//
//        sb.append("\n\n\n\n");
//        sb.append("Due: ");
//        sb.append(selectedItem.getDeadLine().toString());
//        itemDetailsTextArea.setText(sb.toString());
//    }

    public void controlMenuActions(ActionEvent e) {
        if (e.getSource() == newItemMenu) {
            Dialog<ButtonType> dialog = new Dialog<>();
            dialog.initOwner(mainBorderPane.getScene().getWindow());
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("dialogPane.fxml"));
            try {
                dialog.getDialogPane().setContent(fxmlLoader.load());
//                Parent root = FXMLLoader.load(getClass().getResource("dialogPane.fxml"));
//                dialog.getDialogPane().setContent(root);
            } catch (IOException ex) {
                System.out.println("Not able to load dialog");
                ex.printStackTrace();
                return;
            }
            dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
            dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

            Optional<ButtonType> result = dialog.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
                System.out.println(" Ok pressed");
                DialogController controller = fxmlLoader.getController();
                controller.processResult();
                todoListView.getItems().setAll(ToDoData.getInstance().getToDoItems());

            } else {
                System.out.println("Cancel pressed");
            }
        } else if (e.getSource() == exitItemMenu) {
            System.out.println("Close window");
        }
    }

}