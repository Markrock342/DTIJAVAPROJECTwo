package com.dti.aa;

public class Myclass01 {
    public static int num1 = 10;  // ประกาศตัวแปรเป็น static
    public int num2 = 20;         // ตัวแปร instance

    public static void main(String[] args) {
        Myclass01 ob1 = new Myclass01();

        System.out.println(ob1.num1);  // ใช้ผ่าน object ได้ แต่ไม่จำเป็น
        System.out.println(Myclass01.num1); // ใช้ผ่านคลาสโดยตรง
        System.out.println(ob1.num2);  // ต้องใช้ผ่าน object เท่านั้น

        ob1.showHi();  // เรียกเมธอด instance ผ่าน object
        Myclass01.showHi(); // เรียกเมธอด static ผ่านคลาส
        ob1.showHey(); // เรียกเมธอด instance ผ่าน object
    }

    public static void showHi() {
        System.out.println("Hi from static method");
    }

    public void showHey() {
        System.out.println("Hey from instance method");
    }
}
