package com.company.Inheritance;/*
    Different kinds of objects often have a certain amount in common with each other. 
    Mountain bikes, road bikes, and tandem bikes, for example, all share the characteristics 
    of bicycles (current speed, current pedal cadence, current gear). Yet each also defines 
    additional features that make them different: tandem bicycles have two seats and two sets 
    of handlebars; road bikes have drop handlebars; some mountain bikes have an additional 
    chain ring, giving them a lower gear ratio.


    In this example Bicycle is superclass of  MountainBike, RoadBike, and TandemBike
*/

// Here BicycleClass, is a Superclass => which has all methods and properties
class BicycleClass {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}

//This is a Sub Class(Derived Class) which inherits the super class properties and methods and adds additional
// features(properties and methods) to itsel(This additional features doesn't apply to the super class it remains
// to the derived class)
class MountainBike extends BicycleClass {

    // new Fields, Methods
    int additional_chain_ring = 1;

    // printMethod
    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear + " addition Chain rings:" + additional_chain_ring);
    }

}

public class Main {
    public static void main(String[] args){
        MountainBike mountainBike = new MountainBike();
        
        // mountainBike now can have access to all methods and properties of BicycleClass 
        // addition to it, it has propertiese of MountainBike class


        // all properties & methods of BicycleClass
        mountainBike.changeCadence(50);
        mountainBike.speedUp(10);
        mountainBike.changeGear(2);

        // all properites & methods of MountainClass
        mountainBike.additional_chain_ring = 3;
        mountainBike.printStates();
    }
}