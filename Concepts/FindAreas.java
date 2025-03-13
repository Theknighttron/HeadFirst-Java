// Using Runt time polymophism

// class Figure {
abstract class Figure {
    double side1;
    double side2;

    Figure(double a, double b) {
        side1 = a;
        side2 = b;
    }

    // double area() {
    // System.out.println("Area for Figure is undefined");
    // return 0;
    // }

    abstract double area();

}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Rectangle");
        return side1 * side2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Triangle");
        return side1 * side2 / 2;
    }

}

public class FindAreas {
    public static void main(String[] args) {

        // Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;

        figref = r;
        System.out.println("Area is: " + figref.area());

        figref = t;
        System.out.println("Area is: " + figref.area());

        // figref = f;
        // System.out.println("Area is: " + figref.area());
    }
}
