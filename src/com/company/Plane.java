package com.company;

public class Plane extends Transport implements Printable {
    private int wing;
    private String model;
    private String color;


    public Plane( int age,String name ,int wing, String model, String color) {
        super(age,name);
        this.wing = wing;
        this.model = model;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getWing() {
        return wing;
    }

    @Override
    public void print() {
        System.out.println("Information about Airplane " + "\nYear: " + getAge() + "" +
                        "\nName: " + getName()+
                        "\nWing: " + getWing()+ "\nModel: " + getModel()+ "\nColor: " + getColor());
    }
}