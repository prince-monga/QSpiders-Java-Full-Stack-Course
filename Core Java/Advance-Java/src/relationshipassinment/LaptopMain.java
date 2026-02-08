package relationshipassinment;

class Battery {
    int capacity;
    Battery(int capacity){ this.capacity = capacity; }
}

class Laptop {
    String brand;
    Battery battery;
    Laptop(String brand, Battery battery){
        this.brand = brand;
        this.battery = battery;
    }
}

class LaptopMain {
    public static void main(String[] args) {
        Battery b = new Battery(5000);
        Laptop l = new Laptop("Dell", b);
        System.out.println(l.brand + " battery " + l.battery.capacity + "mAh");
    }
}
