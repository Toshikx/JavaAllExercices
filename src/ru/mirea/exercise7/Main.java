package ru.mirea.exercise7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Plate plate = new Plate(1,10);

        Dish pan = new Pan(20,100);

        plate.calcVolume();
        ((Pan)pan).makeBorsh();


        Chihua_Hua chibi = new Chihua_Hua("Chibi", 15);
        System.out.println(((Chihua_Hua)chibi));
        chibi.bark();

        Haski korj = new Haski("Korj", 2);
        korj.bark();

        ArrayList<Dish> allDishes = new ArrayList<>();
        allDishes.add(plate);
        allDishes.add(pan);


    }
}
