package com.sau.dti;

import java.util.InputMismatchException;
import  java.util.Scanner;

public class Test03 {
    //Exception Handling การจัดการข้อผิดพลาดที่เกิดขึ้นขณะ โปรแกรมทำงาน
    public static void main(String[] args) {
        double num1, num2;
        double result[] = new double[2];

        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("ป้อนตัวเลขที่ 1: ");
            num1 = sc.nextDouble();
            System.out.println("ป้อนตัวเลขที่ 2: ");
            num2 = sc.nextDouble();
            System.out.println("----------------");
            result[5] = num1 / num2;
            System.out.println("ผลหารของ"+num1+"/"+num2+"มีค่าเป็น"+ result[5]);
        }catch (InputMismatchException ex){
            System.out.println("มีข้อผิดพลาดจากการป้อน กรุณาป้อนแค่ตัวเลขเท่านั้น");
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("มีข้อผิดพลาดเกิดขึ้นติดต่อใครสักคนเองนะครับ");
        }catch (Exception ex){
            System.out.println("SW พบปัญหาบางอย่าง กรุณาติดต่อ IT");
        }
    }
}
