package com.task002;

public class Triangle {
    private double aSide;
    private double bSide;
    private double cSide;

    public Triangle() {
    }

    public Triangle(double aSide, double bSide, double cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    public void setaSide(double aSide) {
        this.aSide = aSide;
    }

    public void setbSide(double bSide) {
        this.bSide = bSide;
    }

    public void setcSide(double cSide) {
        this.cSide = cSide;
    }

    public void triangleArea() {
        double p = (aSide + bSide + cSide) / 2.0;
        double s = Math.sqrt(p * ((p - aSide) * (p - bSide) * (p - cSide)));

        if (Double.isNaN(s))
            System.out.println("A triangle cannot exist");
        else
            System.out.printf("Area of triangle = %.2f" ,s);
    }
}
