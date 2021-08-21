package com.company.Array;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class ArrayManipulation {
  public static void main(String[] args) {

    String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
            "Marocchino", "Ristretto" };

    String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
    for (String coffee : copyTo) {
      System.out.print(coffee + " ");
    }

    /* Searching element in Array*/

    int locationOfSearchedElement = Arrays.binarySearch(copyFrom, "Cappuccino");
    System.out.println(locationOfSearchedElement);
    System.out.println(copyFrom[locationOfSearchedElement]);

    /* Equal */
    if (copyFrom.equals(copyTo))
      System.out.println("Same");
    System.out.println("Not same");

    /* Sorting */
    java.util.Arrays.sort(copyFrom);

    /* toString */
    System.out.println(Arrays.toString(copyFrom));
  }
}
