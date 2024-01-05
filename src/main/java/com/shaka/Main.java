package com.shaka;
import java.util.ArrayList;
import java.util.LinkedList;
import  java.util.Scanner;
import com.shaka.db.DB;

public class Main {
    public static void main(String[] args) {

      Truck truck = new Truck();
      truck.setValues(100,5000,"Black",new byte[]{10,0,0},true);
      truck.engine.setValues(false,200);
      truck.engine.info();

        System.out.println(truck.getValues());




//        Person obj1 = new Person();
//        Person obj2 = new Person();
//        Person obj3 = new Person();
//        Person.getCount();
//
//
//
//        DB db = new DB();
//
//        add(5,7);
//        add(5.5f,7.3f);
//
//
//    }
//    public static void add(int a,int b){
//        int res = a + b;
//        System.out.println("Res: " + res);
//    }
//    public static void add(float a,float b){
//        float res = a + b;
//        System.out.println("Res: " + res);
       }


}









