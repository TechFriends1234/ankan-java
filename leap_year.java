public class leap_year
{
    public static void main(int year)
    {
        if (year%400==0)
        System.out.println("Year " + year + " is a leap year");
        else if (year%4==0 && year%100!=0)
        System.out.println("Year " + year + " is a leap year");
        else
        System.out.println("Year " + year + " is not a leap year");
    }
}