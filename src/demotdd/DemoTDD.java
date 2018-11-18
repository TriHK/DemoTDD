package demotdd;

/**
 *
 * @author HuynhKimTri
 */
public class DemoTDD
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println(GradeChecker.isPassed(10));
        System.out.println(GradeChecker.isPassed(8));
        System.out.println(GradeChecker.isPassed(5));
        System.out.println(GradeChecker.isPassed(3));
        System.out.println(GradeChecker.isPassed(0));
    }
    
}
