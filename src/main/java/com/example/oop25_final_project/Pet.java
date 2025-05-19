package com.example.oop25_final_project;

public abstract class Pet implements Interactable {
    // could also be protected to be used in child classes, but private here to demonstrate use of setters and getters
    private int hunger = 0;
    private int happiness = 100;

    /**
     * Gets hunger points
     *
     * @return  hunger  gets hunger points integer value
     */
    public int getHunger(){
        return hunger;
    }

    /**
     * Sets happiness points
     *
     * @param  hunger  integer value to set hunger points to
     */
    public void setHunger(int hunger){
        this.hunger = hunger;
    }

    /**
     * Gets happiness points
     *
     * @return  happiness  gets happiness points integer value
     */
    public int getHappiness(){
        return happiness;
    }

    /**
     * Sets happiness points
     *
     * @param  happiness  integer value to set happiness points to
     */
    public void setHappiness(int happiness){
        this.happiness = happiness;
    }

    /**
     * Simulates feeding the virtual pet
     *
     * @param  amount  number of hunger points to decrement hunger by
     */
    public void feed(int amount){
        hunger -= amount;
        if (hunger <= 0) {
            hunger = 0;
        }
    }

    /**
     * Simulates playing with the virtual pet
     */
    public void play(){
        happiness += 5;
        if (happiness >= 100){
            happiness = 100;
        }
    }

    /**
     * Decrements hunger and happiness points by a small value to simulate time passing
     */
    public void tick(){
        happiness -= 1;
        hunger += 2;
    }

    /**
     * Checks if hunger is less than 100 and happiness is above 0
     *
     * @return boolean pet's alive status
     */
    public boolean isAlive(){
        return hunger < 100 && happiness > 0;
    }
}
