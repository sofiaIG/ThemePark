import org.junit.Before;
import org.junit.Test;
import stall.CandyFlossStall;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Candy",
                "Dennis", 4.0, 34);
    }

    @Test
    public void canGetName(){
        assertEquals("Candy", candyFlossStall.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(4.0, candyFlossStall.getRating(), 0.0);
    }
}
