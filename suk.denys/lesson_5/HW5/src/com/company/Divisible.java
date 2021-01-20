package com.company;

public class Divisible {
    public static void main(String[] args) {
        int firstNum = Integer.parseInt(args[0]);
        int secondNum = Integer.parseInt(args[1]);
        if ((firstNum % secondNum) == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NOT");
        }
    }
}
