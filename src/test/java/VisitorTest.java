import org.junit.Before;
import org.junit.Test;
import visitor.Visitor;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(10,1.44, 3.4);
    }

    @Test
    public void hasAge() {
        assertEquals(10, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(1.44, visitor.getHeight(), 0.0);
    }

    @Test
    public void hasMoney(){
        assertEquals(3.4, visitor.getMoney(), 0.0);
    }
}
