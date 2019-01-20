package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("Please enter the first whole number.");
        int number1 = in.nextInt();

        System.out.println("Please enter the second whole number.");
        int number2 = in.nextInt();

        if (number1 > number2)
        {
            System.out.println("The largest number is: " + number1);
        }
        else if (number2 > number1)
        {
            System.out.println("The largest number is: " + number2);
        }
        else
        {
            System.out.println("The numbers are equal.");
        }
    }
}
