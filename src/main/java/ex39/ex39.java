/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Berkay Arslan
 */

package ex39;
import java.util.*;
public class ex39
{
    public static void main(String[] args)
    {
        Record[] rec =
                {
                        new Record("John", "Johnson", "Manager", new Date(2016-12-31)),
                        new Record("Tou", "Xiong", "Software Engineer", new Date(2016-10-05)),
                        new Record("Michaela", "Michaelson", "District Manager", new Date(2015-12-19)),
                        new Record("Jake", "Jacobson", "Programmer", null),
                        new Record("Jacquelyn", "Jackson", "DBA", null),
                        new Record("Sally", "Webber", "Web Developer", new Date(2015-12-18))
                };
        Scanner scan = new Scanner(System.in);
        System.out.print("Names: ");
        String target = scan.nextLine();
        System.out.println("\nResults:\n");
        System.out.printf("%-17s | %-17s | %-17s\n", "Name", "Position", "Separation Date");
        System.out.printf("%-17s|%-17s|%-17s\n", "-".repeat(18), "-".repeat(19), "-".repeat(18));
        for(Record record:rec)
        {
            String temp;
            if(record.separationDate == null) temp = "";
            else  temp = record.separationDate.toString();
            if(record.firstName.contains(target) || record.lastName.contains(target))
                System.out.printf("%-17s | %-17s | %-17s\n",  record.firstName + " " + record.lastName, record.position, temp);
        }
        scan.close();
    }
}
class Record
{
    String firstName;
    String lastName;
    String position;
    Date separationDate;
    public Record(String firstName, String lastName, String position, Date separationDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }
}
