// Defining the class
class Car {
    // Attributes of the class
    String model;
    String color;
    // Constructor to initialize the object
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // Function of the class
    void start() {
        System.out.println(model + " started.");
    }
    void stop() {
        System.out.println(model + " stopped.");
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating an object (instance) of the Car class
        Car myCar = new Car("Sedan", "Black");

        System.out.println(myCar.color);
        myCar.start();
        myCar.stop();
    }
}
