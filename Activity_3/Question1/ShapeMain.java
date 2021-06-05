
// Question 1
import java.util.*;

abstract class Shape {
    int value;

    abstract void calculateArea(int value);
}

class Circle extends Shape {
    public void calculateArea(int value) {
        double area = 3.14 * value * value;
        System.out.println("Area of circle is: " + area);
    }
}

class Square extends Shape {
    public void calculateArea(int value) {
        int area = value * value;
        System.out.println("Area of Square is: " + area);
    }
}

class ShapeMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Circle\nSquare\nEnter the shape");
        String shape = sc.next();
        shape = shape.toLowerCase();
        if (shape.equals("circle")) {
            Circle c = new Circle();
            System.out.println("Enter the radius: ");
            int radius = sc.nextInt();
            c.calculateArea(radius);
        } else if (shape.equals("square")) {
            Square s = new Square();
            System.out.println("Enter the side: ");
            int side = sc.nextInt();
            s.calculateArea(side);
        }
        sc.close();
    }

}