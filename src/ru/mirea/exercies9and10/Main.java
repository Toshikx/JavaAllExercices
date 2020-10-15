package ru.mirea.exercies9and10;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Company com = new Company();

        Employee jack = new Employee("Jack", "Pirkin");
        com.hire(jack);
        com.fire(jack);
    }
}
