package com.company;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("Please enter your first whole number.");
        int firstNumber = in.nextInt();

        System.out.println("Please enter your second whole number.");
        int secondNumber = in.nextInt();

        System.out.println("Please enter your third whole number.");
        int thirdNumber = in.nextInt();

        boolean inARow = (firstNumber + 1 == secondNumber) && (firstNumber + 2 == thirdNumber);

        if (inARow)
        {
            System.out.println("In a Row!");
        }
        else
        {
            System.out.println("Not in a row.");
        }
    }
}
