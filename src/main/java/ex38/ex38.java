/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Berkay Arslan
 */

package ex38;
import java.util.*;
public class ex38
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String data = in.nextLine();
        String list[] = data.split(" ");
        Integer evenNum[] = withEven(list);
        System.out.print("The even numbers are ");
        for(int i=0; i<evenNum.length; i++)
        {
            if(i < evenNum.length-1)
            {
                System.out.print(evenNum[i]+" ");
            }
            else
            {
                System.out.print(evenNum[i]+".");
            }
        }
    }
    public static Integer[] withEven(String list[])
    {
        ArrayList<Integer> newList = new ArrayList<>();
        for(int i=0; i<list.length; i++)
        {
            int num = Integer.parseInt(list[i]);
            if(num%2 == 0)
            {
                newList.add(num);
            }
        }
        Integer[]arr = new Integer[newList.size()];
        arr = newList.toArray(arr);
        return arr;
    }
}