package ru.mirea.exercies19and20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Generate generate= new Generate();
        generate.beatifulplates();
        Scanner scanner= new Scanner(System.in);
        generate.search("Х666ВС197");
    }
}