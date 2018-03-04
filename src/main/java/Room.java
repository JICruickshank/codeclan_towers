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

    public void removeGuest(Guest guestToRemove) {
        for (Guest guest : guests) {
            if (guest.getName() == guestToRemove.getName()) {
                guestToRemove = guest;
            }
        }
        guests.remove(guestToRemove);
    }

    public boolean spaceAvailable() {
        return guestCount() < capacity;
    }

    public boolean roomVacant() {
        return guestCount() == 0;
    }

    public Guest findGuest(String name) {
        Guest found = null;
        for (Guest guest : guests) {
            if (guest.getName() == name) {
                found = guest;
            }
        }
        return found;
    }
}
