package com.dti.workshop;

import java.util.Scanner;

//โปรแกรมคำนวณพื้นที กับเส้นรอบวง โดยรับรัศมีทางแป้นพิมพ์ แล้วแสดงผลทางหน้าจอ
//ให้เขียนโดยใฃ้หลักการ OOP
public class Myworkshop01 {
    //data member
    public double radius;
    public double areaCircle;
    public double roundCircle;

    public void inputRadius(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------");
        System.out.println("Input radius");
        radius = sc.nextDouble();
        System.out.println("--------------");

    }
    public void calAreaCircle(){
        areaCircle = Math.PI * radius * radius;
    }

    public void calRoundCircle(){
        roundCircle = 2 * Math.PI * radius;
    }
    public void showAreaAndRoundCircle(){
        System.out.println("Area circle is " + areaCircle);
        System.out.println("Round circle is " + roundCircle);
        System.out.println("-----------------------");
    }


}
