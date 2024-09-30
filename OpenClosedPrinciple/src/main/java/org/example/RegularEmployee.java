package org.example;

public class RegularEmployee extends Employee {

    public RegularEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10;  // Los empleados regulares obtienen un 10% de bonificación
    }
}
