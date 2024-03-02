package com.example.javafxnotes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        view.getTaskListView().setItems(controller.getTasks());

        primaryStage.setScene(new Scene(view, 400, 300));
        primaryStage.setTitle("Task Manager");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
