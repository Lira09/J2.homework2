package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Plane");
    }

    public static Transport createObject(String className){
        switch (className) {
            case "Plane" :
                Plane plane = new Plane(1999,"Boieng",3,"B-77","White");

                plane.print();
                return plane;

            case "Bus" :
                Bus bus = new Bus("Spartac",1922,25,3);

                bus.print();
                return bus;
            case "Train" :
                Train train = new Train(1960,"Leningrad-60",5,54);

                train.print();
                return train;
        }
        return createObject(className);
    }

}
