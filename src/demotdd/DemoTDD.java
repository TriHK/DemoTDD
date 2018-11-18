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
        System.out.println(isPassed(10));
        System.out.println(isPassed(8));
        System.out.println(isPassed(5));
        System.out.println(isPassed(3));
        System.out.println(isPassed(0));
    }

    public static boolean isPassed(double grade)
    {
        if (grade >= 5) {
            return true;
        }
        return false;
    }
}
