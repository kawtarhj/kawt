
package hospitalmangement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
public class HospitalMangement {

    public static void main(String[] args) {
  ArrayList <String> mounth=new ArrayList<>();
        mounth.add("janvier");
        mounth.add("Février");
        mounth.add("Mars");
        mounth.add("Avril");
        mounth.add("Mai");
        mounth.add("Juin");
        mounth.add("juillet");
        mounth.add("aout");
        mounth.add("septembre");
        mounth.add("octobre");
        mounth.add("novembre");
        mounth.add("décembre");
        Calendar calendar = Calendar.getInstance();
        System.out.println("*********************************************************************************");
        System.out.println("                                   WELCOMe TO OUR HOSPITAL         ");
         System.out.println("*********************************************************************************");
        System.out.print("Date: " + mounth.get(calendar.get(Calendar.MONTH)) + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\n");
       
        /*for(int i=0;i<2;i++){
            D[i]=new Doctors();
        }
        D[0].entrerinfo();
        D[0].display();*/
       Scanner input = new Scanner(System.in);
        int choice=0;
             
            do {
                System.out.println("\n                                    MAIN MENU");
                System.out.println("*****************************************************************************");
		System.out.println();
		System.out.println("1. doctors");
		System.out.println("2. patients");
		System.out.println("3. laboratoire");
		System.out.println("4. medicines");
		System.out.println("5.hosipitalFacility");
		System.out.println("6. Exit");   
               	System.out.println("Enter an option: ");
                choice = input.nextInt();
                System.out.println("*****************************************************************************");
                        switch (choice){
                        case 1: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("                      **DOCTOR SECTION**");
                                System.out.println("--------------------------------------------------------------------------------");
                                for(int i=0;i<10;i++){
                                Doctors doc1=new Doctors();
                                doc1.entrerinfo();
                                doc1.display();}
                                break;
                }
                        case 2:{
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("                      **PATIENT SECTION**");
                                System.out.println("--------------------------------------------------------------------------------");
                                for(int i=0;i<10;i++){
                                Patient Patient1=new Patient();
                                Patient1.entrerinfo();
                                Patient1.display();}
                                 break;
                    
                }
                        case 3:{
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("                      **LABORATOIRE SECTION**");
                                System.out.println("--------------------------------------------------------------------------------");
                                Laboratoire laboratoire=new Laboratoire();
                                laboratoire.entlabo();
                                laboratoire.display();
                                break;
                }
                        case 4:{
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("                      **MEDECINES SECTION**");
                                System.out.println("--------------------------------------------------------------------------------");
                                for(int i=0;i<10;i++){
                                medicines med=new medicines();
                                med.entmed();
                                med.display();}
                                break; 
                }
                        case 5:{
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("                      **HOSPITAL_FACI SECTION**");
                                System.out.println("--------------------------------------------------------------------------------");
                                hosipitalFacility HosF=new hosipitalFacility();
                                HosF.entrhosFac();
                                HosF.display();
                                break; 
                }
                        case 6:{
                                System.out.println("********************************************");
				break;
                }
                    
                        default:
                    {
                                System.out.println(" You Have Enter Wrong Choice!!!");
                    }      
            }
            }while(choice!=6);
        }
    
}
    