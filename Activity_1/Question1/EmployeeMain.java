//Question 1

import java.util.Scanner;

class Employee {
    private String name, address, mobile;

    // SETTER METHODS
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;

    }

    // GETTER METHODS
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;

    }

}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the name:");
            String name = sc.next();
            emp.setName(name);
            System.out.println("Enter Address:");
            String address = sc.next();
            emp.setAddress(address);
            System.out.println("Enter Mobile:");
            String Mobile = sc.next();
            emp.setMobile(Mobile);

            System.out.println("Employee Details");
            System.out.println("Name: " + emp.getName());
            System.out.println("Address: " + emp.getAddress());
            System.out.println("Mobile: " + emp.getMobile());
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}
