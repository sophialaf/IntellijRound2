package com.example.intellijround2;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class InputExercice extends Application {
    @Override
    public void start(Stage primaryStage) {
        //Create the window widgets
        Text textName = new Text("Name:");
        Text textAge = new Text("Age:");
        Text textNationnality = new Text("Nationnality:");
        Button submit = new Button("Submit");
        TextField fieldName = new TextField();
        TextField fieldAge = new TextField();
        TextField fieldNationnality = new TextField();

        //Create the pane
        GridPane pane = new GridPane();

        //Create a new scene with a parent node
        Scene scene = new Scene(pane, 800, 500);

        //Show the window
        primaryStage.setTitle("Exercise");
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.add(textName , 0, 0);
        pane.add(textAge , 0, 1);
        pane.add(textNationnality , 0, 2);
        pane.add(fieldName , 1, 0);
        pane.add(fieldAge , 1, 1);
        pane.add(fieldNationnality , 1, 2);
        pane.add(submit , 1, 3);

        GridPane.setHalignment(submit, HPos.RIGHT);
        pane.setVgap(10);
        pane.setHgap(10);
        int pad = 30;
        pane.setPadding(new Insets(pad));

        textName.setFill(Color.DEEPPINK);
        textAge.setFill(Color.DEEPPINK);
        textNationnality.setFill(Color.DEEPPINK);
    }
}
