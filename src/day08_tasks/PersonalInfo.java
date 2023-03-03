package day08_tasks;

import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your age: ");
        byte age= input.nextByte();
        System.out.println("Enter your favorite number: ");
        long favoriteNumber = input.nextLong();

        boolean isStudent= age >=18 && age <=25;
        System.out.println("You are a student: "+isStudent);
    }
}
