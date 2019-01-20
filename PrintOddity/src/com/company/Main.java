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

        boolean number1IsOdd = (number1 % 2 == 1);
        boolean number1IsEven = (number1 % 2 == 0);
        boolean number2IsOdd = (number2 % 2 == 1);
        boolean number2IsEven = (number2 % 2 == 0);

        if (number1IsOdd && number2IsOdd)
        {
            System.out.println("Two odds make an even and that number is " + (number1 + number2));
        }
        else if (number1IsEven && number2IsEven)
        {
            System.out.println("Two evens make an even and that number is " + (number1 + number2));
        }
        else if (number1IsOdd)
        {
            System.out.println("The odd number is " + number1);
            System.out.println("The even number is " + number2);
        }
        else
        {
            System.out.println("The odd number is " + number2);
            System.out.println("The even number is " + number1);
        }
    }
}
