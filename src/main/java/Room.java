import java.util.ArrayList;

public abstract class Room {

    Room room;
    ArrayList<Guest> guests;
    int capacity;

    public Room(int capacity) {
        this.capacity = capacity;
        guests = new ArrayList<>();

    }

    public int getCapacity() {
        return this.capacity;
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public int guestCount() {
        return this.guests.size();
    }
}
