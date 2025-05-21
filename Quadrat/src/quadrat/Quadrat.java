
package quadrat;
public class Quadrat 
{
    public static void main(String[] args)
    {
        int seite;
        int flaeche=0;
        
        System.out.println("Berechnung eines Quadrats");
        System.out.print("Gib mir ne Zahl du Knaller:");
        seite=new java.util.Scanner(System.in).nextInt();
        
        if(seite<0)
            {    
            System.out.println("Kein Minus du Jockel");
            }
        else
            {
            flaeche=seite*seite;
            System.out.print("Die Flaeche betraegt ");
            System.out.print(flaeche);
            System.out.print(" m^2."); 
            }   
        
    }
    
}
