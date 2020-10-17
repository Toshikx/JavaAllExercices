package ru.mirea.exercies9and10;

import java.util.Random;

public class Manager extends Employee implements EmployeePosition {
    public Manager(String name, String surname, double baseSalary, String position) {
        super(name, surname, baseSalary, position);
    }
    public int peronalIncome;
    public Manager(String name, String surname) {
        super(name, surname);
    }
    public int getRandomSalary(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min) + min;
    }
    public String getJobTitel() {
        return this.position;
    }
    public double calcSalary(double baseSalary) {
        return (getRandomSalary(140000, 115000) * 1.05);
    }


}
