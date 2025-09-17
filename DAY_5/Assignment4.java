class Vehicle {
    public void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car engine starts");
    }
}

public class Assignment4 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Vehicle c = new Car();
        
        v.start();
        c.start();
    }
}
