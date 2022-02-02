package com.company.Strings;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =0; i < 26; i++){
            char ch = (char)('a' + i);
            stringBuilder.append(ch);
        }
        System.out.println(stringBuilder);
//      Some of its methods
        System.out.println(stringBuilder.deleteCharAt(0));
        System.out.println(stringBuilder.indexOf("c"));
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.substring(0, 10));
    }
}
