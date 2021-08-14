package com.company.ClassesObjects;

/*
    In the real world, you'll often find many individual objects all of the same kind. There may be 
    thousands of other bicycles in existence, all of the same make and model. Each bicycle was built 
    from the same set of blueprints and therefore contains the same components. In object-oriented 
    terms, we say that your bicycle is an instance of the class of objects known as bicycles. A class is 
    the blueprint from which individual objects are created.
    
    The following Bicycle class is one possible implementation of a bicycle:
 */

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


// This is where we run the classes, in most file structure this is named as Main.java
// Means, this is where the main method is writen

public class Main{
    public static void main(String[] args){
        
        BicycleClass bike1 = new BicycleClass();  //Object of BicycleClass
        BicycleClass bike2 = new BicycleClass();  //Another Object of BicycleClass

        // Invoke methods on 
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();

    }
}

// To run any java file command is 
// 1> To complie the java File-> javac <filename.java> eg => javac Main.java
// 2> To run the exectuable file (NO FILE EXTENSION) -> java <filename || Package> eg => java com.company.ClassesObjects.Main
