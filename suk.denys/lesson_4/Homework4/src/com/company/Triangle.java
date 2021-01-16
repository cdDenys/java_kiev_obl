package com.company;

public class Triangle {

    public static int getThirdLine(int firstLine, int secondLine){
        int thirdLine = 0;
        if (firstLine != secondLine){
            thirdLine = (int) (Math.sqrt((firstLine * firstLine) + (secondLine * secondLine)));
        }
        return thirdLine;
    }
    public static void main(String[] args) {
        System.out.println("Please enter first line: " + args[0]);
        int firstNum = Integer.parseInt(args[0]);
        System.out.println("Please enter second line: " + args[1]);
        int secondNum = Integer.parseInt(args[1]);
        System.out.println("Third line is: " + getThirdLine(firstNum, secondNum));
    }
}
