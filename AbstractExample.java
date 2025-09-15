abstract class Shape {
    abstract void numberOfSides();
}

class Triangle extends Shape {
    void numberOfSides() {
        System.out.println("Triangle has 3 sides.");
    }
}

class Trapezoid extends Shape {
    void numberOfSides() {
        System.out.println("Trapezoid has 4 sides.");
    }
}

class Hexagon extends Shape {
    void numberOfSides() {
        System.out.println("Hexagon has 6 sides.");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Shape s1 = new Triangle();
        Shape s2 = new Trapezoid();
        Shape s3 = new Hexagon();

        s1.numberOfSides();
        s2.numberOfSides();
        s3.numberOfSides();
    }
}
