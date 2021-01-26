package com.company;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] arr = new int[]{789, 445, 34, 4, 44, 778, 12, 1 , 0, -1908, 677788, 8};
        Arrays.sort(arr);
        System.out.println("First 5 min of array");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
