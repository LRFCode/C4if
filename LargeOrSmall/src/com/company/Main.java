package com.company;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("Please enter a whole number.");
        int number = in.nextInt();

        System.out.println("You entered: " + number);

        if (number > 99)
        {
            System.out.println("The number is large.");
        }
        else if (number < 10)
        {
            System.out.println("The number is small.");
        }
        else
        {
            System.out.println("The number is neither large nor small.");
        }
    }
}
