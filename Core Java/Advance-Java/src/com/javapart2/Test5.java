package com.javapart2;

class Gadget {
    void info() { System.out.println("General Gadget"); }
}

class Mobile extends Gadget {
    int ram = 8;
}

class Laptop extends Gadget {
    int storage = 512;
}

public class Test5 {
    public static void main(String[] args) {
        Gadget g = new Mobile();  // upcasting
        
        if(g instanceof Mobile) {
            Mobile m = (Mobile)g;
            System.out.println("Mobile RAM = " + m.ram);
        }
        if(g instanceof Laptop) {
            Laptop l = (Laptop)g;
            System.out.println("Laptop Storage = " + l.storage);
        }
    }
}
