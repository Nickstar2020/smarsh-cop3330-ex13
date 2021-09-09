/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package org.example;
import java.util.Scanner;

public class assignment13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //ask for principal
        System.out.println("Enter the principal:");
        double P = scan.nextDouble();

        //ask for rate of interest and convert number to percentage
        System.out.println("Enter the rate of interest:");
        double r = scan.nextDouble() / 100;

        //ask for time in years
        System.out.println("Enter the number of years:");
        double t = scan.nextDouble();

        //ask for interest compound
        System.out.println("What is the number of times interest is compounded per year?");
        double n = scan.nextDouble();

        //print out the output
        double A =  P * Math.pow( (1 + (r / n)), (n * t));
        System.out.println("$" + String.format("%.2f", P) + " invested at "+ (r*100) + "% for " + t + " years compounded " + n + " times per year is $" + (double)Math.round(A * 100)/100);
    }

}
