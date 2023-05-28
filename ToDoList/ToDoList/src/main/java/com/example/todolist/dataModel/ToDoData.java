package com.example.todolist.dataModel;


import javafx.collections.FXCollections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

public class ToDoData {

    private static ToDoData instance = new ToDoData();
    private static String fileName = "ToDoItems.txt";


    private List<ToDoItem> toDoItems;
    private DateTimeFormatter formatter;


    private ToDoData() {
        formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    }

    public static ToDoData getInstance() {
        return instance;
    }

    public List<ToDoItem> getToDoItems() {
        return toDoItems;
    }

    public void setToDoItems(List<ToDoItem> toDoItems) {
        this.toDoItems = toDoItems;

    }

    public List<ToDoItem> getTodoItems() {
        return toDoItems;
    }

    public void addToDoItem(ToDoItem item) {
        System.out.println("Adding " +
                item.getDetails() +
                item.getShortDescription() +
                item.getDeadLine());
        toDoItems.add(item);
    }

    public void loadToDoItems() throws IOException {

        toDoItems = FXCollections.observableArrayList();
        Path path = Paths.get(fileName);
        BufferedReader br = Files.newBufferedReader(path);
        String input;
        try {
            while ((input = br.readLine()) != null) {
                String[] itemsPieces = input.split("\t");
                String shortDescription = itemsPieces[0];
                String details = itemsPieces[1];
                String date = itemsPieces[2];
                LocalDate deadLine = LocalDate.parse(date, formatter);
                ToDoItem item = new ToDoItem(shortDescription, details, deadLine);
                toDoItems.add(item);
            }
        } finally {
            if (br != null) {
                br.close();
            }
        }

    }

    public void storeToDoItems() throws IOException {
        Path path = Paths.get(fileName);
        BufferedWriter bw = Files.newBufferedWriter(path);

        try {
            Iterator<ToDoItem> it = toDoItems.iterator();

            while (it.hasNext()) {
                ToDoItem item = it.next();
                bw.write(String.format("%s\t%s\t%s", item.getShortDescription().toLowerCase(),
                        item.getDetails(), item.getDeadLine().format(formatter)));
                bw.newLine();
            }
        } finally {
            if (bw != null) {
                bw.close();
            }
        }


    }


}
