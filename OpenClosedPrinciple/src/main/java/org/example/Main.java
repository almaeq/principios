package org.example;

// Se agregan funcionalidades sin modificar el codigo existente
public class Main {
    public static void main(String[] args) {
        Employee regularEmployee = new RegularEmployee("John Doe", 3000);
        Employee manager = new ManagerEmployee("Jane Smith", 5000);

        BonusCalculator bonusCalculator = new BonusCalculator();

        // Calculamos el salario total con la bonificación para cada empleado
        System.out.println("Total salary for regular employee: " + bonusCalculator.calculateTotalSalary(regularEmployee));
        System.out.println("Total salary for manager employee: " + bonusCalculator.calculateTotalSalary(manager));
    }
}

