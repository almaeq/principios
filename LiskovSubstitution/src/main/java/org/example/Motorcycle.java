package org.example;

public class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting the motorcycle's engine");
    }

    @Override
    public void drive() {
        System.out.println("The motorcycle is driving");
    }
}
