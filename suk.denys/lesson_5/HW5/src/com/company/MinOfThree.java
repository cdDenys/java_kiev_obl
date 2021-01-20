package com.company;

public class MinOfThree {
    public static void getResult(int firstNum, int secondNum, int thirdNum) {
        int temp;
        if (firstNum == secondNum && firstNum == thirdNum) {
            System.out.println("Min is:" + firstNum + " " + secondNum + " " + thirdNum);
        } else if (secondNum == thirdNum) {
            temp = secondNum;
            if (temp < firstNum) {
                System.out.println("Min is: " + temp + " " + temp);
            }
        } else if (thirdNum == firstNum) {
            temp = thirdNum;
            if (temp < secondNum) {
                System.out.println("Min is: " + temp + " " + temp);
            }
        } else if (firstNum == secondNum) {
            temp = firstNum;
            if (temp < thirdNum) {
                System.out.println("Min is: " + temp + " " + temp);
            }
        } else {
            if (firstNum < secondNum && firstNum < thirdNum) {
                System.out.println("Min is: " + firstNum);
            } else if (secondNum < firstNum && secondNum < thirdNum) {
                System.out.println("Min is: " + secondNum);
            } else {
                System.out.println("Min is: " + thirdNum);
            }
        }
    }

    public static void main(String[] args) {

        int firstNum = Integer.parseInt(args[0]);
        int secondNum = Integer.parseInt(args[1]);
        int thirdNum = Integer.parseInt(args[2]);
        System.out.println("Numbers:");
        System.out.println(firstNum);
        System.out.println(secondNum);
        System.out.println(thirdNum);
        System.out.println("-------------");
        getResult(firstNum, secondNum, thirdNum);
    }
}
