package ru.mirea.exercies8;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){};

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean issFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimitr();
    public abstract String toString();
}
