package com.company.Question_4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*
        1. In this main method initialize a List as an ArrayList.
        Add 6 values of your choosing to this ArrayList.
        2. Create a new method in this class called displayArray that takes a List parameter.
        3. Have this new method use a ForEach loop to iterate through the ArrayList and display each item to the user.
         */
        displayArray();
        }

    public static void displayArray(){
        ArrayList<String> arrayList = new ArrayList<String>(){{
            add("a");
            add("b");
            add("c");
            add("d");
            add("e");
            add("f");
        }};
        for (String a:arrayList
             ) {
            System.out.println(a);
        }
    }
}
