package com.company;

public class Flower {

    public Bee bee;
    public Petals petals;

    public Flower(Bee bee) {
        //Агрегация
        this.bee = bee;
        //Композиция
        this.petals = new Petals(9L);
    }

    public Long getRemainderPetals(){
        return petals.getNumber() - bee.getAmount();
    }

}
