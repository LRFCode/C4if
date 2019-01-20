package com.company;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("Please enter a single letter.");
        char bingoLetter = in.next().charAt(0);

        System.out.println("Please enter a whole number.");
        int bingoNumber = in.nextInt();

        boolean comboIsValidForB = bingoLetter == 'B' && bingoNumber >= 1 && bingoNumber <= 15;
        boolean comboIsValidForI = bingoLetter == 'I' && bingoNumber >= 16 && bingoNumber <= 30;
        boolean comboIsValidForN = bingoLetter == 'N' && bingoNumber >= 31 && bingoNumber <= 45;
        boolean comboIsValidForG = bingoLetter == 'G' && bingoNumber >= 46 && bingoNumber <= 60;
        boolean comboIsValidForO = bingoLetter == 'O' && bingoNumber >= 61 && bingoNumber <= 75;

        if (comboIsValidForB ||
            comboIsValidForI ||
            comboIsValidForN ||
            comboIsValidForG ||
            comboIsValidForO)
        {
            System.out.println("Valid.");
        }
        else
        {
            System.out.println("INVALID.");
        }
    }
}
