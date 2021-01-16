package com.company;

public class Champagne {
    public static final double BOTTLE = 750;
    public static final double GLASS = 100;

    public static double getChampagne(int peoples) {
        double amountOfPeople = BOTTLE / GLASS;
        double result = peoples / amountOfPeople;
        if (result > 0) {
            result++;
        }
        return (int) result;

    }

    public static double restChampagne(int peoples) {
        double forPerson = BOTTLE / GLASS;
        double rest;
        if ((peoples % forPerson) == 0) {
            rest = 0;
        } else {
            double temp = peoples / forPerson;
            rest = (getChampagne(peoples) - temp) * BOTTLE;
        }
        return rest;
    }

    public static void main(String[] args) {
        System.out.println("Please enter amount of people: " + args[0]);
        int peoples =Integer.parseInt(args[0]);
        System.out.println("We needs " + getChampagne(peoples) + " bottles.");
        System.out.println("Rest of champagne: " + restChampagne(peoples) + "ml.");
    }
}
