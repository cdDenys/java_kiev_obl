package com.company;

public class Calculator {
    public static void result(int a , int b, String c){
        switch (c) {
            case "+":
                System.out.println("Result is: " + a + b);
                break;
            case "-":
                System.out.print("Result is: ");
                System.out.println(a - b);
                break;
            case "*":
                System.out.println("Result is: " + a * b);
                break;
            case "/":
                System.out.println("Result is: " + a / b);
                break;
            case "%":
                System.out.println("Result is: " + a % b);
                break;
            case "|":
                System.out.println("Result is: " + Math.abs(a) + " " + Math.abs(b));
                break;
        }
    }
    public static void main(String[] args) {
        int firstNum = Integer.parseInt(args[0]);
        int secondNum = Integer.parseInt(args[2]);
        String operation = args[1];
        result(firstNum,secondNum, operation);

    }
}
