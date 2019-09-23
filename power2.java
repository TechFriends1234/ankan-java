import java.util.*;
public class power2
{
  public static void main()
   { 
    Scanner mg = new Scanner(System.in);
    boolean m = true;
    System.out.println("Enter Number to Check if it is a power of 2");
    int x = mg.nextInt();
    for (int j = 1; j<=x; j++)
    {
      if (Math.pow(2,j)==x)
      {
           System.out.println("Power of 2");
           System.out.println("2^" + j + " = " + x);
           m = false;
           break;
      }
     }
    if(m)
     System.out.println("Not a power of 2");
    }
}
           