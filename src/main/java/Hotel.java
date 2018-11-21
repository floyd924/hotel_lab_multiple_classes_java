import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<BedRoom> bedRoomList;
    private ArrayList<ConferenceRoom> conferenceRoomList;
    private ArrayList<DiningRoom> diningRoomList;

    public Hotel(String name, ArrayList<BedRoom> bedRoomList, ArrayList<ConferenceRoom> conferenceRoomList, ArrayList<DiningRoom> diningRoomList){
        this.name = name;
        this.bedRoomList = bedRoomList;
        this.conferenceRoomList = conferenceRoomList;
        this.diningRoomList = diningRoomList;
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


}
