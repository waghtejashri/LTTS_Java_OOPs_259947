// Question5

import java.util.*;

class Employee2 {
    private String name, address, mobile;

    // getter
    public String getName() {
        return name;
    }

    public String getadd() {
        return address;
    }

    public String getmobile() {
        return mobile;
    }

    // setter
    public void setVar(String name, String address, String mobile) {
        this.name = name;
        this.address = address;
        this.mobile = mobile;
    }
}

public class EmployeeMain2 {
    public static void main(String[] args) {
        int ch;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = in.nextLine();
        System.out.println("Enter Address: ");
        String add = in.nextLine();
        System.out.println("Enter Mobile: ");
        String mob = in.nextLine();
        Employee2 e = new Employee2();
        System.out.println("Employee Details: ");
        e.setVar(name, add, mob);
        System.out.println("Name:" + e.getName() + "\n" + "Address:" + e.getadd() + "\n" + "Mobile:" + e.getmobile());
        do {
            e.setVar(name, add, mob);
            System.out.println(
                    "Verify and Update the details: \nMenu \n1.Update Employee name \n2.Update Employee Address \n3.Update Employee mobile \n4.All information correct/Exit");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Current name is:" + e.getName() + "\nEnter the name:");
                    name = in.next();
                    break;

                case 2:
                    System.out.println("Current Address is:" + e.getadd() + "\nEnter the Address:");
                    add = in.next();
                    break;

                case 3:
                    System.out.println("Current Mobile is:" + e.getmobile() + "\nEnter the Mobile:");
                    mob = in.next();
                    break;

                case 4:
                    System.out.printf("\nThe details are: \nName: %s \nAddress: %s \nMobile: %s \n", e.getName(),
                            e.getadd(), e.getmobile());
                    break;
            }

        } while (ch != 4);
        in.close();
    }

}