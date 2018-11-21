import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    BedRoom bedRoom;
    Guest guest;

    @Before
    public void setup(){
        bedRoom = new BedRoom(1, 2, "Twin");
        guest = new Guest();
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedRoom.getCapacity());
    }

    @Test
    public void hasNumber(){
        assertEquals(1, bedRoom.getNumber());
    }

    @Test
    public void hasGuestList(){
        assertEquals(0, bedRoom.numberOfGuests());
    }

    @Test
    public void hasType(){
        assertEquals("Twin", bedRoom.getType());
    }

    @Test
    public void canAddGuest(){
        bedRoom.addGuest(guest);
        assertEquals(1, bedRoom.numberOfGuests());
    }

    @Test
    public void canRemoveGuest(){
        bedRoom.addGuest(guest);
        bedRoom.addGuest(guest);
        bedRoom.addGuest(guest);
        bedRoom.removeGuest();
        assertEquals(1, bedRoom.numberOfGuests());
    }

    @Test
    public void canEmptyRoom(){
        bedRoom.addGuest(guest);
        bedRoom.addGuest(guest);
        bedRoom.addGuest(guest);
        assertEquals(2, bedRoom.numberOfGuests());
        bedRoom.emptyRoom();
        assertEquals(0, bedRoom.numberOfGuests());
    }

}
