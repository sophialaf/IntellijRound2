package com.example.intellijround2;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class gridPanePractice extends Application{
    @Override
    public void start(Stage primaryStage) {
        //create the window widgets
        Text label = new Text("ShowGridPane");
        Text name = new Text("Name:");
        Button nameButton = new Button("Update name");
        Text date = new Text("Date:");
        Button dateFormat = new Button("dd/mm/yyyy");

        GridPane pane = new GridPane();

        pane.add(label, 0, 0);
        pane.add(name, 10, 0);
        pane.add(date, 20, 0);
        pane.add(nameButton, 10, 10);
        pane.add(dateFormat, 20, 20);

        FlowPane paneV = new FlowPane(Orientation.VERTICAL);

        //create a new scene with parent node
        Scene scene = new Scene(paneV, 500, 500);

        //show the window
        primaryStage.setTitle("Trying it");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
