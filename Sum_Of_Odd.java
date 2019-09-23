// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;

/**
 * 
 */
public class Sum_Of_Odd
{

    /**
     * 
     */
    static public void main(int max)
    {
        int a;
        int b = 0;
        a = 1;
        while (a <= max) {
            System.out.println(a);
            b = b + a;
            a = a + 2;
        }
        System.out.println("The sum of these numbers is " + b);
    }
}
