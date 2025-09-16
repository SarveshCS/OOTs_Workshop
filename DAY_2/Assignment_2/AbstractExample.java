abstract class Shape {
    abstract void numberOfSides();
}

class Trapezoid extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Trapezoid has 4 sides");
    }
}

class Triangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Triangle has 3 sides");
    }
}

class Hexagon extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Hexagon has 6 sides");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        
        Shape shape;
        
        shape = new Trapezoid();
        shape.numberOfSides();
        
        shape = new Triangle();
        shape.numberOfSides();
        
        shape = new Hexagon();
        shape.numberOfSides();
    }
}