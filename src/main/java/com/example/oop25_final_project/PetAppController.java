package com.example.oop25_final_project;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PetAppController {
    Pet myPet = new AlienCat(); // could also be initialized as dog or cat

    @FXML
    private Label petStatusLabel; // displays pet status -> hunger & happiness numbers

    @FXML
    private Label instructionLabel; // gives game instruction

    @FXML
    private void initialize(){
        updateStatus();
    }

    @FXML
    // to be done when instruction button is clicked
    private void onInstruct()
    {
        instructionLabel.setText("Keep hunger as close to 0 and happiness as close to 100 as possible!\n" +
                                 "Click Tick to simulate time passing!");
    }

    @FXML
    // to be done when tick button is clicked
    private void onTick(){
        myPet.tick();
        updateStatus();
    }

    @FXML
    // to be done when feed button is clicked
    private void onFeed(){
        myPet.feed(5);
        updateStatus();
    }

    @FXML
    // to be done when play button is clicked
    private void onPlay(){
        myPet.play();
        updateStatus();
    }


    // updates status -> hunger and happiness numbers
    private void updateStatus(){
        if (myPet.isAlive()){
            petStatusLabel.setText(myPet.getStatus());
        } else {
            petStatusLabel.setText("Your pet has died :(");
        }
    }

}