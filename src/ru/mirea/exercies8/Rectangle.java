package ru.mirea.exercies8;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }
    public Rectangle(){};

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimitr() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}
