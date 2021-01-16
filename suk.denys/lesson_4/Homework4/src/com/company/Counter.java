package com.company;

import java.util.Scanner;

public class Counter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNum = scan.nextInt();
        System.out.println("Please enter second number: ");
        int secondNum = scan.nextInt();
        int countAmount = firstNum + secondNum;
		System.out.println("Result is: " + countAmount);
    }
}
