package com.company;

public class Main {

    public static void main(String[] args) {
        Flower flower = new Flower(new Bee(3L));
        System.out.println(flower.getRemainderPetals() + " the rest of the petals");
    }
}
