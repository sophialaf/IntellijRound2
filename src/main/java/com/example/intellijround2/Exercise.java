package com.example.intellijround2;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Exercise extends Application {
    @Override
    public void start(Stage primaryStage) {
        //create the window widgets
        Text label = new Text("Hello:");
        Button ButtonLeft = new Button("Button Left");
        Text textRight = new Text("Text Right");
        Button ButtonRight = new Button("Button Right");
        Text textLeft = new Text("Text Left");

        //create the panes
        FlowPane paneV = new FlowPane(Orientation.VERTICAL);
        FlowPane paneH1 = new FlowPane(Orientation.HORIZONTAL);
        FlowPane paneH2 = new FlowPane(Orientation.HORIZONTAL);

        // define the pane hierarchy
        paneV.getChildren().add(label);
        paneV.getChildren().add(paneH1);
        paneV.getChildren().add(paneH2);
        paneH1.getChildren().add(ButtonLeft);
        paneH1.getChildren().add(textRight);
        paneH2.getChildren().add(textLeft);
        paneH2.getChildren().add(ButtonRight);

        //set text font and color
        label.setFont(Font.font("Times new Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 40));

        label.setFill(Color.PINK);

        int pad = 50;
        paneV.setPadding(new Insets(pad));

        paneH1.setHgap(50);
        paneH2.setHgap(50);

        //create a new scene with parent node
        Scene scene = new Scene(paneV, 500, 100);

        //show the window
        primaryStage.setTitle("Exercise");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}