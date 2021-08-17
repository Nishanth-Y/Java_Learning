/*
Interface
-------------------------------------------------------------------------------------------------
 Methods form the object's interface with the outside world
 Example:
  The buttons on the front of your television set, are the interface between you and 
  the electrical wiring on the other side of its plastic casing. You press the "power" 
  button to turn the television on and off.

 */

package com.company.Interface;

// In its most common form, an interface is a group of related methods with empty bodies

interface Bicycle {

    //  wheel revolutions per minute
    public void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}       

// We need to implement the Interface with a class, In this example we take it as ACMEBicyle

class ACMEBicycle implements Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

   // The compiler will now require that methods
   // changeCadence, changeGear, speedUp, and applyBrakes
   // all be implemented. Compilation will fail if those
   // methods are missing from this class.

    public void changeCadence(int newValue) {
         cadence = newValue;
    }

    public void changeGear(int newValue) {
         gear = newValue;
    }

    public void speedUp(int increment) {
         speed = speed + increment;   
    }

    public void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    public void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}

public class Main{
    public static void main(String[] args){
        ACMEBicycle amcebike1 = new ACMEBicycle();

        amcebike1.changeCadence(50);
        amcebike1.speedUp(10);
        amcebike1.changeGear(2);
        amcebike1.printStates();
    } 
}