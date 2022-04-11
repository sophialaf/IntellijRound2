package com.example.intellijround2;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.concurrent.Flow;

public class Graph extends Application {
    @Override
    public void start(Stage primaryStage) {
        //create the window widgets
        Text label = new Text("Choose one option");
        Button ButtonOk = new Button("Okay");
        Button ButtonCancel = new Button("Cancel");

        //create the panes
        FlowPane paneV = new FlowPane(Orientation.VERTICAL);
        FlowPane paneH = new FlowPane(Orientation.HORIZONTAL);

        // define the pane hierarchy
        paneV.getChildren().add(label);
        paneV.getChildren().add(paneH);
        paneH.getChildren().add(ButtonOk);
        paneH.getChildren().add(ButtonCancel);

        //create a new scene with parent node
        Scene scene = new Scene(paneV, 200, 50);

        //show the window
        primaryStage.setTitle("Button in a pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
