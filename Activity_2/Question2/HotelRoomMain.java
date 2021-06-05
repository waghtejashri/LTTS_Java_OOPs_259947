import java.util.*;

//Question 2

class HotelRoom {
    private String hotelName;
    private int numberOfSqFeet;
    private boolean hasTV, hasWifi;

    public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
        this.hotelName = hotelName;
        this.numberOfSqFeet = numberOfSqFeet;
        this.hasTV = hasTV;
        this.hasWifi = hasWifi;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getNumberOfSqFeet() {
        return numberOfSqFeet;
    }

    public void calculateTariff(int numberOfSqFeet, int rate) {
        // has to be filled
        int cost = numberOfSqFeet * rate;
        System.out.println("Room Tariff Per Day is: " + cost);
    }

    public int getRatePerSqFeet() {
        return 0;
    }
}

class DeluxeRoom extends HotelRoom {
    private int ratePerSqFeet;
    private boolean hasWifitrue;

    public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        hasWifitrue = hasWifi;
        ratePerSqFeet = 10;
    }

    public int getRatePerSqFeet() {
        if (hasWifitrue)
            return ratePerSqFeet + 2;
        else
            return ratePerSqFeet;
    }

}

class DeluxeACRoom extends DeluxeRoom {
    private int ratePerSqFeet;

    public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        ratePerSqFeet = 12;
    }

    public int getRatePerSqFeet() {
        return ratePerSqFeet;
    }
}

class SuiteACRoom extends HotelRoom {
    private int ratePerSqFeet;
    private boolean hasWifitrue;

    public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        hasWifitrue = hasWifi;
        ratePerSqFeet = 15;
    }

    public int getRatePerSqFeet() {
        if (hasWifitrue)
            return (ratePerSqFeet + 2);
        else
            return ratePerSqFeet;
    }
}

public class HotelRoomMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Hotel Tariff Calculator\n1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room\nSelect Room Type:");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Hotel Name:");
            String hotelName = sc.next();
            System.out.println("\nRoom Square Feet Area");
            int numberOfSqFeet = sc.nextInt();
            System.out.println("\nRoom has TV(Enter true/false)");
            boolean hasTV = sc.nextBoolean();
            System.out.println("\nRoom has Wifi(Enter true/false)");
            boolean hasWifi = sc.nextBoolean();
            DeluxeRoom dr = new DeluxeRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
            int rate = dr.getRatePerSqFeet();
            dr.calculateTariff(numberOfSqFeet, rate);
        } else if (choice == 2) {
            System.out.println("Hotel Name:");
            String hotelName = sc.next();
            System.out.println("\nRoom Square Feet Area");
            int numberOfSqFeet = sc.nextInt();
            System.out.println("\nRoom has TV(Enter true/false)");
            boolean hasTV = sc.nextBoolean();
            System.out.println("\nRoom has Wifi(Enter true/false)");
            boolean hasWifi = sc.nextBoolean();
            DeluxeACRoom dr = new DeluxeACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
            int rate = dr.getRatePerSqFeet();
            dr.calculateTariff(numberOfSqFeet, rate);
        } else if (choice == 3) {
            System.out.println("Hotel Name:");
            String hotelName = sc.next();
            System.out.println("\nRoom Square Feet Area");
            int numberOfSqFeet = sc.nextInt();
            System.out.println("\nRoom has TV(Enter true/false)");
            boolean hasTV = sc.nextBoolean();
            System.out.println("\nRoom has Wifi(Enter true/false)");
            boolean hasWifi = sc.nextBoolean();
            SuiteACRoom sar = new SuiteACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
            int rate = sar.getRatePerSqFeet();
            sar.calculateTariff(numberOfSqFeet, rate);
        }
        sc.close();
    }
}
