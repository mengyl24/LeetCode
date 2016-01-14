package com.practice;

import java.lang.Math;

/**
 * Created by Yilong Meng on 1/14/2016.
 */
public class Circle {

    private double radius = 1;
    private final static double PI = Math.PI;

    /**
     * Find the area of this circle
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        Circle myCircle = new Circle();
        System.out.println("Radius is " + myCircle.radius);
        System.out.println("PI is " + Circle.PI);
    }

}
