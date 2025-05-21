
package zahlenrater;
public class Zahlenrater 
{
public static void main(String[] args) 
{
    double zufall=Math.random();
    int gemerkt=(int)Math.round(zufall*100);
    int geraten=0;
    int zaehler=0;
    System.out.println("Tuten Gag.");
    System.out.println("Ich habe mir eine Zahl ausgedacht.");
    System.out.println("Versuche doch mal sie zu erraten.");
    do
    {
        zaehler=zaehler+1;
        geraten=new java.util.Scanner(System.in).nextInt();
        if (gemerkt<geraten)
            System.out.println("Die Zahl ist kleiner.");
        else
        {
                if (gemerkt>geraten)
                    System.out.println("Die Zahl ist größer.");
                else
                {
                    System.out.println("Richtig!!!");
                    System.out.println("Sie haben "+zaehler+" Versuche gebraucht.");
                }
        }
            
    } 
   while(geraten!=gemerkt&&zaehler<5);
   System.out.println("Aber deine Versuche sind leer.");
}
    
}
