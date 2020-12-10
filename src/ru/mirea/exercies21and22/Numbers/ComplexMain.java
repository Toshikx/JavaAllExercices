package ru.mirea.exercies21and22.Numbers;

public class ComplexMain {
    public static void main(String[] args) {
        ComplexNumberInterface number;
        ComplexNumberFactory creating = new Create();
        number = creating.create();
    }
}