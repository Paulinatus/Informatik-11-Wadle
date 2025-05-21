
package zalhtester;
public class Zalhtester 
{
    public static void main(String[] args) 
    {
        int zahl=0;
        System.out.print("Die zu prüfende Zahl ist:");
        zahl=new java.util.Scanner(System.in).nextInt();
        if(zahl%2==0)
        {
            if(zahl%3==0)
            {
                System.out.println("Die "+zahl+" ist sowohl durch 2 als auch durch 3 teilbar.");
            }
            else
            {
                    System.out.println("Die "+zahl+" ist nur durch 2 teilbar.");
            }
        }
        else
        {
            if(zahl%3==0)
            {
                System.out.println("Die "+zahl+" ist nur durch 3 teilbar.");
            }
            else
            {
                System.out.println("Die"+zahl+" ist weder durch 2 noch durch 3 Teilbar.");
            }    
        }
    }
    
}
