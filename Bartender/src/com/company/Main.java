package com.company;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("Please make your beverage choice from the following menu items:");
        System.out.println("For WATER, choose '1'.");
        System.out.println("For COLA,  choose '2'.");
        System.out.println("For ALE,   choose '3'.");
        System.out.println("What is your beverage selection?");

        int beverageChoice = in.nextInt();

        if (beverageChoice == 1)
        {
            System.out.println("Here is your water.");
        }
        else if (beverageChoice == 2)
        {
            System.out.println("Here is your cola.");
        }
        else if (beverageChoice == 3)
        {
            System.out.println("Please enter your age.");
            int customerAge = in.nextInt();

            if (customerAge > 20)
            {
                System.out.println("Here is your ale.");
            }
            else if (customerAge == 20)
            {
                System.out.println("No drink for you!  Come back in 1 year.");
            }
            else
            {
                System.out.println("No drink for you!  Come back in " + (21 - customerAge) + " years.");
            }
        }
        else
        {
            System.out.println("Sorry.  That is not a valid selection.");
        }
    }
}
