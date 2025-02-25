package com.dti.bb;

import com.dti.aa.Myclass01;
import com.dti.aa.Myclass03;

public class Myclass04 extends Myclass03 {
    public int data1 = 100;
    public int data3 = 30;

    @Override
    public void showB() {
        int data3 = 333;
        System.out.println(data3);
        System.out.println("Wow wow wow" + this.data3);
        System.out.println(data1);
        System.out.println(super.data1);
        System.out.println(data2);
        System.out.println(super.data2);
    }
     public Myclass04(){
        System.out.println("Hello....");
     }
}
