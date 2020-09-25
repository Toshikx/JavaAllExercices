package ru.mirea.exercies8;

public class Sofa extends Furniture{
    public Sofa(int price, String name) {
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
        System.out.println("Шикарный диван " + getName());
    }
}
