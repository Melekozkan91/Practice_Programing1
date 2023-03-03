package day04_tasks;

public class Computer1 {
    public static void main(String[] args) {
        String firstName = "James";
        String lastName = "Bond";
        String companyName = "SpaceX";
        int salary =12000;
        int startMonth= 12;
        int startDay= 11;
        int startYears =2023;
         boolean areDayFullTime = true;
         String jobTitle ="SDET";
         String officeAdress ="123 Palatine 92612 CA";
         String mail="melekozkan@gmail.com";

         String practice ="Full name:\t\t\t\t"+ firstName + " "+lastName+ "\nStart date: \t\t\t"+startMonth+"/"+startDay+"/"+startYears+"\nE-mail:\t\t\t\t\t"+mail+"\nSalary After 3 Years:\t"+salary+"\nCampany Name:\t\t\t"+companyName+"\nJop title:\t\t\t\t"+jobTitle+"\nOffice Adress:\t\t\t"+officeAdress;

         System.out.println(practice);



    }
}
