package ru.mirea.exercies21and22.Chairs;

public class MagicChairFactory implements Factory {

    @Override
    public Chair createChair(){
        return new MagicChair();
    }
}