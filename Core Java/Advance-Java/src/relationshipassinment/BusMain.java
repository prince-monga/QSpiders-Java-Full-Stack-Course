package relationshipassinment;

class Seat {
    int seatNo;
    Seat(int seatNo){ this.seatNo = seatNo; }
}

class Bus {
    String route;
    Seat seat;
    Bus(String route, Seat seat){
        this.route = route;
        this.seat = seat;
    }
}

class BusMain {
    public static void main(String[] args) {
        Seat s = new Seat(15);
        Bus b = new Bus("Sirsa–Delhi", s);
        System.out.println(b.route + " seat " + b.seat.seatNo);
    }
}
