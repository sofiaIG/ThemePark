import attraction.Rollercoaster;
import org.junit.Before;
import org.junit.Test;
import visitor.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("A rollercoaster name", 3.5);
        visitor = new Visitor(10, 1.55, 5.6);
    }


    @Test
    public void canGetName(){
        assertEquals("A rollercoaster name", rollercoaster.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(3.5, rollercoaster.getRating(), 0.0);
    }

    @Test public void isAllowedTest(){
        assertTrue(rollercoaster.isAllowedTo(visitor));
    }

    @Test public void canGetPrice(){assertEquals(8.40, rollercoaster.defaultPrice(), 0.0);}

    @Test public void canGetPriceFor(){assertEquals(8.40, rollercoaster.priceFor(visitor), 0.0);}
}
