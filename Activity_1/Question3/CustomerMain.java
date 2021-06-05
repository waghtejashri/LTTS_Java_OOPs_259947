
//Question3
import java.util.Scanner;

class Customer {
    private String name, address, mobile;

    // getter methods
    public String getName() {
        return name;
    }

    public String getadd() {
        return address;
    }

    public String getmobile() {
        return mobile;
    }

    // setter method
    public void setVar(String name, String address, String mobile) {
        this.name = name;
        this.address = address;
        this.mobile = mobile;
    }
}

public class CustomerMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Customer c = new Customer();
        System.out.println("Enter Details: ");
        String inp = sc.nextLine();
        String[] inputArr = inp.split(",");
        c.setVar(inputArr[0], inputArr[1], inputArr[2]);
        System.out.println("Name:" + c.getName() + "\nAddress:" + c.getadd() + "\nMobile:" + c.getmobile());
        sc.close();
    }

}