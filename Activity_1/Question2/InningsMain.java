//Question 2

import java.util.Scanner;

class Innings {
    private String teamname, inningsname;
    private int runs;

    // getter methods
    public String getname() {
        return teamname;
    }

    public String getinnings() {
        return inningsname;
    }

    public int getrun() {
        return runs;
    }

    // setter methods
    public void setVar(String teamname, String inningsname, int runs) {
        this.teamname = teamname;
        this.inningsname = inningsname;
        this.runs = runs;
    }

    public void displayInningsDetails() {
        switch (inningsname) {
            case "First":
                System.out.printf("\nName:" + getname() + "\n" + "Scored:" + getrun() + "\n" + "Need %d to win\n",
                        (getrun() + 1));
                break;
            case "Second":
                System.out.println("Name:" + getname() + "\nScored:" + getrun() + "\nMatch Ended.");
                break;
        }
    }
}

public class InningsMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the team name:");
        String tname = sc.nextLine();
        System.out.println("Enter session:");
        String inname = sc.next();
        System.out.println("Enter runs:");
        int run = sc.nextInt();
        Innings in = new Innings();
        in.setVar(tname, inname, run);
        in.displayInningsDetails();
        sc.close();
    }
}