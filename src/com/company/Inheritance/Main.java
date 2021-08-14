/*
    Different kinds of objects often have a certain amount in common with each other. 
    Mountain bikes, road bikes, and tandem bikes, for example, all share the characteristics 
    of bicycles (current speed, current pedal cadence, current gear). Yet each also defines 
    additional features that make them different: tandem bicycles have two seats and two sets 
    of handlebars; road bikes have drop handlebars; some mountain bikes have an additional 
    chain ring, giving them a lower gear ratio.


    In this example Bicycle is superclass of  MountainBike, RoadBike, and TandemBike
*/
package com.company.Inheritance;
package com.company.ClassesObjects;


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
    public static void main(Stirng[] args){
        BicycleClass mountainBike = new MountainBike();
        
        // mountainBike now can have access to all methods and properties of BicycleClass 
        // addition to it, it has propertiese of MountainBike class


        // all properites & methods of BicycleClass
        mountainBike.changeCadence(50);
        mountainBike.speedUp(10);
        mountainBike.changeGear(2);

        // all properites & methods of MountainClass
        mountainBike.additional_chain_ring = 3;
        mountainBike.printStates();
    }
}