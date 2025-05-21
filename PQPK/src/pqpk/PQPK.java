
package pqpk;
public class PQPK 
{
    public static void main(String[] args)
    {
        double p;              //P in der formel
        double q;             //Q in der Formel
        double d;            //Kein plan fürs erste
        double ea;          // Ergebnis wenn d=0
        double x1;         //Erster x-Wert
        double x2;        //Zweiter x-Wert
        String f="fehler du Jockel";
        System.out.println("Bitte geben sie einen Wert für p ein.");    //Schriftzug 1
        p=new java.util.Scanner(System.in).nextInt();                  //Eingabe von der P-Variable
        System.out.println("Bitte geben sie einen Wert für q ein");   //Schriftzug 2
        q=new java.util.Scanner(System.in).nextInt();                //Eingabe von der Q-Variable
        d=p/2*p/2-q;                                                //Rechnung unter der Wurzel
        if (d<0)
        {
            System.out.println(f);
        }
        else 
        {
            if (d==0)
            {
                ea=-p/2;
                System.out.println(ea);
            }
            else
            {
                x1=-p/2+Math.sqrt(d);         //Erster x-Wert
                x2=-p/2-Math.sqrt(d);
                System.out.println("Schittebön");
                System.out.println(x1);
                System.out.println(x2);
            }    
        } 
    }
    
}
