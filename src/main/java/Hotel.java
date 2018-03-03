import java.util.ArrayList;

public class Hotel {

    private Hotel hotel;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Conference> conferenceRooms;
    private ArrayList<Dining> diningRooms;
    private ArrayList<Bedroom> vacantRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<Conference> conferenceRooms, ArrayList<Dining> diningRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = diningRooms;
    }

    public ArrayList<Bedroom> findVacantRooms() {
        vacantRooms = new ArrayList<>();
        for (Bedroom bedroom : this.bedrooms) {
            if (bedroom.roomVacant()) {
                vacantRooms.add(bedroom);
            }
        }
        return vacantRooms;
    }

    public void checkInRoom(Room room, Guest guest) {
        if (room.spaceAvailable()) {
            room.addGuest(guest);
        }
    }

    public void checkOutBedroom(Room room, Guest guest) {
        room.removeGuest(guest);
    }


}
