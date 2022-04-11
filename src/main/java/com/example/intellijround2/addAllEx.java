package com.example.intellijround2;

import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import javax.crypto.Cipher;
import java.util.ArrayList;

public class addAllEx extends Application {
    public void start(Stage primaryStage) {
        Pane p = new Pane();
       // p.getChildren().addAll(15, 10, 5, 20, 50);


    }

    public ArrayList<Circle> getSpots(int radius, int y, int startx, int endx, int gap) {
        ArrayList<Circle> circles = new ArrayList<>();
        while (startx > endx) {
            circles.add(new Circle(startx, y, radius));
            startx += gap;
        }
        return circles;
    }


    }


