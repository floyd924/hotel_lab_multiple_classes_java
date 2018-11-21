import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private String name;
    private ArrayList<Guest> guestList;

    public ConferenceRoom(String name) {
        this.capacity = 5;
        this.name = name;
        this.guestList = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Guest> getGuestList() {
        return this.guestList;
    }

    public int numberOfGuests() {
        return this.guestList.size();
    }

    public void addGuest(Guest guest) {
        if (numberOfGuests() < this.capacity) {
            this.guestList.add(guest);
        }
    }

    public Guest removeGuest() {
        if (this.numberOfGuests() > 0) {
            return this.guestList.remove(0);
        }
        return null;
    }

    public void emptyRoom() {
        this.guestList.clear();
    }
}
