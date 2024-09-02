package b09.b2;

class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

class Driver {
    private String name;
    private Car car;  // Association: Driver "has a" Car

    public Driver(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public void drive() {
        System.out.println(name + " is driving a " + car.getModel());
    }
}

public class Association {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        Driver driver = new Driver("John", car);
        driver.drive();  // Output: John is driving a Toyota
    }
}
