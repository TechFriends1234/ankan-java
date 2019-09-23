public class simple_interest
{
    public static void main(float principal, float rate, float time)
    {
      float interest;
      interest = (principal*rate*time)/100;
      System.out.println("The Simple Interest is ₹" + interest);
    }
}