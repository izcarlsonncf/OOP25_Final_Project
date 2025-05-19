package com.example.oop25_final_project;

public class Dog extends Pet {
    /**
     * Gets a dog specific statement and then gets hunger and health points
     *
     * @return  string  Dog phrase and status points
     */
    @Override
    public String getStatus(){
        return "The dog barks! Hunger: " + getHunger() + " | Happiness: " + getHappiness();
    }
}
