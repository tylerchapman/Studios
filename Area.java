package org.launchcode.java.studios;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Area {

    static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double radius = in.nextDouble();
        double area = getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }

    private static double getArea(double radius) {
        return PI * pow(radius, 2);
    }

}
