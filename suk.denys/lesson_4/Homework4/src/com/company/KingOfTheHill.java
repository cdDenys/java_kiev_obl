package com.company;

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
        System.out.println("Please enter first number: " + args[0]);
        int firstNum = Integer.parseInt(args[0]);
        System.out.println("Please enter second number: " + args[1]);
        int secondNum = Integer.parseInt(args[1]);
        System.out.println("Please enter third number: " + args[2]);
        int thirdNum = Integer.parseInt(args[2]);
        System.out.println("Biggest number is:" + getResult(firstNum, secondNum, thirdNum));
    }
}
