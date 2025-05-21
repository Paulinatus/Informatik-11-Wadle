
package xhoch2;
public class Xhoch2 
{
    public static void main(String[] args) 
    {
        double x=0;
        double y=0;
        double grenze=0;
        double sw=0;
        System.out.print("Bitte geben sie eine Obergrenze ein: ");
        grenze=new java.util.Scanner(System.in).nextDouble();
        System.out.print("Bitte geben sie die Schrittweite an: ");
        sw=new java.util.Scanner(System.in).nextDouble();
        System.out.println("y=x*x");
        while (x<=grenze)
        {
            y=x*x;
            x=x+sw;
            System.out.println("y="+y);
            
        }
    }
    
}
