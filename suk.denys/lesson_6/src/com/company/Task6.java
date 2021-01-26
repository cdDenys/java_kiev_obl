package com.company;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = new int[]{789, 445, 34, 4, 444, 778, 12, 1 , 0, -1908, 677788, 8};
        Arrays.sort(arr);
        System.out.println("Current array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Min of array is: " + arr[0]);
        System.out.println("Max of array is: " + arr[arr.length - 1]);
    }
}
