package day04_tasks;

public class CarDriverInfo {
    public static void main(String[] args) {
        String carModel = "Honda";
        String driverName = "MELEK";
        String licenseNum = " ABC123";
        short speed = 100;
        boolean isAutomatic = true;
        char licenceClass = 'B';

        String myList = "My car is: "+ carModel + "\nDriver name: "+driverName+ "\nLicence Number:"+licenseNum+"\nSpeed:"
                +speed+"\nIs this car automatic? "+isAutomatic+"\nLicence class:"+licenceClass;
        System.out.println(myList);


    }
}
