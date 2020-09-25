package ru.mirea.exercies8;

public class Chair extends Furniture {

    public Chair(int price, String name) {
        super(price, name);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void showInfo() {
        System.out.println("Прекрасный стул " + getName());
    }
}
