
import demotdd.GradeChecker;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HuynhKimTri
 */
public class PassedTest
{

    @Test
    public void testPassed()
    {
        assertEquals(false, GradeChecker.isPassed(11));
        assertEquals(true, GradeChecker.isPassed(10));
        assertEquals(true, GradeChecker.isPassed(8));
        assertEquals(true, GradeChecker.isPassed(5));
        assertEquals(false, GradeChecker.isPassed(4));
        assertEquals(false, GradeChecker.isPassed(3));
        assertEquals(false, GradeChecker.isPassed(0));
    }
}
