package com.company;

import java.util.Scanner;

public class Task5 {
    static void getResult(int[] arr, int num){
        if (num < arr.length && num >= 0){
            for (int i = 0; i < arr.length; i++){
                int temp = 0;
                for (int j = 0; j <= num; j++){
                    temp += arr[j];
                }
                System.out.println("Sum is: " + temp);
                break;
            }
        }else{
            System.out.println("Please correct, length of current array is: " + arr.length);
        }
    }
    public static void main(String[] args) {
        int[] arr = {22, 344 , 23, 1 , 3, 84, 0};
        System.out.println("Current array: ");
        for (int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter measure for finding of sum");
        int num = scan.nextInt();
        getResult(arr, num);
    }
}
