package ru.mirea.exercies21and22.Chairs;

public class VictorianChairFactory implements Factory {


    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}