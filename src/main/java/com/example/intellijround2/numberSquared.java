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

public class numberSquared extends Application {
    private TextField input = new TextField();
   private TextField total = new TextField();
   private  Button enter = new Button("Calculate");
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label numberLab = new Label("Num:  " );
        Label resultLab = new Label("Result:  "  );

        Pane p = new Pane();
        VBox v1 = new VBox();
        HBox h1 = new HBox();
        HBox h2 = new HBox();

        p.getChildren().add(v1);
        v1.getChildren().add(h1);
        v1.getChildren().add(h2);

        h1.getChildren().add(numberLab);
        h1.getChildren().add(input);
        h1.getChildren().add(resultLab);
        h1.getChildren().add(total);
        h2.getChildren().add(enter);

        h1.setPadding(new Insets(20, 5, 5, 5));
        h2.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(p);
        scene.setFill(Color.HOTPINK);
        primaryStage.setTitle("Number Squared");
        primaryStage.setScene(scene);
        primaryStage.show();

        // event handler lamda style
        enter.setOnAction(
                e -> {
                    String s = input.getText();
                    int x = Integer.parseInt(s);
                    total.setText(Integer.toString(x*x));
                }
        );

    }}
