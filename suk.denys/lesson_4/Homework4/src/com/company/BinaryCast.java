package com.company;

import java.util.Scanner;

public class BinaryCast {

    public static String getResult(int first, int second, int third){
        int pow = (int) Math.pow(first, second);
        String result = null;
        if (third == 2){
            result = Integer.toBinaryString(pow);
        }else if(third == 16){
            result = Integer.toHexString(pow);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNum = scan.nextInt();
        System.out.println("Please enter second number: ");
        int secondNum = scan.nextInt();
        System.out.println("Please enter numeric system(2 or 16): ");
        int thirdNum = scan.nextInt();
        System.out.println(getResult(firstNum, secondNum, thirdNum));
    }
}
