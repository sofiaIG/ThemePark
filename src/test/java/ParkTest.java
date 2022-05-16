import attraction.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("A park name", 3.5);
    }

    @Test
    public void canGetName(){
        assertEquals("A park name", park.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(3.5, park.getRating(), 0.0);
    }

}
