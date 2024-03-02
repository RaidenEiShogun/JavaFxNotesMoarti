package com.example.javafxnotes;

import javafx.collections.ObservableList;

public class Controller {

    private final Model model;
    private final View view;
    private boolean isEditing = false;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        attachEvents();
    }

    private void attachEvents() {
        view.getAddButton().setOnAction(e -> {
            String task = view.getTaskInputField().getText();
            model.addTask(task);
            view.getTaskInputField().clear();
        });

        view.getDeleteButton().setOnAction(e -> {
            String selectedTask = view.getTaskListView().getSelectionModel().getSelectedItem();
            if (selectedTask != null) {
                model.removeTask(selectedTask);
            }
        });

        view.getEditButton().setOnAction(e -> {
            isEditing = !isEditing;
            if(isEditing) {
                view.getEditButton().setText("Done");
                view.getTaskInputField().setEditable(true);
                view.getTaskInputField().setStyle("-fx-background-color: white;");
            } else {
                view.getEditButton().setText("Edit");
                int selectedIndex = view.getTaskListView().getSelectionModel().getSelectedIndex();
                if (selectedIndex >= 0) {
                    String editedTask = view.getTaskInputField().getText();
                    model.getTasks().set(selectedIndex, editedTask);
                }
                view.getTaskInputField().setEditable(false);
                view.getTaskInputField().setStyle("-fx-background-color: transparent;");
            }
        });

        view.getTaskListView().getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                view.getTaskInputField().setText(newValue);
            }
        });
    }

    public ObservableList<String> getTasks() {
        return model.getTasks();
    }
}
