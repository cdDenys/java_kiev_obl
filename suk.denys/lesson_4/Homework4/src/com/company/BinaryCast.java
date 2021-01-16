package com.company;

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
        System.out.println("Please enter first number: " + args[0]);
        int firstNum = Integer.parseInt(args[0]);
        System.out.println("Please enter second number: " + args[1]);
        int secondNum = Integer.parseInt(args[1]);
        System.out.println("Please enter numeric system(2 or 16): " + args[2]);
        int thirdNum = Integer.parseInt(args[2]);
        System.out.println(getResult(firstNum, secondNum, thirdNum));
    }
}