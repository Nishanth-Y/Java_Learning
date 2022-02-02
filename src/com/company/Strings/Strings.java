package com.company.Strings;

//String is collection of characters
//String Concepts
//1.String polling -> if a string value is stored in heap memory, its actually stored in string poll inside the heap memory
//                    so that if a new string variable has same value it points to the existing value in the poll instated of
//                    creating a new value in the memory. => it make's the code more optimized
//2.String immutability -> String objects cannot change the value or update to new value, they can create new object
//                         and assign to the reference variable, we use immutability for good security while dealing with
//                         String


public class Strings {
  public static void main(String[] args) {
// String Polling:-
    String name = "Nishanth";
    String name2 = "Nishanth"; //Now the name2 variable is pointing to the name value(String polling)
    System.out.println(name == name2); //o/p: true (because it's pointing to same object)

//  like:
//     name -> Nishanth <- name2

//  By new Keyword
    String newName1 = new String("Nishanth");
    String newName2 = new String("Nishanth");
    System.out.println(newName1 == newName2);//o/p: False (because we are creating new object of same value)

//    like: newName1 -> "Nishanth"
//          newName2 -> "Nishanth"

//  NOTE: To check value in the variables even its pointing to new object use equals()
//    like: newName1 -> "Nishanth"
//          newName2 -> "Nishanth"
    System.out.println(newName1.equals(newName2));
    System.out.println(newName1.charAt(0)); // String method to get character in specified index

//  String immutability:
    String a = "Something";
    System.out.println(a);
    a = "Something new";
    System.out.println(a);

//  Print All alphabets
    String buffer = "";
    for(int i=0; i < 26; i++){
      char ch = (char)('a' + i);
      buffer += ch;
    }
    System.out.println(buffer);
//    But for this time complexity is O(n^2)
  }
}
