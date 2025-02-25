package com.dti.workshop;

public class Myworkshop02 extends Myworkshop01 {
    private double cubeCircle;

    public double getCubeCircle() {
        return cubeCircle;
    }

    public void setCubeCircle(double cubeCircle) {
        this.cubeCircle = cubeCircle;
    }

    public void calCubeCircle() {
        cubeCircle = Math.PI * radius * radius * radius * 4 / 3;
    }

    @Override
    public void showAreaAndRoundCircle() {
        System.out.println("Area circle is " + areaCircle);
        System.out.println("Round circle is " + roundCircle);
        System.out.println("Cube circle is " + cubeCircle);
        System.out.println("--------------");
    }
}
