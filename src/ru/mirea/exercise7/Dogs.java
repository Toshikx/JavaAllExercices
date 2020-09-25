package ru.mirea.exercise7;

public abstract class Dogs {
    private String name;
    private int age;
    public abstract void bark();

    public Dogs(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dogs{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
