package com.sau.aa;

public class TestB {
    public static void main(String[] args) {
        Hi ob1 = new Hi();

        Hi ob2 = new Hi(50);

        ob1.aa = 99;
        System.out.println(ob1.aa + ob2.aa);

        ob1.showA();
        ob2.show();
        ob2.showA();
    }
}
