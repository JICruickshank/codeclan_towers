import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void setUp() throws Exception {

        bedroom = new Bedroom(2, 12, "Double", 80);
        guest1 = new Guest("J");
        guest2 = new Guest("Danny");
        bedroom.guests = new ArrayList<>();

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


}
