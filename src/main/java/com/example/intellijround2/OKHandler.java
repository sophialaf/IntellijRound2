package com.example.intellijround2;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

class OKHandler implements EventHandler<ActionEvent> {
    @Override
    public void  handle(ActionEvent e){
        Button clicked = (Button) e.getSource();
        System.out.printf("Clicked button '%S'\n", clicked.getText());
    }

}
