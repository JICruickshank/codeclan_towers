import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningTest {

    private Dining dining;

    @Before
    public void setUp() throws Exception {

    dining = new Dining (30, 10);

    }

    @Test
    public void testHasCapacity() {
        assertEquals(30, dining.getCapacity());

    }

}
