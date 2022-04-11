package com.example.intellijround2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class MyJavaFX extends Application{
    @Override
    public void start(Stage primaryStage){
        Button btOK = new Button("Bees");
        Scene scene = new Scene(btOK, 2000, 250);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        Application.launch(args);
    }
}
