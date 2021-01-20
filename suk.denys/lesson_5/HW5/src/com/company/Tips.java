package com.company;

public class Tips {
    public static void billAndTips(int a, String b) {
        int temp;
        switch (b) {
            case "terrible":
                temp = 0;
                break;
            case "poor":
                temp = 5;
                break;
            case "good":
                temp = 10;
                break;
            case "great":
                temp = 15;
                break;
            case "excellent":
                temp = 20;
                break;
            default:
                temp = 0;
        }
        int tip = (a * temp) / 100;
        int whole = a + tip;
        System.out.println("Your bill is " + a + " and tips is " + tip);
        System.out.println("Whole amount:" + whole);
    }

    public static void main(String[] args) {
        int firstNum = Integer.parseInt(args[0]);
        String tips = args[1];
        billAndTips(firstNum, tips);
    }
}
