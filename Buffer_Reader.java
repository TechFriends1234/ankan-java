//Using Buffer Reader to Find the sum of two numbers......

import java.io.*;
public class Buffer_Reader
{
    public static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader AnkanMG = new BufferedReader(read);
        int a,b,c;
        System.out.println("Enter a number: ");
        a=Integer.parseInt(AnkanMG.readLine());
        System.out.println("Enter another number: ");
        b=Integer.parseInt(AnkanMG.readLine());
        c=a+b;
        System.out.println("The Sum is "+c);
    }
}