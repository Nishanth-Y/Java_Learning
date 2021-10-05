package com.company.Strings;

public class Palindrom {
  public static void main(String[] args) {
    String value = "a";
    System.out.println(isPalindrom(value));

  }
  static  boolean isPalindrom(String str){
    if(str.length() == 0 || str == null){
      return true;
    }
    for (int i = 0; i < str.length() / 2; i++) {
      if(str.charAt(i) != str.charAt(str.length() - 1 -i)){
        return false;
      }
    }
    return true;
  }

}
