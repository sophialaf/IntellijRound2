package com.example.intellijround2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class refromatSize extends Application {
    @Override
public void start(Stage primaryStage){
        Rectangle r = new Rectangle();
        r.setFill(Color.HOTPINK);
        Pane pane = new Pane();
        //pane.setPadding(new Insets(20, 20 , 20, 20));
        pane.widthProperty().addListener( ov -> {
            r.setWidth(pane.getWidth()-pane.getPadding().getLeft()*2);
        });
        pane.heightProperty().addListener(ov ->{
            r.setHeight(pane.getHeight()-pane.getPadding().getLeft()*2);
        });
        pane.getChildren().add(r);
        Scene scene = new Scene(pane);
        primaryStage.setTitle("rect");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
