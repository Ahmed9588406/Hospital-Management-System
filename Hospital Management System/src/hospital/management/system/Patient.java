/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;

/**
 *
 * @author Ahmed Alaa
 */
public class Patient {
    
    //the attributes of the class
     private String Id,Name,Contact;
// the unparametarized constructor  to initialize the values of the attributes
    public Patient() {
        Id="";
        this.Name="";
        this.Contact="";
    }
// the parametarized constructor To initialize data members 
    
    public Patient(String id, String name, String Contact) {
        this.Id = id;
        this.Name = name;
        this.Contact = Contact;
    }

    //accessor and mutator methods getters and setters
    
    // the function getid is used to return the id 
    public String getId() {
        return Id;
    }
// the function setid is used to set a value for the id because its private 
    
    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }
    
//the toString function to display data
    
    @Override
    public String toString() {
        return "Patient{" + "Id=" + Id + ", Name=" + Name + ", Contact=" + Contact + '}';
    }
    
    
    
}
