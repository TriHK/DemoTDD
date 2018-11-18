package demotdd;

/**
 *
 * @author HuynhKimTri
 */
public class GradeChecker
{

    /**
     *
     * @param grade
     * @return
     */
    public static boolean isPassed(double grade)
    {
        if (grade >= 5) {
            return true;
        }
        return false;
    }
}
