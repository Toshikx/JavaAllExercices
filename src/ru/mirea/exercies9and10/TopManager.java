package ru.mirea.exercies9and10;

public class TopManager extends Manager implements EmployeePosition{
    public TopManager(String name, String surname, double baseSalary, String position) {
        super(name, surname, baseSalary, position);
    }
    public String getJobTitel() {
        return this.getPosition();
    }
    public double calcSalary(double baseSalary) {
        return (this.getBaseSalary() * 1.5);
    }


}
