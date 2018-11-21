import java.util.ArrayList;

public class BedRoom {

    private int number;
    private int capacity;
    private String type;
    private ArrayList<Guest> guestList;
    private double rate;

    public BedRoom(int number, int capacity, String type, double rate){
        this.number = number;
        this.capacity = capacity;
        this.type = type;
        this.guestList = new ArrayList<>();
        this.rate = rate;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public ArrayList<Guest> getGuestList() {
        return this.guestList;
    }

    public int numberOfGuests(){
        return this.guestList.size();
    }

    public int getNumber() {
        return this.number;
    }

    public String getType() {
        return this.type;
    }

    public double getRate() { return this.rate; }

    public void addGuest(Guest guest){
        if (this.numberOfGuests() < this.capacity){
            this.guestList.add(guest);
        }
    }

    public Guest removeGuest(){
        if (this.numberOfGuests() > 0){
            return this.guestList.remove(0);
        }
        return null;
    }

    public void emptyRoom(){
        this.guestList.clear();
    }
}
