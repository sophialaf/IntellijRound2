package com.example.intellijround2;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class ShowGridPane extends Application {
    @Override
    public void start(Stage primaryStage) {
        Text textName = new Text("Name: ");
        TextField fieldName = new TextField();
        Text textAge = new Text("Age: ");
        TextField fieldAge = new TextField();
        Text textNationality = new Text("Nationality: ");
        TextField fieldNationality = new TextField();
        Button buttonSubmit = new Button("Submit");
        GridPane pane = new GridPane();
        pane.add(textName, 0, 0);
        pane.add(fieldName, 1, 0);
        pane.add(textAge, 0, 1);
        pane.add(fieldAge, 1, 1);
        pane.add(textNationality, 0, 2);
        pane.add(fieldNationality, 1, 2);
        pane.add(buttonSubmit, 1, 3);
        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setTitle("ShowGridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
        int pad = 30;
        pane.setPadding(new Insets(pad));
        pane.setHgap(5);
        pane.setVgap(5);
    }
}
