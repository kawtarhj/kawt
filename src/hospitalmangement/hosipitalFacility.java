
package hospitalmangement;

import java.util.Scanner;

public class hosipitalFacility {
    String HosipitalFacility;
    protected void entrhosFac(){
        Scanner entrer =new Scanner(System.in);
        System.out.print("HosipitalFacility:  ");
        HosipitalFacility=entrer.nextLine();
        
    }
    protected void display(){
        System.out.println("\t"+HosipitalFacility+" \t");
    }
}
