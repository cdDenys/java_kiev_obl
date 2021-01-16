package com.company;

import java.util.Scanner;

public class Cylinder {
    public static double getVolume(double radius, double height){
        return Math.PI * Math.pow(radius, 2) * height;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter height: ");
        double height = scan.nextInt();
        System.out.println("Please enter radius: ");
        double radius = scan.nextInt();
        System.out.println("Volume is: " + getVolume(radius, height));
    }
}
