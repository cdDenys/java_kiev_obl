package com.company;

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
        System.out.println("Please enter name of first team: " + args[0]);
        String firstName = args[0];
        System.out.println("Please enter score for first team: " + args[1]);
        double firstTeam = Integer.parseInt(args[1]);
        System.out.println("Please enter name of second team: " + args[2]);
        String secondName = args[2];
        System.out.println("Please enter score for second team: " + args[3]);
        double secondTeam = Integer.parseInt(args[3]);
        System.out.println("Name: " + firstName + ". Score: " + firstTeam);
        System.out.println("Name: " + secondName + ". Score: " + secondTeam);
        System.out.println(whoWin(firstTeam, secondTeam));
        System.out.println("Wins on " + getResult(firstTeam, secondTeam) + "%");
    }
}
