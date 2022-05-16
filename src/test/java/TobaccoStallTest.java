import org.junit.Before;
import org.junit.Test;
import stall.TobaccoStall;
import visitor.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(12, 1.55, 3.5);
        tobaccoStall = new TobaccoStall("Tobacco", "Carla", 3.4, 23 );
    }

    @Test
    public void canGetName(){
        assertEquals("Tobacco", tobaccoStall.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(3.4, tobaccoStall.getRating(), 0.0);
    }

    @Test
    public void isAllowedTest(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitor));
    }


}
