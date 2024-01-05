package com.shaka;

public class Person {
    public static int count = 0;
    public Person(){
        count++;
    }
    public static void getCount(){
        System.out.println("Count: " + count);
    }
}
