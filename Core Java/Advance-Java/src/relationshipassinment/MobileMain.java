package relationshipassinment;

class SIM {
    String company;
    SIM(String company){ this.company = company; }
}

class Mobile {
    String brand;
    SIM sim;
    Mobile(String brand, SIM sim){
        this.brand = brand;
        this.sim = sim;
    }
}

class MobileMain {
    public static void main(String[] args) {
        SIM s = new SIM("Jio");
        Mobile m = new Mobile("Samsung", s);
        System.out.println(m.brand + " has " + m.sim.company + " SIM");
    }
}
