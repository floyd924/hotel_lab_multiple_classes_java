public class Booking {

    private BedRoom bedRoom;
    private int numberOfNights;

    public Booking(BedRoom bedRoom, int numberOfNights) {
        this.bedRoom = bedRoom;
        this.numberOfNights = numberOfNights;
    }

    public BedRoom getBedRoom() {
        return this.bedRoom;
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

}
