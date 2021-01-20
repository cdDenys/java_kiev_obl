package com.company;

public class NearTen {
    public static final int TEN = 10;
    public static void main(String[] args) {
        int firstNum = Integer.parseInt(args[0]);
        int secondNum = Integer.parseInt(args[1]);
        double firstModule = Math.abs(TEN - firstNum);
        double secondModule = Math.abs(TEN - secondNum);
        if (firstModule > secondModule){
            System.out.println("Near 10 is: " + secondNum);
        }else{
            System.out.println("Near 10 is: " + firstNum);
        }

    }
}
