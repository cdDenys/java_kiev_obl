package com.company;

import java.util.Scanner;

public class KingOfTheHill {
    public static int getResult(int first, int second,int third){
        int res;
        if (first > second && first > third){
            res = first;
        }else if(second > first && second > third){
            res = second;
        }else{
            res = third;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNum = scan.nextInt();
        System.out.println("Please enter second number: ");
        int secondNum = scan.nextInt();
        System.out.println("Please enter third number: ");
        int thirdNum = scan.nextInt();
        System.out.println("Biggest number is:" + getResult(firstNum, secondNum, thirdNum));

    }
}
