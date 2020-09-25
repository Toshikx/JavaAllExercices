package ru.mirea.exercies9and10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Company {
    private int baseSalary;
    private int Income;
    private ArrayList<Employee> empl = new ArrayList<Employee>();
    public Company() throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите фиксированный оклад");
        baseSalary = Integer.parseInt(read.readLine());
        System.out.println("Введите прибыль компании");
        Income = Integer.parseInt(read.readLine());
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getIncome() {
        return Income;
    }

    public void hire(Employee emp){
        empl.add(emp);
    }
    public void hireAll(ArrayList<Employee> empls) {
        for(int i = 0; i < empls.size(); i++) {
            empl.add(empls.get(i));
        }
    }
    public void fire(Employee emp){
        empl.remove(emp);
        }
    }
