
//Question4
import java.util.*;

class Company {
    private String name, employees, teamlead;

    // getter methods
    public String getName() {
        return name;
    }

    public String getemployee() {
        return employees;
    }

    public String getlead() {
        return teamlead;
    }

    // setter method
    public void setVar(String name, String employees, String teamlead) {
        this.employees = employees;
        this.name = name;
        this.teamlead = teamlead;
    }
}

public class CompanyMain {
    public static void main(String args[]) {
        Company c = new Company();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the company name:");
        String name = sc.nextLine();
        System.out.println("Enter the employees:");
        String employees = sc.nextLine();
        System.out.println("Enter TeamLead:");
        String teamlead = sc.nextLine();
        c.setVar(name, employees, teamlead);
        String[] emparr = employees.split(",");
        boolean contains = Arrays.stream(emparr).anyMatch(teamlead::equals);
        if (contains)
            System.out.println("Name:" + c.getName() + "\nEmployees:" + c.getemployee() + "\nLead:" + c.getlead());
        else
            System.out.println("Invalid Input.");

        sc.close();
    }
}
