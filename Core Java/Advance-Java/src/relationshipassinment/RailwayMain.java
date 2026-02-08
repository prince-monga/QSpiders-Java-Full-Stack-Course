package relationshipassinment;

class Booking {
    String passenger;
    int seat;
    Booking(String passenger, int seat){
        this.passenger = passenger;
        this.seat = seat;
    }
}

class Railway {
    String train;
    Booking booking;
    Railway(String train, Booking booking){
        this.train = train;
        this.booking = booking;
    }
}

class RailwayMain {
    public static void main(String[] args) {
        Booking b = new Booking("Prince", 42);
        Railway r = new Railway("Rajdhani Express", b);
        System.out.println(r.train + " booked by " + r.booking.passenger);
    }
}
