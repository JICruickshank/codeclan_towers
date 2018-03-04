import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ConferenceTest {

    private Conference conference;

    @Before
    public void setUp() throws Exception {

        conference = new Conference(2, 100, "A");
    }

    @Test
    public void testHasCapacity()  {
        assertEquals(2, conference.getCapacity());
    }


}
