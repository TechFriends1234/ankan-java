public class Hypotenuse
{
    public static void main(double base, double altitude)
    {
        double h = Math.sqrt(base*base + altitude*altitude);
        System.out.println("The Hypotenuse of the Triangle is " + h);
    }
}