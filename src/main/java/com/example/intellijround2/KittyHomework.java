package com.example.intellijround2;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

import java.lang.module.ResolutionException;

public class KittyHomework extends Application {
    @Override
    public void start(Stage primaryStage){
    // location variables
    int centerX = 50;
    int centerHeady = 50;
    int distanceFromcenterX= 5;

    // creating the pane
    FlowPane p = new FlowPane(Orientation.VERTICAL);

    //instantiating shape objects
    // the head
    Circle head = new Circle(centerX, centerHeady, 50);
    Circle leftEye = new Circle(centerX+distanceFromcenterX, centerHeady, 10);
    Circle rightEye = new Circle(centerX-distanceFromcenterX, centerHeady, 10);
    Circle leftPupil = new Circle(centerX-(distanceFromcenterX/2), centerHeady, 5);
    Circle rightPupil = new Circle(centerX+(distanceFromcenterX/2), centerHeady, 5);
    Text nose = new Text(">");
    Text mouth = new Text(")");
    Polygon hair = new Polygon();
    ObservableList<Double> hairPoints = hair.getPoints();
    //adding points
     hairPoints.add(40.0); hairPoints.add(20.0);

    //crown
    Ellipse crownJewel = new Ellipse(centerX, centerHeady-20, 5, 10);
    Polygon crown = new Polygon();
    ObservableList<Double> crownPoints = crown.getPoints();
    //adding points (should be 6 I think)
    crownPoints.add(40.0); crownPoints.add(20.0);

    // body
   Arc topOfDress = new Arc();
    topOfDress.setCenterX(300.0f);
    topOfDress.setCenterY(150.0f);
    topOfDress.setRadiusX(90.0f);
    topOfDress.setRadiusY(90.0f);
    topOfDress.setStartAngle(40.0f);
    topOfDress.setLength(239.0f);
    topOfDress.setType(ArcType.ROUND);
    Rectangle bottomOfDress = new Rectangle(390, 150, 100, 200);
    Rectangle body = new Rectangle(centerX-20, centerHeady+100, 50, 200);

    //customizing
        head.setFill(Color.BEIGE);
        hair.setFill(Color.PINK);
        leftEye.setFill(Color.ROSYBROWN);
        rightEye.setFill(Color.ROSYBROWN);
        leftPupil.setFill(Color.BLACK);
        rightPupil.setFill(Color.BLACK);

        topOfDress.setFill(Color.DEEPPINK);
        body.setFill(Color.DEEPPINK);
        bottomOfDress.setFill(Color.DEEPPINK);
    

    //adding to pane
        p.getChildren().add(hair);
        p.getChildren().add(head);
        p.getChildren().add(crown);
        p.getChildren().add(crownJewel);
        p.getChildren().add(leftEye);
        p.getChildren().add(leftEye);
       /* p.getChildren().add(rightEye);
        p.getChildren().add(rightPupil);
        p.getChildren().add(mouth);
        p.getChildren().add(nose);

        p.getChildren().add(topOfDress);
        p.getChildren().add(bottomOfDress);
        p.getChildren().add(body);*/

    Scene scene = new Scene(p);
        primaryStage.setTitle("Not a kitty");
        primaryStage.setScene(scene);
        primaryStage.show();


}}
