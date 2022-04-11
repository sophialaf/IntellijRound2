package com.example.intellijround2;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class tryingLambda extends Application {
    @Override
    public void start(Stage primaryStage){
        Button b = new Button();
        Button hi = new Button("hi");
        b.setText("bye");

        hi.setOnAction(e -> System.out.println("hi"));
        b.setOnAction(e -> System.out.println("Bye"));

        HBox pane = new HBox();
        pane.getChildren().add(b);
        pane.getChildren().add(hi);

        Scene scene = new Scene(pane, 50, 50);
        primaryStage.setTitle("Trying it");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
