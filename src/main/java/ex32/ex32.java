/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Berkay Arslan
 */

package ex32;
import java.util.*;
public class ex32
{
    public static void main(String[] args)
    {
        System.out.println("Let's play Guess the Number!");
        int realNumber;
        realNumber = (int)(Math.random() * 999 + 1);
        Scanner sc = new Scanner(System.in);
        int guess,total=0,key;
        while(true)
        {
            total=0;
            System.out.print("Difficulty level(1/2/3): ");
            key=sc.nextInt();
            if(key==1)
                realNumber = (int) (Math.random() * 10 + 1);
            else if(key==2)
                realNumber = (int) (Math.random() * 100 + 1);
            else
                realNumber = (int) (Math.random() * 1000 + 1);
            System.out.print("I have my number. What's your guess? ");
            do
            {
                guess = sc.nextInt();
                total++;
                if(guess == realNumber)
                {
                    System.out.println("You got it in "+total+" guesses!");
                }
                else if(guess < realNumber)
                    System.out.println("Too low. Guess again: ");
                else if(guess > realNumber)
                    System.out.println("Too high. Guess again: ");
            }
            while(guess != realNumber);
            System.out.print("\nDo you wish to play again (Y/N)? ");
            char s=sc.next().charAt(0);
            if(s=='N' || s=='n')
                break;
        }
    }
}
