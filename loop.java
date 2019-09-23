import java.util.*;
public class loop
{
    public static void main()
    {
        Scanner mg = new Scanner (System.in);
        System.out.println("How many times you want a loop?");
        int x = mg.nextInt();
        for(int n=1; ;n++)
        {
            System.out.println("Reset Java Virtual Machine " + n);
            if (n==x)
            break;
        }
    }
}