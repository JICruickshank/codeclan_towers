import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HotelTest {

    private Hotel hotel;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Conference> conferenceRooms;
    private ArrayList<Dining> diningRooms;
    private Bedroom bedroom1;
    private Bedroom bedroom2;

    @Before
    public void setUp() throws Exception {
        bedrooms = new ArrayList<>();
        conferenceRooms = new ArrayList<>();
        diningRooms = new ArrayList<>();
        bedroom1 = new Bedroom(2, 1, RoomType.DOUBLE, 80);
        bedroom2 = new Bedroom(2, 2, RoomType.TWIN, 80);
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        hotel = new Hotel(bedrooms, conferenceRooms, diningRooms);
    }

    @Test
    public void testGetVacantRooms() {
        hotel.checkInRoom(2, "J");
        ArrayList<Bedroom> result = hotel.findVacantRooms();
        assertEquals(1, result.size());
        assertEquals(1, result.get(0).getNumber());
    }

    @Test
    public void testCheckGuestInRoom() {
        assertEquals(0, bedroom2.guestCount());
        hotel.checkInRoom(2, "J");
        assertEquals(1, bedroom2.guestCount());
    }

    @Test
    public void testCheckGuestInRoomRoomDoesNotExist() {
        hotel.checkInRoom(10, "J");
        assertEquals(0, hotel.findRoomNumber("J"));
    }

    @Test
    public void testListGuestsInRoom() {
        hotel.checkInRoom(1, "J");
        hotel.checkInRoom(1, "Lyn");
        ArrayList<Guest> result = hotel.guestList(1);
        assertEquals("Lyn", result.get(1).getName());
    }

    @Test
    public void canFindRoomByNumber() {
        Bedroom result = hotel.findBedroom(2);
        assertEquals(RoomType.TWIN, result.getRoomType());
    }

    @Test
    public void canGetFirstVacantRoomNumber() {
        hotel.checkInRoom(1, "J");
        assertEquals(2, hotel.getVacantRoomNumber());
    }

    @Test
    public void canFindRoomNumberByGuestName() {
        hotel.checkInRoom(2, "J");
        assertEquals(2, hotel.findRoomNumber("J"));
    }

    @Test
    public void canCheckOutGuestByName() {
        hotel.checkInRoom(2, "J");
        assertEquals(2, hotel.findRoomNumber("J"));
        hotel.checkOutRoom("J");
        assertEquals(0, hotel.findRoomNumber("J"));
    }
}

