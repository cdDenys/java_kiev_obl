package com.company;

public class Cylinder {
    public static double getVolume(double radius, double height){
        return Math.PI * Math.pow(radius, 2) * height;
    }
    public static void main(String[] args) {
        System.out.println("Please enter height: " + args[0]);
        double height = Integer.parseInt(args[0]);
        System.out.println("Please enter radius: " + args[1]);
        double radius = Integer.parseInt(args[1]);
        System.out.println("Volume is: " + getVolume(radius, height));
    }
}
