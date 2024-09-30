package org.example;

public abstract class Employee {
    protected String name; //con protected se accede directo a los atributos sin los getters
    protected double salary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Método abstracto para calcular la bonificación (obliga a cada subclase a proporcionar su propia implementacion)
    public abstract double calculateBonus();
}
