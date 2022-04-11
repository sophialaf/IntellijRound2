package com.example.intellijround2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class calculator extends Application {
    //objects
    TextField input = new TextField();
    private void myMethod(MouseEvent event){
        input.setText("");
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
//panes
        Pane p = new Pane();
        VBox vB = new VBox();
        HBox ph1 = new HBox();
        HBox ph2 = new HBox();
        HBox pH3 = new HBox();
        GridPane gridPane = new GridPane();
        VBox c2 = new VBox();



        ArrayList<Button> butts1 = new ArrayList<Button>();
        butts1.add(new Button("C"));
        butts1.add(new Button("AC"));

        ArrayList<Button> numbies = new ArrayList<Button>();
        for(int i = 0; i < 10; i++){
            Button b = new Button(Integer.toString(i));
            numbies.add(b);
            gridPane.add(b, i%3, i/3);
        }

        ArrayList<Button> plusAndSuch = new ArrayList<>();
            Button plus = new Button("+");
            plusAndSuch.add(plus);
            Button minus = new Button("-");
            plusAndSuch.add(minus);
            Button equals = new Button("=");
            plusAndSuch.add(equals);

        /*ArrayList<Character> operation = new ArrayList<>();
        for (char c : operation>{
            Button b = new Button(Character.toString(c));
            plusAndSuch.add(b);

        }*/
        p.getChildren().add(vB);
        vB.getChildren().add(ph1);
        vB.getChildren().add(ph2);
        vB.getChildren().add(pH3);

        ph1.getChildren().add(input);
        ph2.getChildren().addAll(butts1);
        pH3.getChildren().add(gridPane);
        pH3.getChildren().add(c2);
        c2.getChildren().addAll(plusAndSuch);

        gridPane.setPadding(new Insets(10, 10, 10, 0 ));

        Scene scene = new Scene(p);
        scene.setFill(Color.HOTPINK);
        primaryStage.setTitle("WOOOHOOOOOO");
        primaryStage.setScene(scene);
        primaryStage.show();

        for (Button b : numbies) {
            b.setOnMouseClicked(e -> {
                input.setText(input.getText() + b.getText());
            });
        }

        // could also do:
        /*

         */
        butts1.get(0).setOnMouseClicked(e -> {input.setText(input.getText().substring(0, input.getText().length()-1));});
        butts1.get(1).setOnMouseClicked(this:: myMethod);
        //butts1.get(1).setOnMouseClicked(e -> {input.setText("");});
    }


}