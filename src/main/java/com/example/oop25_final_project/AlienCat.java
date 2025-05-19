package com.example.oop25_final_project;

public class AlienCat extends Pet {
    /**
     * Gets an alien cat specific statement and then gets hunger and health points
     *
     * @return  string  Alien cat phrase and status points
     */
    @Override
    public String getStatus(){
        return "The gleeble glorb mweorps!\nHunger: " + getHunger() + " | Happiness: " + getHappiness();
    }
}
