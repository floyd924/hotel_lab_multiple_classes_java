import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<BedRoom> bedRoomList;
    private ArrayList<ConferenceRoom> conferenceRoomList;
    private ArrayList<DiningRoom> diningRoomList;
    private ArrayList<Booking> bookingList;

    public Hotel(String name, ArrayList<BedRoom> bedRoomList, ArrayList<ConferenceRoom> conferenceRoomList, ArrayList<DiningRoom> diningRoomList){
        this.name = name;
        this.bedRoomList = bedRoomList;
        this.conferenceRoomList = conferenceRoomList;
        this.diningRoomList = diningRoomList;
        this.bookingList = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void checkIntoBedRoom(Guest guest, BedRoom bedRoom){
        bedRoom.addGuest(guest);
    }

    public void checkIntoConferenceRoom(Guest guest, ConferenceRoom conferenceRoom){
        conferenceRoom.addGuest(guest);
    }

    public void checkIntoDiningRoom(Guest guest, DiningRoom diningRoom){
        diningRoom.addGuest(guest);
    }


    public Guest checkOutOfBedRoom(BedRoom bedRoom) {
        if (bedRoom.numberOfGuests() > 0) {
            return bedRoom.removeGuest();
        }
        return null;
    }

    public Guest checkOutOfConferenceRoom(ConferenceRoom conferenceRoom) {
        if (conferenceRoom.numberOfGuests() > 0) {
            return conferenceRoom.removeGuest();
        }
        return null;
    }

    public Guest checkOutOfDiningRoom(DiningRoom diningRoom) {
        if (diningRoom.numberOfGuests() > 0) {
            return diningRoom.removeGuest();
        }
        return null;
    }

    public int getNumberOfBookings() {
        return this.bookingList.size();
    }

    public Booking bookRoom(BedRoom bedRoom, int numberOfNights) {
        Booking newBooking = new Booking(bedRoom, numberOfNights);
        this.bookingList.add(newBooking);
        return  newBooking;
    }

    public double getBill(Booking newBooking) {
        double rate = newBooking.getBedRoom().getRate();
        int numberOfNights = newBooking.getNumberOfNights();
        return (rate * numberOfNights);
    }
}
