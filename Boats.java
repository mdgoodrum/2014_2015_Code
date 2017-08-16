public class Boats {
    public static void main(String[] args) {
        Vehicle v = new RaceBoat();
        Boat b = new RaceBoat();
        RaceBoat r = new RaceBoat();
        v.go();
        ((Vehicle) b).go();
        ((Vehicle) r).go();
        b.go();
    }
}