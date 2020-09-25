package ru.mirea.exercise7;

public class Chihua_Hua
{
    private String name;
    private int age;


    public Chihua_Hua(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark(){
        System.out.println("smallWoof");
    }

    @Override
    public String toString() {
        return "Chihua_Hua{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
