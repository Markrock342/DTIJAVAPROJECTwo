package com;

import java.util.Scanner;
import java.lang.String;
import java.lang.System




public class Firstclass {
    public static void main(String[] args) {
        String yourName;

        Scanner sc = new Scanner(System.in);

        System.out.println("ป้อนชื่อ : ");
        yourName = sc.next();
        System.out.println("----------------------");
        System.out.println("สวัสดี" + yourName);
    }
}
