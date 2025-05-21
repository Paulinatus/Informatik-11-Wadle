
package zahlenrater;
public class Zahlenrater 
{
public static void main(String[] args) 
{
    double zufall=Math.random();
    int gemerkt=(int)Math.round(zufall*100);
    int geraten=0;
    System.out.println("Tuten Gag.");
    System.out.println("Ich habe mir eine Zahl ausgedacht.");
    System.out.println("Versuche doch mal sie zu erraten.");
    do
    {
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
                }
        }
            
    } 
   while(geraten!=gemerkt);
}
    
}
