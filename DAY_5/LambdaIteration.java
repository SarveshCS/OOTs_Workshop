import java.util.*;

class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

 class LambdaIteration {
    public static void main(String[] args) {
        
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2022));
        cars.add(new Car("Honda", "Amaze", 2023));
        cars.add(new Car("Tata", "Safari", 2021));

        System.out.println("Iterating through the list of cars:");
        cars.forEach(car -> System.out.println(car));
    }
}