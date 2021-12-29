
package hospitalmangement;

public class Doctors extends Personne{
    protected double salary;
    protected int numMedicine;
    protected String specilist;
    protected String work_time;
    protected String speciality;
    protected int doctor_room;
    

    @Override
    protected void entrerinfo() {
        System.out.print("CIN: ");
        CIN=entrer.nextLine();
        System.out.print("full_name: ");
        full_name=entrer.nextLine();
         System.out.print("gender: ");
        gender=entrer.nextLine();
        System.out.print("work_time: ");
        work_time=entrer.nextLine();
        System.out.print("speciality: ");
        speciality=entrer.nextLine();
        System.out.print("age: ");
        age=entrer.nextInt();
        System.out.print("salary: ");
        salary=entrer.nextDouble();
        System.out.print("numMedicine: ");
        numMedicine=entrer.nextInt();
        System.out.print("doctor_room: ");
        doctor_room=entrer.nextInt();
    }
    @Override
     protected void display(){
        System.out.println(CIN +"\t"+ full_name +"  \t"+ gender +" \t"+ age +" \t"+ work_time +" \t"+speciality+" \t"+ salary +" \t"+ numMedicine +" \t"+ doctor_room );
}
}
