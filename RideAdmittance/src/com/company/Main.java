package com.company;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("Please enter your height in whole inches.");
        int heightInInches = in.nextInt();

        if (heightInInches > 80)
        {
            System.out.print("NO");
        }
        else if (heightInInches > 53)
        {
            System.out.print("GREEN");
        }
        else if (heightInInches > 36)
        {
            System.out.print("YELLOW");
        }
        else
        {
            System.out.print("RED");
        }

        System.out.println(" BAND");
    }
}
