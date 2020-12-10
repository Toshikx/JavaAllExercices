package ru.mirea.exercies15and16;

public class Person {
    private String name;
    private Account myaccount;
    public Person(String name) {
        this.name = name;
        myaccount=new Account();
        this.myaccount.setBalance(7328.67);
    }

    public String getName() {
        return name;
    }

    public Account getMyaccount() {
        return myaccount;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }}