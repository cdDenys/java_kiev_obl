package com.company;

public class EvenOrOdd {

    public static void main(String[] args) {
        int firstNum = Integer.parseInt(args[0]);
        if ((firstNum % 2) == 0){
            System.out.println("Is even");
        }else{
            System.out.println("Is odd");
        }
    }
}
