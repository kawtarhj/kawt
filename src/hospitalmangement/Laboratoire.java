
package hospitalmangement;
import java.util.Scanner;
public class Laboratoire {
    String fecility;
    String cost;
    protected void entlabo(){
         Scanner entrer =new Scanner(System.in);
         System.out.print("fecility: ");
         fecility=entrer.nextLine();
         System.out.print("cost: ");
         cost=entrer.nextLine();
    }
    protected void display(){
        System.out.println(fecility+" \t"+cost);
    }
    
}
