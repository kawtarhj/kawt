
package hospitalmangement;
import java.util.Scanner;
public class medicines {
    String name;
    String cost;
    String company;
    String date_exip;
    protected void entmed(){
        Scanner entrer=new Scanner(System.in);
        System.out.print("name: ");
        name=entrer.nextLine();
        System.out.print("company: ");
        company=entrer.nextLine();
        System.out.print("date_exip: ");
        date_exip=entrer.nextLine();
        System.out.print("cost: ");
        cost=entrer.nextLine();
    }
    protected void display(){
        System.out.println(name+" \t"+company+" \t"+date_exip+" \t"+cost);
    }
}
