
//Question 1

import java.util.*;

class Vehicle {
    private String make, vehicleNumber, fuelType;
    private int fuelCapacity, cc;

    public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
        this.make = make;
        this.vehicleNumber = vehicleNumber;
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.cc = cc;
    }

    public String getMake() {
        return make;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getCc() {
        return cc;
    }

    public void displayMake() {
        System.out.println("***" + make + "***");
    }

    public void displayBasicInfo() {
        System.out.println("---Basic Information---");
        System.out.println("Basic Info\nVehicle Number: " + vehicleNumber + "\nFuel Type: " + fuelType
                + "\nFuel Capacity: " + fuelCapacity + "\nCC: " + cc);
    }

    public void displayDetailInfo() {
    }

}

class TwoWheeler extends Vehicle {
    private boolean kickStartAvailable;

    public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,
            boolean kickStartAvailable) {
        super(make, vehicleNumber, fuelType, fuelCapacity, cc);

        this.kickStartAvailable = kickStartAvailable;
    }

    public void displayDetailInfo() {
        System.out.println("---Detail Information---");
        if (kickStartAvailable) {
            System.out.println("kickStartAvailable: Yes");
        } else {
            System.out.println("kickStartAvailable: No");
        }
    }
}

class FourWheeler extends Vehicle {
    private String audioSystem;
    private int numberOfDoors;

    public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem,
            int numberOfDoors) {
        super(make, vehicleNumber, fuelType, fuelCapacity, cc);
        this.audioSystem = audioSystem;
        this.numberOfDoors = numberOfDoors;
    }

    public String getAudioSystem() {
        return audioSystem;

    }

    public int numberOfDoors() {
        return numberOfDoors;
    }

    public void displayDetailInfo() {
        System.out.println("---Detail Information---");
        System.out.println("Audio System: " + audioSystem + "\nNumber Of Doors: " + numberOfDoors);
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Four Wheeler\n2. Two Wheeler");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("Enter make: ");
            String make = sc.next();
            System.out.print("\nEnter Vehicle Number: ");
            String vehicleNumber = sc.next();
            System.out.print("\nEnter Fuel Type: 1.Diesel\n2.Petrol");
            int ch = sc.nextInt();
            String fuelType;
            if (ch == 1)
                fuelType = "Diesel";
            else
                fuelType = "Petrol";
            System.out.print("\nEnter Fuel Capacity: ");
            int fuelCapacity = sc.nextInt();
            System.out.print("\nEnter CC: ");
            int cc = sc.nextInt();
            System.out.print("\nEnter Audio System: ");
            String audioSystem = sc.next();
            System.out.print("\nEnter Number of Doors: ");
            int numberOfDoors = sc.nextInt();
            FourWheeler fw = new FourWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc, audioSystem,
                    numberOfDoors);
            fw.displayMake();
            fw.displayBasicInfo();
            fw.displayDetailInfo();
        } else {
            System.out.print("\nEnter Make: ");
            String make = sc.next();
            System.out.print("\nEnter Vehicle Number: ");
            String vehicleNumber = sc.next();
            System.out.print("\nEnter Fuel Type: 1.Diesel\n2.Petrol");
            int fuelChoice = sc.nextInt();
            String fuelType;
            if (fuelChoice == 1)
                fuelType = "Diesel";
            else
                fuelType = "Petrol";
            System.out.print("\nEnter Fuel Capacity: ");
            int fuelCapacity = sc.nextInt();
            System.out.print("\nEnter CC: ");
            int cc = sc.nextInt();
            System.out.print("\nKickStart");
            boolean kickStartAvailable = sc.nextBoolean();
            TwoWheeler tw = new TwoWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc, kickStartAvailable);
            tw.displayMake();
            tw.displayBasicInfo();
            tw.displayDetailInfo();
        }
        sc.close();
    }
}
