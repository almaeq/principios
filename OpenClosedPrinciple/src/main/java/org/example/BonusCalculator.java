package org.example;

// Calcular salario mas bonus
public class BonusCalculator {
    public double calculateTotalSalary(Employee employee) {
        return employee.salary + employee.calculateBonus();
    }
}
