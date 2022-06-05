 
package hospital.management.system;
class DoctorNode{
// the attributes of the class 
    //the doctor is an object from the class Doctor
    
Doctor doctor;

// next to refere to the next node in the list 
//prev to refere to the previus node in the list
DoctorNode next,prev;

 // the unparametarized constructor 
    public DoctorNode() {
    }
      // the parametarized constructor to set an initialization for all attributes 

    public DoctorNode(Doctor doctor) {
        this.doctor = doctor;
        next=null;
        prev=null;
    } 
    
}

public class DoctorList {
    //the attributes of the class
    //Head to be a reference for the first Node in the linkedlist 
    //Tail to be a reference for the last Node in the linkedlist
DoctorNode Head,Tail;

// the unparametarized constructor to initialize the Head and Tail
    public DoctorList() {
        Head=null;
        Tail=null;
    }
    
    //  the function InsertDoctor takes an attribut from type Doctor and its return type is void 
    //it insert the a doctor in our linkedlist of Doctor in class DoctorList
public void InsertDoctor(Doctor doctor){
    // // the constructor to creat a node from type DoctorNode
DoctorNode node=new DoctorNode(doctor);
if(Head==null||Tail==null){//ther is no list so this one is the first one
    //let the Head and the Tail to catch this node
    
Head=node;
Tail=node;

}else{
    //there is a list 
    // make the next of the Head is the node that i created in the constructor 
    
Head.next=node;
//make the previus of the node be the Head
node.prev=Head;
// make the head to refere to the node
Head=node;
}
}

//// the function SearshByID takes an attribte from type String and its return type fom the class Doctor 

public Doctor SearchByID(String id){
DoctorNode temp=Head;
    while (temp!=null) {        
        if(temp.doctor.getId().equals(id)){
        return temp.doctor;
        }
        temp=temp.prev;
    }
return  null;
}

// this function like the function above but searching by contact 
public Doctor SearshByContact(String contact){
DoctorNode temp=Head;
    while (temp!=null) {        
        if(temp.doctor.getContact().equals(contact)){
        return temp.doctor;
        }
        temp=temp.prev;
    }
return  null;
}
// this function size its return type from class int and it doesnt have any attributes refere to the number of Doctors
public int  size(){
int count=0;
DoctorNode temp =Head;
while(temp!=null){
count++;
temp=temp.prev;
}
return  count;
}

public void AllDoctorInfo(){
DoctorNode temp=Head;
    while (temp!=null) {        
        System.out.println("Doctor ID = "+temp.doctor.getId()+"Doctor Name = "+temp.doctor.getName()+"Doctor Contact = "+temp.doctor.getContact()+"      Specialty = "+temp.doctor.getSpecialty()+"Doctor Fee = "+temp.doctor.getFees());
        temp=temp.prev;
    }




}

// the function  getAtIndex is used for making an index for the doctor in displayed menu in the MainMenu fucnction in the main class

    public Doctor getAtIndex(int index) {
        DoctorNode temp=Head;
        for(int i=0;i<index;i++){
        temp=temp.prev;
        
        }
        return temp.doctor;
    }

    // the function Printdata is used to print the data of the Doctor 
public void Printdata(){
DoctorNode temp=Head;
int count=0;
while(temp!=null){
    count++;
System.out.println(count+"     "+temp.doctor.toString());
temp=temp.prev;
}

}
   
}
