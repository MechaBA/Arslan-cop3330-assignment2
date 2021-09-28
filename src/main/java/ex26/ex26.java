/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Berkay Arslan
 */

package ex26;
import java.util.*;
public class ex26
{
    public static int monthsToPayOffCredit(double balance, double apr, double payment)
    {
        apr = apr / 365;
        return (int) Math.ceil((-1/30.0) * Math.log(1+balance/payment*(1-Math.pow(1+apr,30))) / Math.log(1+apr));
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double balance, APR, payment;
        System.out.print("What is your balance? ");
        balance = scanner.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        APR = scanner.nextDouble();
        APR = APR / 100;
        System.out.print("What is the monthly payment you can make? ");
        payment = scanner.nextDouble();
        int months = monthsToPayOffCredit(balance, APR, payment);
        System.out.println("It will take " + months + " months to pay off this card.");
    }
}
