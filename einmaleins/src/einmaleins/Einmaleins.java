
package einmaleins;
public class Einmaleins 
{
    public static void main(String[] args) 
    {
       int zahl;            // Festlegung der variablen
       int x=1;
       int grenze;
       System.out.print("Bitte geb dein gewuenschtes Einmal 1 an.");    //Eingabe des gewünschten einmal 1
       zahl=new java.util.Scanner(System.in).nextInt();
       
       if (zahl<=0)
       {
           System.out.println("Ungültige Eingabe");
       }
       else
       {
            System.out.print("Bitte gebe die Gewuenschte Obergrenze ein. ");
            grenze=new java.util.Scanner(System.in).nextInt();
            while (x<=grenze)
                {
                    System.out.print(zahl + "*" + x + "=");
                    System.out.println(zahl*x);
                     x=x+1;
           
                }
       }
       System.out.println("Auf wiedersehen");
    }
    
}
