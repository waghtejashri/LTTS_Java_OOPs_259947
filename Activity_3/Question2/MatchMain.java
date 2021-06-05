
// Question2
import java.util.*;

abstract class Match {
    private static int currentScore, target;
    private static float currentOver;

    public void setValue(int curr, float cur, int t) {
        currentScore = curr;
        currentOver = cur;
        target = t;
    }

    public int getScore() {
        return currentScore;
    }

    public static float getOver() {
        return currentOver;
    }

    public static int getTarget() {
        return target;
    }

    abstract public float calculateRunRate();

    abstract public int calculateBalls();

    abstract public void display(double reqRunrate, int balls);

}

class ODIMatch extends Match {

    public float calculateRunRate() {
        float rr = getTarget() - getScore();
        return (rr / calculateBalls()) * 6;

    }

    public int calculateBalls() {
        return 300 - ((int) getOver() * 6);
    }

    public void display(double reqRunrate, int balls) {
        System.out.println("Requirements:");

        System.out.println("Need " + (getTarget() - getScore()) + " runs in " + balls + " balls");

        System.out.printf("Required Runrate: %.2f\n", reqRunrate);
    }
}

class T20Match extends Match {

    public float calculateRunRate() {
        float rr = getTarget() - getScore();
        return (rr / calculateBalls()) * 6;

    }

    public int calculateBalls() {
        return 120 - ((int) getOver() * 6);
    }

    public void display(double reqRunrate, int balls) {
        System.out.println("Requirements:");

        System.out.println("Need " + (getTarget() - getScore()) + " runs in " + balls + " balls");

        System.out.printf("Required Runrate: %.2f\n", reqRunrate);
    }
}

class TestMatch extends Match {

    public float calculateRunRate() {
        float rr = getTarget() - getScore();
        return (rr / calculateBalls()) * 6;

    }

    public int calculateBalls() {
        return 540 - ((int) getOver() * 6);
    }

    public void display(double reqRunrate, int balls) {
        System.out.println("Requirements:");

        System.out.println("Need " + (getTarget() - getScore()) + " runs in " + balls + " balls");

        System.out.printf("Required Runrate: %.2f\n", reqRunrate);
    }
}

public class MatchMain {
    public static void main(String[] args) {
        int curr, score, ball;
        float over, rrr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the match format");
        System.out.println("1. ODI");
        System.out.println("2. T20");
        System.out.println("3. Test");
        int op = sc.nextInt();
        Match match;
        switch (op) {
            case 1:
                ODIMatch o = new ODIMatch();
                match = o;
                System.out.println("Enter the Current Score");
                curr = sc.nextInt();
                System.out.println("Enter the Current Over");
                over = sc.nextFloat();
                System.out.println("Enter the Target Score");
                score = sc.nextInt();
                match.setValue(curr, over, score);
                rrr = match.calculateRunRate();
                ball = match.calculateBalls();
                match.display(rrr, ball);
                break;

            case 2:
                T20Match t = new T20Match();
                match = t;
                System.out.println("Enter the Current Score");
                curr = sc.nextInt();
                System.out.println("Enter the Current Over");
                over = sc.nextFloat();
                System.out.println("Enter the Target Score");
                score = sc.nextInt();
                match.setValue(curr, over, score);
                rrr = match.calculateRunRate();
                ball = match.calculateBalls();
                match.display(rrr, ball);

            case 3:
                TestMatch m = new TestMatch();
                match = m;
                System.out.println("Enter the Current Score");
                curr = sc.nextInt();
                System.out.println("Enter the Current Over");
                over = sc.nextFloat();
                System.out.println("Enter the Target Score");
                score = sc.nextInt();
                match.setValue(curr, over, score);
                rrr = match.calculateRunRate();
                ball = match.calculateBalls();
                match.display(rrr, ball);

        }
        sc.close();
    }
}
