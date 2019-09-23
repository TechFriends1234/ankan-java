public class area_rec_methods
{
    static double x,y;
    /*-----------------------------------------------------------------------CUT-HERE----------------------------------------------------------------------------------------------------*/
    public static void main(double length, double breadth)
    {
        x = length;
        y = breadth;
        area();
    }
    /*-----------------------------------------------------------------------CUT-HERE----------------------------------------------------------------------------------------------------*/
    static void area()
    {
        double area = x*y;
        System.out.println("Area = " + area);
    }
}