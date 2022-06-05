
package hospital.management.system;


public class Doctor {
    //the attributes of the class
    
    private String Id,Name,Contact,Specialty;
    private int fees;

    // the unparametarized constructor 
    
    public Doctor() {
    }

    
    //// the unparametarized constructor  to initialize the values of the attributes
    
    public Doctor(String Id, String Name, String Contact, String Specialty, int fees) {
        this.Id = Id;
        this.Name = Name;
        this.Contact = Contact;
        this.Specialty = Specialty;
        this.fees = fees;
    }
    ////accessor and mutator methods getters and setters

    
    //// the function getid is used to return the id 
    
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

    public String getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(String Specialty) {
        this.Specialty = Specialty;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    ////the toString function to display data
    
    @Override
    public String toString() {
        return "Doctor{" + "Id=" + Id + ", Name=" + Name + ", Contact=" + Contact + ", Specialty=" + Specialty + ", fees=" + fees + '}';
    }
    
    
    
}
