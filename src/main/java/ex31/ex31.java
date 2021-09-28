/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Berkay Arslan
 */

package ex31;
import java.util.*;
public class ex31
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        float rate;
        try
        {
            System.out.print("Enter Age: ");
            int age = s.nextInt();
            System.out.print("Enter resting heart rate: ");
            float heartRate = s.nextFloat();
            System.out.println("Resting Pulse: " + heartRate + "      Age: " + age);
            System.out.println("Intensity | Rate");
            System.out.println("--------- | -------");
            for (int i = 55; i <= 95; i += 5)
            {
                rate = (((220-age)-heartRate)*i/100) + heartRate;
                System.out.println(i + "%" + "       | " + Math.round(rate) + " bpm");
            }
        }
        catch(Exception e)
        {
            System.out.println("Enter numbers!");
        }
    }
}
