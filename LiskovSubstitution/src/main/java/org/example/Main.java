package org.example;

// Una subclase debe ser capaz de usarse en lugar de la clase base sin q el comportamiento del sistema cambie
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        // Llamamos a los métodos de Vehicle
        vehicle.startEngine();
        vehicle.drive();

        // Llamamos a los métodos de Car
        car.startEngine();
        car.drive();

        // Llamamos a los métodos de Motorcycle
        motorcycle.startEngine();
        motorcycle.drive();
    }
}
