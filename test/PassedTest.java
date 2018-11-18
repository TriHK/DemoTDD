
import demotdd.DemoTDD;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HuynhKimTri
 */
public class PassedTest
{

//    @Test
    public void testPassed()
    {
        assertEquals(false, DemoTDD.isPassed(11));
        assertEquals(true, DemoTDD.isPassed(10));
        assertEquals(true, DemoTDD.isPassed(8));
        assertEquals(true, DemoTDD.isPassed(5));
        assertEquals(false, DemoTDD.isPassed(4));
        assertEquals(false, DemoTDD.isPassed(3));
        assertEquals(false, DemoTDD.isPassed(0));
    }
}
