package ru.mirea.exercies9and10;

public class Employee implements EmployeePosition {
    String name, surname, position;
    double baseSalary;
    public Employee () {};
    public Employee(String name, String surname, double baseSalary, String position) {
        this.name = name;
        this.surname = surname;
        this.baseSalary = baseSalary;
        this.position = position;
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String getJobTitel() {
        return this.getPosition();
    }

    @Override
    public double calcSalary(double baseSalary) {
        return this.getBaseSalary();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
