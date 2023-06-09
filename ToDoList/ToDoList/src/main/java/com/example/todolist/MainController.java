package com.example.todolist;

import com.example.todolist.dataModel.ToDoData;
import com.example.todolist.dataModel.ToDoItem;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.util.Callback;
import javafx.collections.transformation.FilteredList;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

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
    @FXML
    private ContextMenu itemMenu;
    @FXML
    private Button newItemMenuButton;
    @FXML
    private ToggleButton filteringToggleButton;
    private FilteredList<ToDoItem> filteredList;
    private Predicate<ToDoItem> wantAllItems;
    private Predicate<ToDoItem> todayItems;


    public void initialize() throws IOException {
        itemMenu = new ContextMenu();
        MenuItem deleteMenuItem = new Menu("Delete");
        deleteMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ToDoItem item = todoListView.getSelectionModel().getSelectedItem();
                deleteItem(item);
            }
        });
        itemMenu.getItems().addAll(deleteMenuItem);
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
        filteredList = new FilteredList<ToDoItem>(ToDoData.getInstance().getToDoItems(), wantAllItems);
        // creating a sorted list for order the list based on deadLine
        SortedList<ToDoItem> sortedList = new SortedList<>(filteredList, new Comparator<ToDoItem>() {
            @Override
            public int compare(ToDoItem o1, ToDoItem o2) {
                return o1.getDeadLine().compareTo(o2.getDeadLine());
            }

        });

        wantAllItems = new Predicate<ToDoItem>() {
            @Override
            public boolean test(ToDoItem toDoItem) {
                return true;
            }
        };
        todayItems = new Predicate<ToDoItem>() {
            @Override
            public boolean test(ToDoItem toDoItem) {
                return toDoItem.getDeadLine().equals(LocalDate.now());
            }
        };

        todoListView.setItems(sortedList);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();
        todoListView.setCellFactory(new Callback<ListView<ToDoItem>, ListCell<ToDoItem>>() {
            @Override
            public ListCell<ToDoItem> call(ListView<ToDoItem> toDoItemListView) {
                return new ListCell<ToDoItem>() {
                    @Override
                    protected void updateItem(ToDoItem toDoItem, boolean empty) {
                        super.updateItem(toDoItem, empty);
                        if (empty) {
                            setText(null);
                        } else {
                            setText(toDoItem.getShortDescription());
                            if (toDoItem.getDeadLine().isBefore(LocalDate.now().plusDays(1))) {
                                setTextFill(Color.RED);
                            } else if (toDoItem.getDeadLine().equals(LocalDate.now().plusDays(1))) {
                                setTextFill(Color.BLUE);
                            } else {
                                setTextFill(Color.BLACK);
                            }


                        }
                        //lambda expression for checking and adding deleting an item
                        this.emptyProperty().addListener((obs, wasEmpty, isNowEmpty) -> {
                            if (isNowEmpty) {
                                this.setContextMenu(null);
                            } else {
                                this.setContextMenu(itemMenu);
                            }
                        });
                    }

                };

            }
        });

    }

    public void controlMenuActions(ActionEvent e) {
        if (e.getSource() == newItemMenu || e.getSource() == newItemMenuButton) {
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
            Platform.exit();
        } else if (e.getSource() == filteringToggleButton) {
            ToDoItem selectedItem = todoListView.getSelectionModel().getSelectedItem();
            if (filteringToggleButton.isSelected()) {
                filteredList.setPredicate(todayItems);
                if (filteredList.isEmpty()) {
                    itemDetailsTextArea.clear();
                    dueData.setText("");
                } else if (filteredList.contains(selectedItem)) {
                    todoListView.getSelectionModel().select(selectedItem);
                } else {
                    todoListView.getSelectionModel().selectFirst();
                }
            } else {
                filteredList.setPredicate(wantAllItems);
                todoListView.getSelectionModel().select(selectedItem);
            }
        }
    }

    public void deleteItem(ToDoItem item) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Do you really want to delete it?");
        alert.setHeaderText("Delete item:  " + item.getShortDescription());
        alert.setContentText("Are you sure? : ok-to delete, back-to cancel");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            ToDoData.getInstance().deleteTodoItem(item);

        }
    }

    public void handleKeyPress(KeyEvent event) {
        ToDoItem selectedItem = todoListView.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            if (event.getCode().equals(KeyCode.DELETE)) {
                deleteItem(selectedItem);
            }
        }
    }
 
}