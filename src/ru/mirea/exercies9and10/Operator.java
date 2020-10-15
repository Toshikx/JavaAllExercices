package ru.mirea.exercies9and10;

public class Operator extends Employee implements EmployeePosition{

    public Operator(String name, String surname, double baseSalary, String position) {
        super(name, surname, baseSalary, position);
    }

    public String getJobTitel() {
        return this.position;
    }
    public double calcSalary(double baseSalary) {
        return this.getBaseSalary();
    }


}
