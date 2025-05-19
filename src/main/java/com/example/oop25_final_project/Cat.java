package com.example.oop25_final_project;

public class Cat extends Pet {
    /**
     * Cat specific statement and then gets hunger and health points
     *
     * @return  string  Cat phrase and status points
     */
    @Override
    public String getStatus(){
        return "The cat meows! Hunger: " + getHunger() + " | Happiness: " + getHappiness();
    }
}
