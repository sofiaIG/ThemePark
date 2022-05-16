import attraction.Playground;
import org.junit.Before;
import org.junit.Test;
import visitor.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;

    @Before
    public void before(){
        playground = new Playground("A playground name", 2.5);
        visitor = new Visitor(6, 1.25, 3.45);
    }


    @Test
    public void canGetName(){
        assertEquals("A playground name", playground.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(2.5, playground.getRating(), 0.0);
    }

    @Test
    public void isAllowedToTest(){
        assertTrue(playground.isAllowedTo(visitor));
    }



}
