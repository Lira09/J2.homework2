package com.company;

public class Train extends Transport  implements Printable {
    private int carriage ;
    private int capacity;
    public Train( int age , String name,int carriage, int capacity) {
        super(age, name);
        this.carriage = carriage;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCarriage(){
        return carriage;
    }

    @Override
    public void print() {
        System.out.println("Information about Train" +
                "\nName: " + getName() + "\nYear: " + getAge() + "\nCarriage: " + getCarriage() + "\nCapacity: " + getCapacity());

    }
}
