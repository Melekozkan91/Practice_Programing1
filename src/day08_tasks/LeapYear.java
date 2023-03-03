package day08_tasks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a year: ");

        int year = input.nextInt();
        System.out.println("Enter year is: "+ year);
        boolean isLeapYear = year%4 ==0;
        System.out.println("The "+year+" is a Leap Year: "+isLeapYear);

    }
}
