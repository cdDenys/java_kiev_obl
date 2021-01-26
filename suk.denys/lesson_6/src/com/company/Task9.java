package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task9 {
    static void getNumbers(byte choseToMove, List<Integer> nums){
        if (choseToMove <= nums.size()) {
            nums.set(choseToMove - 1, 1);
            String temp = null;
            for (int i = 0; i < nums.size(); i++) {
                temp += nums.get(i);
            }
            String result = temp.replaceAll("null", "");
            System.out.println("Binary: " + result);
            System.out.println("Octal: " + Integer.parseInt(result, 2));
        } else {
            System.out.println("Please correct, length of binary number is: " + nums.size());
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = scan.nextInt();
        String binary = Integer.toBinaryString(num);
        long getBits = Integer.parseInt(binary);
        System.out.println(getBits);
        List<Integer> nums = new ArrayList<>();
        while (getBits != 0) {
            nums.add((int) (getBits % 10));
            getBits /= 10;
        }
        System.out.println("Enter bit to change");
        byte choseToMove = scan.nextByte();
        getNumbers(choseToMove, nums);
    }
}
