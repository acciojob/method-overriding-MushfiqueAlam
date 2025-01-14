package com.driver;

class  A{
    String meth(){
        return "Invoking method from class A";
    }
}
class B extends  A{
    @Override
    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
    public static void main(String[] args) {
        B b=new B();

        b.meth();
//        Before override
//        String str=b.meth();
//        System.out.println(str);//get ouput of parent class A

//        After override of method meth


//        System.out.println(str);//get the output from child class after overriding.


    }
}