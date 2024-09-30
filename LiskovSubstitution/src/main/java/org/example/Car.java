package org.example;

public class Car extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Starting the car's engine");
    }

    @Override
    public void drive() {
        System.out.println("The car is driving");
    }
}
