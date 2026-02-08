package relationshipassinment;

class Movie {
    String name;
    Movie(String name){ this.name = name; }
}

class Theater {
    String tName;
    Movie movie;
    Theater(String tName, Movie movie){
        this.tName = tName;
        this.movie = movie;
    }
}

class TheaterMain {
    public static void main(String[] args) {
        Movie m = new Movie("KGF 3");
        Theater t = new Theater("PVR", m);
        System.out.println(t.tName + " shows " + t.movie.name);
    }
}
