package relationshipassinment;

class Car {
    String model;
    Car(String model){ this.model = model; }
}

class Ola {
    String driver;
    Car car;
    Ola(String driver, Car car){
        this.driver = driver;
        this.car = car;
    }
}

class OlaMain {
    public static void main(String[] args) {
        Car c = new Car("Swift");
        Ola o = new Ola("Ravi", c);
        System.out.println(o.driver + " drives " + o.car.model);
    }
}
