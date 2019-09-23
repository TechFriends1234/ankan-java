public class tricking_compiler
{ 
    static public void main()
    {
        boolean t = true;
        System.out.println("Tricking the compiler");
        if (t) {
            return;
        }
        // Tricked just now
        System.out.println("Return void");
    }
}
