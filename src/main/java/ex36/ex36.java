/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Berkay Arslan
 */

package ex36;
import java.util.*;
import java.util.stream.Collectors;
public class ex36
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer>numbers = new ArrayList<Integer>();
        String entry = null;
        do
        {
            System.out.println("Enter a number: ");
            entry = input.next();
            if(!entry.equals("0"))
            {
                try
                {
                    int num = Integer.parseInt(entry);
                    numbers.add(num);
                }
                catch(NumberFormatException x)
                {
                }
            }
        }
        while(!entry.equals("0"));
        System.out.println("Numbers: "+numbers.stream().map(String::valueOf).collect(Collectors.joining(",")));
        System.out.println("The average is "+average(numbers));
        System.out.println("The minimum is "+min(numbers));
        System.out.println("The maximum is "+max(numbers));
        System.out.println("The standard deviation is "+String.format("%.2f", std(numbers)));
    }
    public static double average(ArrayList<Integer>numbers)
    {
        int total = 0;
        for(int n: numbers)
        {
            total += n;
        }
        double average = (double)(total)/numbers.size();
        return average;
    }
    public static int max(ArrayList<Integer>numbers)
    {
        int max=numbers.get(0);

        for(int n:numbers)
        {
            if(n>max)
                max = n;
        }
        return max;
    }
    public static int min(ArrayList<Integer>numbers)
    {
        int min= numbers.get(0);
        for(int n: numbers) {
            if(n < min)
                min = n;
        }
        return min;
    }
    public static double std(ArrayList<Integer>numbers)
    {
        double mean = average(numbers);
        double sum = 0;
        for(int num:numbers)
        {
            sum = sum + Math.pow((num-mean), 2);
        }
        double stdDeviation = Math.sqrt(sum/numbers.size());
        return stdDeviation;
    }
}