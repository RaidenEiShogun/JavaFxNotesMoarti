package com.example.javafxnotes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {
    private final ObservableList<String> tasks;

    public Model() {
        tasks = FXCollections.observableArrayList();
    }

    public ObservableList<String> getTasks() {
        return tasks;
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }
}