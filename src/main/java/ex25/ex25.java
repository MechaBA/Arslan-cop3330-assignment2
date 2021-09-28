/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Berkay Arslan
 */

package ex25;
import java.util.*;
public class ex25
{
    public static void passStrInd(String input)
    {
        int n = input.length();
        boolean lower = false, upper = false, digit = false, specialCharacter = false;
        Set<Character> set = new HashSet<Character>(Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));
        for(char i:input.toCharArray())
        {
            if(Character.isLowerCase(i))
                lower = true;
            if(Character.isUpperCase(i))
                upper = true;
            if(Character.isDigit(i))
                digit = true;
            if(set.contains(i))
                specialCharacter = true;
        }
        if(digit && lower || upper && specialCharacter && (n >= 8))System.out.println("It is a very strong password.");
        else if ((lower || upper || specialCharacter) && (n >= 8))System.out.println("It is a strong password.");
        else if (lower || upper && (n < 8))System.out.print("It is a weak password.");
        else
            System.out.print("It is a very weak password.");
    }
    public static void main(String[] args)
    {
        String input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Password: ");
        input = scan.nextLine();
        passStrInd(input);
    }
}