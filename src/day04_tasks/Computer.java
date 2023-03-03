package day04_tasks;

public class Computer {
    public static void main(String[] args) {
         String brand ="Mac";
         String processor ="MacOs";
         int ramMemory =8;
         int storageMemory =123;
         int hasMonitor = 5;
         Boolean hasWifiCard = true;
         String description = " MacBook Pro";
         double price = 1.200;
         int cpu = 10;
         String color ="gray";
         int numberOfMonitors = 10;
         int numberOfTheUsbSlots = 3;
         double usb = 3.0;

         String computerDetails ="Brand:\t\t\t"+brand+"\nProcessor:\t\t"+processor+"\nRam Memory:\t\t"+ramMemory+
                 "\nStorage Memory:\t"+storageMemory+"\nNumbers of monitors:\t\t"+hasMonitor+"\nNumber of the usb slots:\t"+hasWifiCard+"\nDescription:   "+description+"\nPrice: \t\t\t"+price+"\nCPU:\t\t\t"+cpu+"\nComputer color:\t"+color+"\nMonitor number:\t"+numberOfMonitors+"\nNumber of usb slots:\t"+numberOfTheUsbSlots+
                 "\nUsb:\t\t\t" + usb;
System.out.println(" <---COMPUTER DETAILS --->");
         System.out.println(computerDetails);


    }
}
