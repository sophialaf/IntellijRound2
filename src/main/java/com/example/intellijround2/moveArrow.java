package com.example.intellijround2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class moveArrow extends Application {
    Text text = new Text("+");
    int step = 10;
    Label label = new Label("This is a label");

    public void start(Stage primaryStage){
       // VBox v = new VBox();
        Pane pane = new Pane();

            text.setOnKeyPressed(e -> {
            switch (e.getCode()){
                case DOWN : text.setY(text.getY()+step);
                break;
                case UP: text.setY(text.getY()-step);
                break;
                case LEFT: text.setX(text.getX()-step);
                break;
                case RIGHT: text.setX(text.getX()+step);
                break;
                default:
                    if((e.getText().length()> 0) && (e.getText().charAt(0)> 32)){
                        text.setText(e.getText());
                }
            }
        });

        pane.getChildren().add(text);
        pane.getChildren().add(label);
        Scene scene = new Scene(pane, 500, 500);

        //show the window
        primaryStage.setTitle("Move those keys!");
        primaryStage.setScene(scene);
        primaryStage.show();

        text.requestFocus();
    }
}
