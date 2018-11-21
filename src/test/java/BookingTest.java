import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    BedRoom bedRoom;
    Booking booking;

    @Before
    public void setup() {
        bedRoom = new BedRoom(3, 1, "Single");
        booking = new Booking(bedRoom, 2);
    }

    @Test
    public void hasBedRoom() {
        assertEquals(bedRoom, booking.getBedRoom());
    }

    @Test
    public void hasNumberOfNights() {
        assertEquals(2, booking.getNumberOfNights());
    }
}
