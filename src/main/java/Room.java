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
        if (spaceAvailable()) {
            guests.add(guest);
        }
    }

    public int guestCount() {
        return this.guests.size();
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }

    public boolean spaceAvailable() {
        return guestCount() < capacity;
    }

    public boolean isRoomVacant() {
        return guestCount() == 0;
    }
}
