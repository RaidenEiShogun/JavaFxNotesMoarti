package com.example.javafxnotes;

import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class View extends BorderPane {

    private final TextField taskInputField;
    private final Button addButton;
    private final ListView<String> taskListView;
    private final Button deleteButton;
    private final Button editButton;

    public View() {
        taskInputField = new TextField();
        addButton = new Button("Ok");
        HBox inputBox = new HBox(taskInputField, addButton);
        inputBox.setSpacing(10);
        inputBox.setPadding(new Insets(10));

        taskListView = new ListView<>();
        deleteButton = new Button("Delete");
        editButton = new Button("Edit");
        HBox buttonBox = new HBox(deleteButton, editButton);
        buttonBox.setSpacing(10);
        buttonBox.setPadding(new Insets(10));

        setTop(inputBox);
        setCenter(taskListView);
        setBottom(buttonBox);
    }

    public TextField getTaskInputField() {
        return taskInputField;
    }

    public Button getAddButton() {
        return addButton;
    }

    public ListView<String> getTaskListView() {
        return taskListView;
    }

    public Button getDeleteButton() {
        return deleteButton;
    }

    public Button getEditButton() {
        return editButton;
    }
}
