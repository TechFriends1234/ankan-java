//Program to print a mark sheet.
import java.util.Scanner;
public class Marksheet
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        float average;
        int totalper,total=0,got=0;
        char grdtotal='X';
        System.out.println("Enter number of tests: ");
        int n=sc.nextInt();
        int[] f = new int[n+1];
        int[] g = new int[n+1];
        int[] per = new int[n+1];
        char[] grd = new char[n+1];
        int i=1;
        while(i<=n)
        {
            System.out.println("Enter full marks in test "+i+" : ");
            f[i]=sc.nextInt();
            System.out.println("Enter marks got in test "+i+" : ");
            g[i]=sc.nextInt();
            total=total+f[i];
            got=got+g[i];
            per[i]=(f[i]/g[i])*100;
            i++;
        }
        for(int z=1;z<=20;z++)
        {
            System.out.println("-\t\t\t\t\t\t\t\t/\t\t\t\t\t\t\t\t-");
            System.out.println("/\t\t\t\t\t\t\t\t-\t\t\t\t\t\t\t\t/");
        }
        average=got/3;
        totalper=(got/total)*100;
        for(int x=1;x<=n;x++)
        {
            if(per[i]>=90)
             grd[i]='A';
            if(per[i]>=70&&per[i]<90)
             grd[i]='B';
            if(per[i]>=50&&per[i]<70)
             grd[i]='C';
            if(per[i]<50)
             grd[i]='D';
        }
        {
            if(totalper>=90)
             grdtotal='A';
            if(totalper>=70&&totalper<90)
             grdtotal='B';
            if(totalper>=50&&totalper<70)
             grdtotal='C';
            if(totalper<50)
             grdtotal='D';
        }
        System.out.println("\t\t\t\t\tExamination");
        for(int y=1;y<=n;y++)
        {
            System.out.println("Marks got in test "+y+" -> "+g[i]+"/"+f[i]);
            System.out.println("Percentage -> "+per[i]+" %");
            System.out.println("Grade -> "+grd[i]);
            i++;
        }
        System.out.println("Marks got in total -> "+got+"/"+total);
        System.out.println("Total Percentage -> "+totalper);
        System.out.println("Total Grade -> "+grdtotal);
    }
}