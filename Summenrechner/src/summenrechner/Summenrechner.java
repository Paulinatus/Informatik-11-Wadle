
package summenrechner;
public class Summenrechner 
{
    public static void main(String[] args) 
    {
      int summe=0;
      int zahl=0;
      zahl=new java.util.Scanner(System.in).nextInt();
      while (zahl>=0)
      {
          summe=summe+zahl;
          zahl=new java.util.Scanner(System.in).nextInt();
      }
      System.out.println("Die_Summe_beträgt_"+summe+".");
      System.out.println("Auf wiedersehen");
    }
    
}
