package com.sau.aa;

public class Hello {
    public int a;
    public int b = 10;

    public void showA( ){
        System.out.println(a);
    }

    public void showB(){
        System.out.println(b);
    }
    public void showSumAB(){
        System.out.println(a+b);
    }

    public Hello (int a){
        this.a = a;
        System.out.println("Hello...");
    }
    public Hello(){
        public Hello(String x){
            System.out.println("Hey...." + x);
        }
    }
}
