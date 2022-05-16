import attraction.Dodgems;
import org.junit.Before;
import org.junit.Test;
import visitor.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {
    Dodgems dodgems;
    Visitor visitor;

    @Before
    public void before(){
        dodgems = new Dodgems("A name", 4.3);
        visitor = new Visitor(5, 1.34, 5.5);

    }

    @Test
    public void canGetName(){
        assertEquals("A name", dodgems.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(4.3, dodgems.getRating(), 0.0);
    }

    @Test
    public void canGetDefaultPrice(){
        assertEquals(4.50, dodgems.defaultPrice(), 0.0);
    }

    @Test
    public void canGetPriceFor(){
        assertEquals(2.25, dodgems.priceFor(visitor), 0.0);
    }
}
