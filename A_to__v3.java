 import java.util.*;
public class A_to__v3
{
    public static void main()
    {
     Scanner mg = new Scanner(System.in);
     System.out.println("Enter the last letter you want to print");
     char x = mg.next().charAt(0);
     System.out.println("\n\n\n");
     for(char ch2 = 'a'; ch2 <= x; ch2++) {
            for(char ch3 = 'a'; ch3 <= ch2; ch3++) {
                System.out.print(ch3);
            }
                System.out.println("");
            }
      }
    }
