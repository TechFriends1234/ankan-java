public class Grade
{
    public static void main(float marks)
    {
        String m;
        
        if (marks>=60)
        m="Your grade is A";
        else if (marks<60 && marks>=40)
        m="Your grade is B";
        else if (marks<40 && marks>=0)
        m="Your grade is C";
        else
        m="Error!";
        
        System.out.println(m);
    }
}
        