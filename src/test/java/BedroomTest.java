import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void setUp() throws Exception {

        bedroom = new Bedroom(2, 12, RoomType.TWIN, 80);
        bedroom.guests = new ArrayList<>();
        guest1 = new Guest ("J");
        guest2 = new Guest ("Lyn");

    }

    @Test
    public void testHasCapacity()  {
        assertEquals(2, bedroom.getCapacity());

    }

    @Test
    public void testHasNumber() {
        assertEquals(12, bedroom.getNumber());
    }

    @Test
    public void testCanAddGuest() {
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.guests.size());
    }

    @Test
    public void testCanCountGuests() {
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        assertEquals(2, bedroom.guestCount());
    }

    @Test
    public void testCanGetRoomType() {
        assertEquals(RoomType.TWIN, bedroom.getRoomType());
    }

    @Test
    public void testRoomIsFullNoEntry() {
        Guest guest3 = new Guest("Ellen");
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.addGuest(guest3);
        assertEquals(2, bedroom.guestCount());
    }
//
    @Test
    public void testRoomIsVacant() {
        assertTrue(bedroom.roomVacant());
    }
//
    @Test
    public void testRoomIsNotVacant() {
        bedroom.addGuest(guest1);
        assertFalse(bedroom.roomVacant());
    }

    @Test
    public void testCanFindGuestByName() {
        bedroom.addGuest(guest2);
        Guest result = bedroom.findGuest("Lyn");
        assertEquals("Lyn", result.getName());
    }

    @Test
    public void canRemoveGuest() {
        bedroom.addGuest(guest2);
        String name = bedroom.guests.get(0).getName();
        assertEquals("Lyn", name);
        bedroom.removeGuest(guest2);
        assertEquals(null, bedroom.findGuest("Lyn"));
    }
}
