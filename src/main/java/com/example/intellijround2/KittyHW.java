package com.example.intellijround2;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;

public class KittyHW extends Application {
    @Override
    public void start(Stage primaryStage){

        // location variables
        int centerX = 100;
        int centerHeady = 100;
        int distanceFromcenterX= 20;
        int offcenter = 40;
        int lessY = 10;
        int spireOffSet = 30;

        // creating the pane
        Pane p = new Pane();

        //Background
        Rectangle grass = new Rectangle(0.0, 300, 300, 100);

        // Castle
        Polygon spire = new Polygon();
        ObservableList<Double> spirePoints = spire.getPoints();
        spirePoints.add(150.0); spirePoints.add(120.0);
        spirePoints.add(150.0); spirePoints.add(200.0);
        spirePoints.add(170.0); spirePoints.add(200.0);
        spirePoints.add(170.0); spirePoints.add(120.0);
        spirePoints.add(160.0); spirePoints.add(90.0);

        Polygon spire2 = new Polygon();
        ObservableList<Double> spire2Points = spire2.getPoints();
        spire2Points.add(150.0+spireOffSet); spire2Points.add(120.0);
        spire2Points.add(150.0+spireOffSet); spire2Points.add(200.0);
        spire2Points.add(170.0+spireOffSet); spire2Points.add(200.0);
        spire2Points.add(170.0+spireOffSet); spire2Points.add(120.0);
        spire2Points.add(160.0+spireOffSet); spire2Points.add(60.0);

        Polygon spire3 = new Polygon();
        ObservableList<Double> spire3Points = spire3.getPoints();
        spire3Points.add(150.0+(2*spireOffSet)); spire3Points.add(120.0);
        spire3Points.add(150.0+(2*spireOffSet)); spire3Points.add(200.0);
        spire3Points.add(170.0+(2*spireOffSet)); spire3Points.add(200.0);
        spire3Points.add(170.0+(2*spireOffSet)); spire3Points.add(120.0);
        spire3Points.add(160.0+(2*spireOffSet)); spire3Points.add(90.0);

        Rectangle castleBody = new Rectangle(150.0, 200, 80, 110);

        // the head
        Circle head = new Circle(centerX, centerHeady, 35);
        Circle leftPuffSleeve = new Circle(centerX-35, centerHeady+40, 15);
        Circle rightPuffSleeve = new Circle(centerX+35, centerHeady+40, 15);
        Circle leftEye = new Circle(centerX-(distanceFromcenterX/2), centerHeady, 7);
        Circle rightEye = new Circle(centerX+(distanceFromcenterX/2), centerHeady, 7);
        Circle leftPupil = new Circle(centerX-(distanceFromcenterX/2), centerHeady, 5);
        Circle rightPupil = new Circle(centerX+(distanceFromcenterX/2), centerHeady, 5);
        Text nose = new Text(centerX, centerHeady+15,">");
        Text mouth = new Text(centerX, centerHeady+25,")");
        mouth.setRotate(90.0);

        //hair
        Rectangle bangs = new Rectangle(60, 70, 80, 20);
        Polygon hair = new Polygon();
        ObservableList<Double> hairPoints = hair.getPoints();
        hairPoints.add(60.0); hairPoints.add(60.0);
        hairPoints.add(40.0); hairPoints.add(130.0);
        hairPoints.add(160.0); hairPoints.add(130.0);
        hairPoints.add(140.0); hairPoints.add(60.0);

        //crown
        Ellipse crownJewel = new Ellipse(centerX, centerHeady-45, 5, 10);
        Polygon crown = new Polygon();
        ObservableList<Double> crownPoints = crown.getPoints();
        crownPoints.add(40.0+offcenter); crownPoints.add(40.0+lessY);
        crownPoints.add(40.0+offcenter); crownPoints.add(60.0+lessY);
        crownPoints.add(80.0+offcenter); crownPoints.add(60.0+lessY);
        crownPoints.add(80.0+offcenter); crownPoints.add(40.0+lessY);
        crownPoints.add(60.0+offcenter); crownPoints.add(20.0+lessY);

        // body
        Arc topOfDress = new Arc();
        topOfDress.setCenterX(100.0f);
        topOfDress.setCenterY(270.0f);
        topOfDress.setRadiusX(90.0f);
        topOfDress.setRadiusY(90.0f);
        topOfDress.setStartAngle(0.0f);// rotation
        topOfDress.setLength(180.0f);//degree of center angle
        topOfDress.setType(ArcType.ROUND);
        Rectangle bottomOfDress = new Rectangle(10, 265, 180, 100);
        Rectangle body = new Rectangle(75, 135, 50, 50);
        Rectangle lArm = new Rectangle(55, 140, 15, 60);
        Rectangle rArm = new Rectangle(130, 140, 15, 60);

        //stripes -- they're ugly so I took them out
        /*int stripeGap = 20;
        int currStripe = 10;
        int lastStripe = 160;
        int stripeLength = 70;
        ArrayList<Polygon> stripes = new ArrayList<>();
        while(currStripe <= lastStripe){
            Polygon stripy = new Polygon(35 + currStripe, 265,
                    20 + currStripe , 265,
                    30 + currStripe + 15, 285 +stripeLength);
            stripy.setStroke(Color.MEDIUMPURPLE);
            stripy.setFill(Color.MEDIUMPURPLE);
            stripes.add(stripy);
            currStripe += stripeGap;

        }*/

        //customizing
        grass.setFill(Color.GREEN);

        spire.setFill(Color.GRAY);
        spire2.setFill(Color.GRAY);
        spire3.setFill(Color.GRAY);
        castleBody.setFill(Color.GRAY);


        head.setFill(Color.BEIGE);
        hair.setFill(Color.LIGHTPINK);
        bangs.setFill(Color.LIGHTPINK);
        leftEye.setFill(Color.ROSYBROWN);
        rightEye.setFill(Color.ROSYBROWN);
        leftPupil.setFill(Color.BLACK);
        rightPupil.setFill(Color.BLACK);
        crownJewel.setFill(Color.MEDIUMPURPLE);
        crown.setFill(Color.GOLD);

        leftPuffSleeve.setFill(Color.DEEPPINK);
        rightPuffSleeve.setFill(Color.DEEPPINK);
        topOfDress.setFill(Color.DEEPPINK);
        body.setFill(Color.DEEPPINK);
        bottomOfDress.setFill(Color.DEEPPINK);
        lArm.setFill(Color.BEIGE);
        rArm.setFill(Color.BEIGE);


        //adding to pane
        p.getChildren().add(grass);

        p.getChildren().add(spire);
        p.getChildren().add(spire2);
        p.getChildren().add(spire3);
        p.getChildren().add(castleBody);

        p.getChildren().add(hair);
        p.getChildren().add(head);
        p.getChildren().add(bangs);
        p.getChildren().add(crown);
        p.getChildren().add(crownJewel);

        p.getChildren().add(leftEye);
        p.getChildren().add(leftPupil);
        p.getChildren().add(rightEye);
        p.getChildren().add(rightPupil);
        p.getChildren().add(mouth);
        p.getChildren().add(nose);

        p.getChildren().add(rArm);
        p.getChildren().add(lArm);
        p.getChildren().add(body);
        p.getChildren().add(topOfDress);
        p.getChildren().add(bottomOfDress);
        p.getChildren().add(leftPuffSleeve);
        p.getChildren().add(rightPuffSleeve);
        //p.getChildren().addAll(stripes);
        

        Scene scene = new Scene(p);
        scene.setFill(Color.LIGHTBLUE);
        primaryStage.setTitle("Pretty pretty princess");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
