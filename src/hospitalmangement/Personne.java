
package hospitalmangement;
import java.util.Scanner;
public abstract class Personne {
    protected String CIN;
    protected String full_name;
    protected int age;
    protected String gender; 
    Scanner entrer = new Scanner(System.in);
    protected abstract void entrerinfo();
    protected void display(){
        System.out.println(CIN +"\t"+ full_name +"  \t"+ gender +" \t"+ age);
}
}
