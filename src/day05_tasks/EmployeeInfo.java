package day05_tasks;

public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName = "James";
        String lastName ="Bond";
        char gender ='M';
        int age = 40;
        String companyName ="MI6";
        Boolean areTheFullTime = true;
        String jobTitle = " Special Agent";
        int salary = 1000000;
        int numberOfPhoto = 15;
        boolean areTheyMarried = false;
        char suite ='A';

        String printOut= "Employment information for "+ firstName +" "+ lastName+ "\n"+ "Gender: " + gender + "\n"+
                "Special Agent at " + companyName + "\nCurrently " + age + "years old \n"+ companyName +
                " is located in suite " + suite + "\n" + "This years salary comes to " + salary + "\n" + "Other details:\n" + "PTO:" + age +"\n"+ "Full time? "+ areTheFullTime + "\n"+ "Married? " + areTheyMarried;

        System.out.println(printOut);












    }





}
