package com.company;

import java.util.Scanner;

public class Triangle {

    public static int getThirdLine(int firstLine, int secondLine){
        int thirdLine = 0;
        if (firstLine != secondLine){
            thirdLine = (int) (Math.sqrt((firstLine * firstLine) + (secondLine * secondLine)));
        }
        return thirdLine;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first line: ");
        int firstNum = scan.nextInt();
        System.out.println("Please enter second line: ");
        int secondNum = scan.nextInt();
        System.out.println("Third line is: " + getThirdLine(firstNum, secondNum));
    }
}
