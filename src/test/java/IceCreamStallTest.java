import org.junit.Before;
import org.junit.Test;
import stall.IceCreamStall;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("The IceCream Place",
                "Yan", 4.3, 13);
    }

    @Test
    public void canGetName(){
        assertEquals("The IceCream Place", iceCreamStall.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(4.3, iceCreamStall.getRating(), 0.0);
    }
}
