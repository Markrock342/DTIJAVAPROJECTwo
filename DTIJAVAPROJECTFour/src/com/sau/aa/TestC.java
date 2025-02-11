package com.sau.aa;

public class TestC {
    public static void main(String[] args) {
        Hey ob1 = new Hey();

        Hey ob2 = new Hey();

        Hey ob3 = new Hey();

        ob1.a = 1000;

        ob3.b = 999;

        Hey.b = 55555;
        Hey.showHey();
        System.out.println(Hey.b);
        System.out.println(ob1.b);
        System.out.println(ob2.b);
        System.out.println(ob3.b);
    }
}
