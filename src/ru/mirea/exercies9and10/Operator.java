package ru.mirea.exercies9and10;

public class Operator extends Employee implements EmployeePosition {
    public Operator(String name,String Surname) {
        super(name, Surname);

    }

    @Override
    public String getJobTitle() {
        return "Operator";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }

}