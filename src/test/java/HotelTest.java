import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Conference> conferenceRooms;
    private ArrayList<Dining> diningRooms;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Guest guest;

    @Before
    public void setUp() throws Exception {
        bedrooms = new ArrayList<>();
        conferenceRooms = new ArrayList<>();
        diningRooms = new ArrayList<>();
        guest = new Guest("J");
        bedroom1 = new Bedroom(2, 1, RoomType.DOUBLE, 80);
        bedroom2 = new Bedroom(2, 2, RoomType.TWIN, 80);
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedroom1.addGuest(guest);
        hotel = new Hotel(bedrooms, conferenceRooms, diningRooms);
    }

    @Test
    public void testGetVacantRooms() {
        ArrayList<Bedroom> result = hotel.findVacantRooms();
        assertEquals(1, result.size());
        assertEquals(2, result.get(0).getNumber());
    }

    @Test
    public void testCheckGuestInRoom() {
        assertEquals(0, bedroom2.guestCount());
        hotel.checkInRoom(bedroom2, guest);
        assertEquals(1, bedroom2.guestCount());
    }

    @Test
    public void testCheckGuestOutRoom() {
        assertEquals(0, bedroom2.guestCount());
        hotel.checkInRoom(bedroom2, guest);
        assertEquals(1, bedroom2.guestCount());
        hotel.checkOutBedroom(bedroom2, guest);
        assertEquals(0, bedroom2.guestCount());

    }

}

