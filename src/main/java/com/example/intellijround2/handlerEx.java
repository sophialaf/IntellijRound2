package com.example.intellijround2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class handlerEx extends Application {
    @Override
    public void start(Stage primaryStage) {

        Button okButt = new Button("Okay");
        Button cancel = new Button("Cancel");

        FlowPane paneV = new FlowPane(Orientation.VERTICAL);

        paneV.getChildren().add(okButt);
        paneV.getChildren().add(cancel);

        Scene scene = new Scene(paneV, 200, 100);

        OKHandler handler1 = new OKHandler();
        okButt.setOnAction(handler1);
        cancel.setOnAction(handler1);

        //show the window
        primaryStage.setTitle("Trying it");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}

