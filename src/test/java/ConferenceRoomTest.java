import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void setUp() {
        conferenceRoom = new ConferenceRoom("Fuzzy");
        guest = new Guest();
    }

    @Test
    public void hasCapacity() {
        assertEquals(5, conferenceRoom.getCapacity());
    }

    @Test
    public void hasName() {
        assertEquals("Fuzzy", conferenceRoom.getName());
    }

    @Test
    public void hasGuestList() {
        assertEquals(0, conferenceRoom.numberOfGuests());
    }

    @Test
    public void canAddGuest() {
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.numberOfGuests());
    }

    @Test
    public void canRemoveGuest() {
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest();
        assertEquals(0, conferenceRoom.numberOfGuests());
    }

    @Test
    public void canEmptyRoom() {
        conferenceRoom.addGuest(guest);
        conferenceRoom.emptyRoom();
        assertEquals(0, conferenceRoom.numberOfGuests());
    }
}
