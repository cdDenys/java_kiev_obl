package com.company;

import java.util.Scanner;

public class Teams {
    public static double getResult(double first, double second){
        double percent = 0;
        if (first > second){
            percent = ((first / second) * 100) - 100;
        }else if(second > first){
            percent = ((second / first) * 100) - 100;
        }
        return percent;
    }
    public static String whoWin(double first, double second){
        if (first > second){
            return "First team is wining";
        }else{
            return "Second team is wining";
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter name of first team: ");
        String firstName = scan.next();
        System.out.println("Please enter score for first team: ");
        double firstTeam = scan.nextInt();
        System.out.println("Please enter name of second team: ");
        String secondName = scan.next();
        System.out.println("Please enter score for second team: ");
        double secondTeam = scan.nextInt();
        System.out.println("Name: " + firstName + ". Score: " + firstTeam);
        System.out.println("Name: " + secondName + ". Score: " + secondTeam);
        System.out.println(whoWin(firstTeam, secondTeam));
        System.out.println("Wins on " + getResult(firstTeam, secondTeam) + "%");
    }
}
