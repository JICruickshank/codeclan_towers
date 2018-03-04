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
        ArrayList<Bedroom> vacantRooms = new ArrayList<>();
        for (Bedroom bedroom : this.bedrooms) {
            if (bedroom.roomVacant()) {
                vacantRooms.add(bedroom);
            }
        }
        return vacantRooms;
    }

    public void checkInRoom(int roomNumber, String name) {
        Bedroom room = findBedroom(roomNumber);
        if (room != null && room.spaceAvailable()) {
            Guest guest = new Guest(name);
            room.addGuest(guest);
        }
    }

    public ArrayList<Guest> guestList(int roomNumber) {

        return findBedroom(roomNumber).guests;
    }

    public Bedroom findBedroom(int roomNumber) {
        Bedroom foundRoom = null;
        for ( Bedroom room : bedrooms) {
            if (roomNumber == room.getNumber()) {
                foundRoom = room;
            }
        }
        return foundRoom;

    }

    public int getVacantRoomNumber() {
        return findVacantRooms().get(0).getNumber();
    }

    public int findRoomNumber(String name) {
        int roomNumber = 0;
        for (Bedroom bedroom : bedrooms) {
            Guest guest = bedroom.findGuest(name);
            if (guest != null && guest.getName() == name) {
                roomNumber = bedroom.getNumber();
            }
        }
        return roomNumber;
    }

    public void checkOutRoom(String name) {
        int roomNumber = findRoomNumber(name);
        Guest guest = new Guest(name);
        for (Bedroom bedroom : bedrooms) {
            if (bedroom.getNumber() == roomNumber) {
                bedroom.removeGuest(guest);
            }
        }


    }
}
