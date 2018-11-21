import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void setUp() {
        diningRoom = new DiningRoom("Fuzzy");
        guest = new Guest();
    }

    @Test
    public void hasCapacity() {
        assertEquals(5, diningRoom.getCapacity());
    }

    @Test
    public void hasName() {
        assertEquals("Fuzzy", diningRoom.getName());
    }

    @Test
    public void hasGuestList() {
        assertEquals(0, diningRoom.numberOfGuests());
    }

    @Test
    public void canAddGuest() {
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.numberOfGuests());
    }

    @Test
    public void canRemoveGuest() {
        diningRoom.addGuest(guest);
        diningRoom.removeGuest();
        assertEquals(0, diningRoom.numberOfGuests());
    }

    @Test
    public void canEmptyRoom() {
        diningRoom.addGuest(guest);
        diningRoom.emptyRoom();
        assertEquals(0, diningRoom.numberOfGuests());
    }

}
