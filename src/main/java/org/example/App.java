package org.example;

import java.util.Scanner;

/*
 *   UCF COP 3330 Fall 2021 Assignment 10 Solution
 *   Copyright 2021 Donovan Reynolds
 */
public class App 
{
    public static void main( String[] args )
    {
        String price1Text = inputOutput("Enter the price of item 1: ");
        String quant1Text = inputOutput("Enter the quantity of item 1: ");
        String price2Text = inputOutput("Enter the price of item 2: ");
        String quant2Text = inputOutput("Enter the quantity of item 2: ");
        String price3Text = inputOutput("Enter the price of item 3: ");
        String quant3Text = inputOutput("Enter the quantity of item 3: ");

        double price1 = Double.parseDouble(price1Text);
        double quant1 = Double.parseDouble(quant1Text);
        double price2 = Double.parseDouble(price2Text);
        double quant2 = Double.parseDouble(quant2Text);
        double price3 = Double.parseDouble(price3Text);
        double quant3 = Double.parseDouble(quant3Text);

        double subtotal = (price1 * quant1) + (price2 * quant2) + (price3 * quant3);
        double tax = subtotal * .055;
        double total = subtotal + tax;

        String output = String.format("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f",subtotal,tax,total);

        System.out.println(output);



    }

    public static String inputOutput(String textToSay)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(textToSay);
        return input.nextLine();
    }
}
