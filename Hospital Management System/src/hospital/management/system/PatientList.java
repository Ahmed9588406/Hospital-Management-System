
package hospital.management.system;
class PatientNode{

    
    // the attributes of the class 
    //the patient is an object from the class Patient
Patient patient;
// next to refere to the next node in the list 
//prev to refere to the previus node in the list
PatientNode next,prev;
 // the unparametarized constructor 
    public PatientNode() {
    }

    // the parametarized constructor to set an initialization for all attributes 
    
    public PatientNode(Patient patient) {
        this.patient = patient;
        next=null;
        prev=null;
    }

    
    
}

public class PatientList {
    //the attributes of the class
    //Head to be a reference for the first Node in the linkedlist 
    //Tail to be a reference for the last Node in the linkedlist
PatientNode Head,Tail;

 // the unparametarized constructor to initialize the Head and Tail

    public PatientList() {
        Head=null;
        Tail=null;
    }

    // the function InsertPatient takes an attribut from type Patient and its return type is void 
    //it insert the a patient in our linkedlist of Patient in class PtientList
    
public void InsertPatient(Patient patient){
    // the constructor to creat a node from type PatientNode
PatientNode node=new PatientNode(patient);
if(Head==null||Tail==null){ //ther is no list so this one is the first one
    //let the Head and the Tail to catch this node
Head=node;
Tail=node;

}else{ //there is a list 
    // make the next of the Head is the node that i created in the constructor 
Head.next=node;
//make the previus of the node be the Head
node.prev=Head;
// make the head to refere to the node
Head=node;
}
}
// the function SearshByID takes an attribte from type String and its return type fom the class Patient 

public Patient SearshByID(String id){
    // making a node called temp from the type PrintNode
PatientNode temp=Head;
    while (temp!=null) {
        // checking if a passing id is equal to an id that i have
        if(temp.patient.getId().equals(id)){
        return temp.patient;
        }
        //Searching from behind and passing to the previuse
        temp=temp.prev;
    }
return  null;
}
// this function like the function above but searching by contact 
public Patient SearshByContact(String contact){
PatientNode temp=Head;
    while (temp!=null) {        
        if(temp.patient.getContact().equals(contact)){
        return temp.patient;
        }
        temp=temp.prev;
    }
return  null;
}
//function print from return type void and it prints the data of the Patients

public void Printdata(){
PatientNode temp=Head;
int count=0;
while(temp!=null){
    count++;
    // accses the object(temp) from PatientNode to the object(patient)from Patient class and accessing the overrided method toString 
System.out.println(count+"     "+temp.patient.toString());
temp=temp.prev;
}

}
// this function size its return type from class int and it doesnt have any attributes refere to the number of Patient
public int size(){
int count=0;
PatientNode temp =Head;
while(temp!=null){
count++;
temp=temp.prev;
}
return  count;
}






    
}
