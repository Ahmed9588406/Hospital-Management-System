
package hospital.management.system;

class CheckUpNode{
    
    //
    
    // the attributes of the class 
    //the checkup object from the CkeckUp class
Checkup checkup;
// next to refere to the next node in the list 
//prev to refere to the previus node in the list

CheckUpNode next,prev;

// the parametarized constructor to set an initialization for all attributes 

    public CheckUpNode(Checkup checkup) {
        next = null;
        prev = null;
        this.checkup=checkup;
    }
}


public class CheckUpList {
     //the attributes of the class
    //Head to be a reference for the first Node in the linkedlist 
    //Tail to be a reference for the last Node in the linkedlist 
    
CheckUpNode Head,Tail;

// the unparametarized constructor to initialize the Head and Tail
    public CheckUpList() {
        Head = null;
        Tail = null;
    }
    
 // Here i used the Priority Queue is a  type of data structure used to FIFO(First In First Out)

 //and each element has a Prioriity 
    
    //this function Enqueue is used gor insert the element in the list in the Structure of the Priority Queue  
public void Enqueue(Checkup checkup){
    //the constructor to creat a node from type CheckUpNode
    
CheckUpNode node =new CheckUpNode(checkup);
if(Head==null || Tail==null){//ther is no list so this one is the first one
    //let the Head and the Tail to catch this node
    
Head=node;
Tail=node;

}
//here if the priority of the head is less than the priority of the node i created in the constructor

else if(Head.checkup.getPrioriity()<checkup.getPrioriity()){
    
//let the next of the Head be the node
Head.next=node;
//and the previuse of the node be the Head 
node.prev=Head;
//and finnaly let the head refer to the node created from constructor
Head=node;


}
// here if the priority of the Tail larger than the passing node 
else if(Tail.checkup.getPrioriity()>=checkup.getPrioriity()){
    
 //let the previus of the tail be the node created from the constructor    
Tail.prev=node;
//and the next of the node be the Tail of the list
node.next=Tail;
//and finally let the Tail refete to the node that created by the constructor
Tail=node;

}


else{
CheckUpNode temp =Tail;

//this loop to scan all the element of the list

while(temp!=null){

if(temp.checkup.getPrioriity()>=checkup.getPrioriity()){

break;
}
temp=temp.next;
}

//if the priority of the element in the maybe middle or something near or far from it but not in the lead or behind 

//let the next of the node be the temp 
node.next=temp;
//let the previuse of the node be the previuse of the temp (here the node will be bettwen the temp and the prev of the temp  )
node.prev=temp.prev;
//now let the prev of the temp be the next of the node
temp.prev.next=node;
//finally be the prev of the temp be the node
temp.prev=node;
 
 
}



}
//is used to get an element out of the queue

public Checkup dequeue(){
if(Head==null){

return null;
}
CheckUpNode tem =Head;
Head=Head.next;
return tem.checkup;
}
//used for adding a recomendation 

public void addRcomendation(int index,String rec){
CheckUpNode temp=Head;
int i=0;
while(temp!=null){
if(index==i){
temp.checkup.setRecomendation(rec);
break;

}
i++;
temp=temp.prev;
}

}
//this function returns the patient
public Patient getPatient(int index){
CheckUpNode temp=Head;
int i=0;
    while (temp!=null) {        
        if(index==i){
        break;
        }
        i++;
        temp=temp.prev;
        
    }
return  temp.checkup.getPatient();
}

// this function size its return type from class int and it doesnt have any attributes refere to the number of checkups
public int  size(){
int count=0;
CheckUpNode temp =Head;
while(temp!=null){
count++;
temp=temp.prev;
}
return  count;
}






//the print function made to display data of the CheckUpList

public void print(){
CheckUpNode temp =Head;
while(temp!=null){
    System.out.println(temp.checkup.getPrioriity()+"      "+temp.checkup.getRecomendation());
temp=temp.prev;
}

}






    
}
