package ru.mirea.exercies21and22.Chairs;

public class MultyfunctionChairFactory implements Factory {
    @Override
    public Chair createChair() {
        return new MultyfunctionChair();
    }
}
