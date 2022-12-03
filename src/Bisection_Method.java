import java.lang.util.Scanner;
import java.lang.Math.abs();
public class Bisection_code
{

    double a, b, m;
    double E=0.001;
    int i=0;
    Scanner read=new Scanner(System.in);
    System.out.println("Enter range a and b: ");
    a=read.nextDouble();
    b=read.nextDouble();
    public double func(double x)

    {
        return (x*x)-x-1;
    }
    double fa=func(a);
    double fb=func(b);
    double fa_fb=fa*fb;
    void bisect(double a, double b)
    {
        while(fa_fb<0)
        {
            m=(a+b)/2;
            i=i+1;

            double fa_fm=func(a)*func(m);
            double modd_m=Math.abs(func(m));
            if(modd_m<E)
            {
                System.out.println("range: "+m);
            }
            else
            {
                System.out.println("\ni= "+i+"\na= "+a+"\nb= "+b+"\nf(m)= "+func(m)+"\n|f(m)|= "+modd_m);
                if(fa_fm>0)
                {
                    a=m;
                }
                else {
                    b=m
                }
                m=(a+b)/2;
                i=i+1;
            }
        }
    }
    public static void main(String args[])
    {
        Object obj=new Object();
        obj.bisect(a,b);
    }
}
