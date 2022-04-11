package com.example.intellijround2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class mouseEvent extends Application {

    double xOffset;
    double yOffset;

    @Override
    public void start(Stage primaryStage) {
        Rectangle r = new Rectangle(50, 20, 100, 50);
        Rectangle outline = new Rectangle(100, 200, 100, 50);
        //Arrays for displacement of cursor
        final double[] displacementX = new double[1];
        final double[] displacementY = new double[1];

        //Get the position of the cursor for the displacement
        r.setOnMousePressed(e -> {
            displacementX[0] = e.getX();
            displacementY[0] = e.getY();
        });

        //Mouse dragging
        r.setOnMouseDragged(e ->{
            //Calculate the offset and move the box
            r.setTranslateX(e.getSceneX() - displacementX[0]);
            r.setTranslateY(e.getSceneY() - displacementY[0]);
//coords of click
        //r.setOnMousePressed(x -> {
            //xOffset = x.getX();
            //yOffset = x.getY();
            //System.out.println(""+xOffset+yOffset);
        });

        //r.setOnMouseDragged(e -> {
            //r.setX(e.getX());
            //r.setY(e.getY() + Math.abs(e.getY()-yOffset));
            r.setFill(Color.HOTPINK);
            if ((Math.abs(r.getX() - outline.getX())) <= 10 && Math.abs(r.getY() - outline.getY()) <= 10) {
                r.setFill(Color.GREEN);
            }

        Pane p = new Pane();

        p.getChildren().add(outline);
        p.getChildren().add(r);
        outline.setStroke(Color.HOTPINK);
        outline.setFill(Color.WHITE);


        Scene scene = new Scene(p);
        primaryStage.setTitle("Mouse");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
