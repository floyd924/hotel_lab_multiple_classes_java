import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;
    BedRoom bedRoom;
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom;

    @Before
    public void setup(){
        bedRoom = new BedRoom(2, 2, "Double", 135.17);
        ArrayList<BedRoom> bedRoomList = new ArrayList<>();
        bedRoomList.add(bedRoom);

        conferenceRoom = new ConferenceRoom("Toggle");
        ArrayList<ConferenceRoom> conferenceRoomList = new ArrayList<>();
        conferenceRoomList.add(conferenceRoom);

        diningRoom = new DiningRoom("Canteen");
        ArrayList<DiningRoom> diningRoomList = new ArrayList<>();
        diningRoomList.add(diningRoom);


        hotel = new Hotel("Hotel California", bedRoomList, conferenceRoomList, diningRoomList);
    }

    @Test
    public void hotelHasName(){
        assertEquals("Hotel California", hotel.getName());
    }

    @Test
    public void canCheckGuestIntoBedRoom(){
        hotel.checkIntoBedRoom(guest, bedRoom);
        assertEquals(1, bedRoom.numberOfGuests());
    }

    @Test
    public void canCheckGuestIntoConferenceRoom(){
        hotel.checkIntoConferenceRoom(guest, conferenceRoom);
        assertEquals(1, conferenceRoom.numberOfGuests());
    }

    @Test
    public void canCheckGuestIntoDiningRoom(){
        hotel.checkIntoDiningRoom(guest, diningRoom);
        assertEquals(1, diningRoom.numberOfGuests());
    }

    @Test
    public void canCheckGuestOutOfBedRoom() {
        hotel.checkIntoBedRoom(guest, bedRoom);
        hotel.checkOutOfBedRoom(bedRoom);
        assertEquals(0, bedRoom.numberOfGuests());
    }

    @Test
    public void canCheckGuestOutOfConferenceRoom() {
        hotel.checkIntoConferenceRoom(guest, conferenceRoom);
        hotel.checkOutOfConferenceRoom(conferenceRoom);
        assertEquals(0, conferenceRoom.numberOfGuests());
    }

    @Test
    public void canCheckGuestOutOfDiningRoom() {
        hotel.checkIntoDiningRoom(guest, diningRoom);
        hotel.checkOutOfDiningRoom(diningRoom);
        assertEquals(0, diningRoom.numberOfGuests());
    }

    @Test
    public void hasBookingList() {
        assertEquals(0, hotel.getNumberOfBookings());
    }

    @Test
    public void canBookRoom() {
        hotel.bookRoom(bedRoom, 4);
        assertEquals(1, hotel.getNumberOfBookings());
    }

    @Test
    public void canGetBill() {
        Booking newBooking = hotel.bookRoom(bedRoom, 4);
        assertEquals(540.68, hotel.getBill(newBooking), 0.001);
    }

}
