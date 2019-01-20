package com.company;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Please enter the ticker number:");
        int ticketNumber = input.nextInt();

        int lastDigit = ticketNumber % 10;
        int ticketPrefix = ticketNumber / 10;

        boolean goodTicket = ticketPrefix % 7 == lastDigit;

        if (goodTicket)
        {
            System.out.println("Good Number");
        }
        else
        {
            System.out.println("Bad Number");
        }
    }
}
