import java.util.ArrayList;

public abstract class Room {

    Room room;
    ArrayList<Guest> guests;
    int capacity;
    int number;

    public Room(int capacity, int number) {
        this.capacity = capacity;
        guests = new ArrayList<>();
        this.number = number;

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

    public boolean roomVacant() {
        return guestCount() == 0;
    }

    public int getNumber() {
        return number;
    }
}
