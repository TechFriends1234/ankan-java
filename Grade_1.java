public class Grade_1
{
    public static void main(float marks)
    {
        if (marks<80 && marks>75)
        System.out.println("Outstanding!");
        if (marks<75 && marks>70)
        System.out.println("Excellent!");
        if (marks <70 && marks>60)
        System.out.println("Try to do better next time!");
        if (marks <60 && marks>0)
        System.out.println("Work Hard!");
        if (marks == 80)
        System.out.println("Superb! Keep It Up!");
        if (marks >80)
        System.out.println("Extraordinary! Try to lower your marks");
    }
}