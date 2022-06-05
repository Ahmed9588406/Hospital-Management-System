
package hospital.management.system;

import java.util.Scanner;


public class HospitalManagementSystem {

   
    public static void main(String[] args) {
//        Doctor d=new Doctor("5545","Ahmed","858789", "Nose", 5000);
//        DoctorList dlist=new DoctorList();
//        dlist.InsertDoctor(d);
//        dlist.Printdata();
     PatientList plist=new PatientList();
     DoctorList dlist =new DoctorList();
     Scanner s=new Scanner(System.in);
     String choices;
        while (true) {            
            MainMenu();
            choices=s.nextLine();
            if (choices.equals("1")) {
                System.out.println("\n Doctor ID");
                String id=s.nextLine();
                
                System.out.println("\n Doctor Name");
                String name=s.nextLine();
                
                System.out.println("\n Doctor Contact");
                String contact =s.nextLine();
                
                System.out.println("\n Doctor Speciilaity");
                String spec=s.nextLine();
                
                System.out.println("\n Doctor Fee");
                int fee=s.nextInt();
                s.nextLine();
                
                Doctor d=new Doctor(id, name, contact, spec, fee);
                dlist.InsertDoctor(d);
                
                
            } else if(choices.equals("2")) {
                System.out.println("\n Patient ID");
                String id=s.nextLine();
                
                System.out.println("\n PatientName");
                String name=s.nextLine();
                
                System.out.println("\n Patient Contact");
                String contact =s.nextLine();
                
                Patient p=new Patient(id, name, contact);
                plist.InsertPatient(p);
                
            }else if(choices.equals("3")){
            dlist.Printdata();
            }
            else if(choices.equals("4")){
            plist.Printdata();
            }
            else if(choices.equals("5")){
                System.out.println("\n Welcome to CheckUp Menu \n");
                CheckUpList [] clist =new CheckUpList[dlist.size()];
                for(int i=0;i<clist.length;i++){
                clist[i]=new CheckUpList();
                Doctor doctor=dlist.getAtIndex(i);
                    System.out.println("\n\nEnter Patient For Doctor ");  
                    System.out.println("Name                  :"+doctor.getName());
                    System.out.println("Specialty             :"+doctor.getSpecialty());
                    System.out.println("Fees                  :"+doctor.getFees());
                    System.out.println("All Patient :");
                    plist.Printdata();
                    while (true) {                        
                        System.out.println("Enter Patient Id Or Type null to Stop ");
                        String id=s.nextLine();
                        
                        if(id.equals("null")){
                        break;
                        }
                        System.out.println("Priority 3 for Emergency  2 for Intermediates any other key for normal ");
                        String per=s.nextLine();
                        int p=1;
                        
                        if(per.equals("3")){
                        p=3;
                        }else if(per.equals("2")){
                        p=2;
                        }
                        Patient patient=plist.SearshByID(id);
                        if(patient==null){
                        
                            System.out.println("\n Invalid Patient ID :\n");
                        }
                        else{
                        
                        Checkup cup=new Checkup(doctor, patient, p, "", ""+java.util.Calendar.getInstance().getTime().toString());
                        clist[i].Enqueue(cup);
                        }
                        
                        
                        
                        
                    }
                
                }
                for(int i=0;i<clist.length;i++)
                {
                
                    System.out.println("\n\n Patient "+(i+1)+" In Queue For Doctor "+dlist.getAtIndex(i).getName());
                    for(int j=0; j<clist[i].size();j++)
                    {
                    
                        System.out.println("Enter Recomendation For Patient : "+clist[i].getPatient(j));
                        String rec=s.nextLine();
                        clist[i].addRcomendation(j, rec);
                    }
                
                }
                
            
            }
            else if(choices.equals("0")){
            break;
            }
            else{
                System.out.println("\n\n Invalid Choice : \n");
            }
            
            
            
            
            
            
            
        }
     
     
     
     
     
     
     
        
    }
    
    public static void MainMenu(){
        System.out.println("\n\n ||    *****     HospitalManagementSystem     *****    ||");
        System.out.println("          ||  Main Menu  ||");
        System.out.println("\n Enter 1 for Insert  New Doctor   ");
        System.out.println("\n Enter 2 for Insert Patient   ");
        System.out.println("\n Enter 3 for Print all Doctor ");
        
        
        System.out.println(" Eneter 4 for print all Patient ");
        
        
        System.out.println(" Enter 5 for CheckUp Menu ");
        System.out.println(" Enter 0 for Exit ");
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
