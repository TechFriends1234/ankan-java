import java.util.*;
public class temp_con_method
{
    static double x;
    /*-----------------------------------------------------------------------CUT-HERE----------------------------------------------------------------------------------*/
    public static void main()
    {
        System.out.println("Enter 1 to Convert Celcius into Fahrenheit");
        System.out.println(" Enter 2 to Convert Fahrenheit into Celcius");
        /*-----------------------------------------------------------------------CUT-HERE------------------------------------------------------------------------------*/
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        /*-----------------------------------------------------------------------CUT-HERE------------------------------------------------------------------------------*/
        switch(choice)
        {
            case 1: System.out.println(" Converting Celcius into Fahrenheit \n Enter Temperature in Celcius");
                    double temp = sc.nextDouble();
                    x = temp;
                    cel2fahr();
                    break;
            
            case 2: System.out.println(" Converting Fahrenheit into Celcius \n Enter Temperature in Fahrenheit");
                    double temp2 = sc.nextDouble();
                    x = temp2;
                    fahr2cel();
                    break;
            
            default: System.out.println(" Invalid Choice");
        }
    }
    /*-----------------------------------------------------------------------CUT-HERE----------------------------------------------------------------------------------*/
    static void cel2fahr()
    {
        double fahr = (((9*x)/5)+32);
        System.out.println(" " + x + "\u00B0 Celcius = " + fahr + "\u00B0 Fahrenheit");
    }
    /*-----------------------------------------------------------------------CUT-HERE----------------------------------------------------------------------------------*/
    static void fahr2cel()
    {
        double cel = ((5*(x-32))/9);
        System.out.println(" " + x + "\u00B0 Fahrenheit = " + cel + "\u00B0 Celcius");
    }
}