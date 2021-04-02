package com.company;

public class Bus extends Transport implements Printable{
    private int chair;
    private int door;


    public Bus(String name, int age,int chair , int door ) {
        super(age, name);
        this.chair = chair;
        this.door = door;
    }

    public int getChair() {
        return chair;
    }

    public int getDoor(){
        return door;
    }

    @Override
    public void print() {
        System.out.println("Information about Bus " +
                "\nName: " + getName() + "\nYear: " + getAge() + "\nChair " + getChair() + "\nDoor: " + getDoor());

    }
}

