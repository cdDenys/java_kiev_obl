package com.company;

public class Rent {
    public static final int PRICE_PER_DAY = 40;

    public static void getPrice(int days) {
        int temp = 0;
        if (days <= 5) {
            temp = days * PRICE_PER_DAY;
        } else if (days == 6 || days == 7) {
            temp = (days * PRICE_PER_DAY) - 20;
        } else if (days > 7) {
            temp = (days * PRICE_PER_DAY) - 50;
        }
        System.out.println("Price: " + temp + "UAH per " + days + " days");
    }

    public static void main(String[] args) {
        int days = Integer.parseInt(args[0]);
        getPrice(days);
    }
}
