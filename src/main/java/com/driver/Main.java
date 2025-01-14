package com.driver;

public class Main {
    public static void main(String[] args) {
        B b=new B();

//        Before override
//        String str=b.meth();
//        System.out.println(str);//get ouput of parent class A

//        After override of method meth
        System.out.println(b.meth());

//        System.out.println(str);//get the output from child class after overriding.


    }
}