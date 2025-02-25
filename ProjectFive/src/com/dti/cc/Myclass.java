package com.dti.cc;

//ประเภทของคลาส

class SauClass01 {
    public  int aa;
    public void showHello(){

    }


}
//2.Abstact class
abstract class SauClass02{
    public int aa;
    public void showHello(){  }
    public abstract void showHi();

}

//3.Interface class สร้าง Object ไม่ได้
interface SauClass03{
    public static final int aa = 1000;
    public int bb = 2000;
    public abstract void showHi();
}


