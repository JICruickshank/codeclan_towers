import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void setUp() throws Exception {
        guest = new Guest ("J");
    }

    @Test
    public void canGetName() {
        assertEquals("J", guest.getName());
    }

    @Test
    public void canSetName() {
        guest.setName("Danny");
        assertEquals("Danny", guest.getName());
    }
}
