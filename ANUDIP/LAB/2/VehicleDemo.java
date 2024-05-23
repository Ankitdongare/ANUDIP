class Vehicle {
    public void startEngine() {
        System.out.println("Engine Start");
    }

    public void stopEngine() {
        System.out.println("Engine Stop");
    }
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("The car engine starts ");
    }

    @Override
    public void stopEngine() {
        System.out.println("The car engine stops ");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("The motorcycle engine starts ");
    }

    @Override
    public void stopEngine() {
        System.out.println("The motorcycle engine stops ");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.startEngine();
        c.stopEngine();

        Motorcycle m = new Motorcycle();
        m.startEngine();
        m.stopEngine();


    }
}
