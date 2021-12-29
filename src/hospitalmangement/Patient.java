
package hospitalmangement;

public class Patient extends Personne{
    String disease;
    String Admit_Statut;
   
    @Override
    protected void entrerinfo() {
        System.out.print("CIN: ");
        CIN=entrer.nextLine();
        System.out.print("full_name: ");
        full_name=entrer.nextLine();
        System.out.print("gender: ");
        gender=entrer.nextLine();
        System.out.print("disease: ");
        disease=entrer.nextLine();
        System.out.print("Admit_Statut: ");
        Admit_Statut=entrer.nextLine();
        System.out.print("age: ");
        age=entrer.nextInt();
        
    }
    @Override
    protected void display(){
        System.out.println(CIN +"\t"+ full_name +"  \t"+ gender +"  \t"+ Admit_Statut +"  \t"+ disease +"  \t"+age);
}
}
