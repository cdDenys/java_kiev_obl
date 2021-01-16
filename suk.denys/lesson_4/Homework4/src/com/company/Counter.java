package com.company;

public class Counter {

    public static void main(String[] args) {
        System.out.println("Please enter first number: " + args[0]);
        int firstNum = Integer.parseInt(args[0]);
        System.out.println("Please enter second number: " + args[1]);
        int secondNum = Integer.parseInt(args[1]);
        int countAmount = firstNum + secondNum;
		System.out.println("Result is: " + countAmount);
    }
}
