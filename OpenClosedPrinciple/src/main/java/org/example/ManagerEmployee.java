package org.example;

public class ManagerEmployee extends Employee{

    public ManagerEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20;  // Los gerentes obtienen un 20% de bonificación
    }
}
