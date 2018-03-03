import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ConferenceTest {

    private Conference conference;
    private Guest guest;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void setUp() throws Exception {

        conference = new Conference(2, 20, 100, "A");
        Guest guest = new Guest("James");
        Guest guest2 = new Guest("Katie");
        Guest guest3 = new Guest("Brendan");

    }

    @Test
    public void testHasCapacity()  {
        assertEquals(2, conference.getCapacity());

    }

    @Test
    public void canAddGuest() {
        conference.addGuest(guest);
        assertEquals(1, conference.guestCount());
    }

    @Test
    public void canRemoveGuest() {
        conference.addGuest(guest);
        conference.addGuest(guest2);
        assertEquals(2, conference.guestCount());
        conference.removeGuest(guest);
        assertEquals(1, conference.guestCount());

    }

    @Test
    public void testRoomIsFullNoEntry() {
        conference.addGuest(guest);
        conference.addGuest(guest2);
        conference.addGuest(guest3);
        assertEquals(2, conference.guestCount());
        }

    @Test
    public void testRoomIsVacant() {
        assertTrue(conference.roomVacant());
    }

    @Test
    public void testRoomIsNotVacant() {
        conference.addGuest(guest);
        assertFalse(conference.roomVacant());
    }
}
