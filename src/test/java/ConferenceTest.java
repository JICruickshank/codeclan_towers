import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

    private Conference conference;

    @Before
    public void setUp() throws Exception {

        conference = new Conference(150, 1000);

    }

    @Test
    public void testHasCapacity()  {
        assertEquals(150, conference.getCapacity());

    }

}
