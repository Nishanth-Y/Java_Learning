package com.company.Array;

//An array is a container object that holds a fixed number of values of a single type. The length of an array is established when the array is created. After creation, its length is fixed. You have seen an example of arrays already, in the main method of the "Hello World!" application. This section discusses arrays in greater detail.

public class ArrayBasics {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;
        // so for
//        byte[] anArrayOfBytes;
//        short[] anArrayOfShorts;
//        long[] anArrayOfLongs;
//        float[] anArrayOfFloats;
//        double[] anArrayOfDoubles;
//        boolean[] anArrayOfBooleans;
//        char[] anArrayOfChars;
//        String[] anArrayOfStrings;

        // allocates memory for 10 integers
        anArray = new int[2];

        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;


        //Alternatively
        int[] AanArray = {
                100,
                200
        };

        System.out.println("Element at index 0: "
                + anArray[0]);
        System.out.println("Element at index 1: "
                + anArray[1]);
    }
}
