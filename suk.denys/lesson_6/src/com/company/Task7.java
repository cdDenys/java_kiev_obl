package com.company;

public class Task7 {
    static void getRes(int[] arr){
        for (int j = 0; j < arr.length; j++){
            int even = 0;
            int odd = 0;
            for (int k = 0; k < arr.length; k++){
                if((arr[k] % 2) == 0){
                    even += arr[k];
                }else{
                    odd += arr[k];
                }

            }
            System.out.println("Sum of even numbers: " + even);
            System.out.println("Sum of odd numbers: " + odd);
            break;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        System.out.println("Current array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        getRes(arr);
    }
}
