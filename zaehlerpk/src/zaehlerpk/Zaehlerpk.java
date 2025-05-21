
package zaehlerpk;
public class Zaehlerpk 
{
    public static void main(String[] args) 
    {
        double zahl=0;
        double grenze=0;
        System.out.print("Bitte geben sie die Obergrenze ein ");
        grenze=new java.util.Scanner(System.in).nextInt();
        while (zahl<=grenze)
        {
            System.out.print(zahl);
            System.out.print("----->");
            System.out.println(zahl*zahl);
            zahl=zahl+1;
        }
        System.out.println("Auf Wiedersehen.");
    }
    
}
