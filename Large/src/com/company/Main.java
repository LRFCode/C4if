package com.company;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("Please enter a whole number.");
        int number = in.nextInt();

        if (number > 99)
        {
            System.out.println("You entered " + number + ".  That number is large.");
        }
        else
        {
            System.out.println("You entered " + number + ".  That number is not large.");
        }
    }
}
