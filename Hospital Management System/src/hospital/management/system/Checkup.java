
package hospital.management.system;


public class Checkup {
    //attributes of the class
Doctor doctor;
Patient patient;
int prioriity;
String recomendation,date;

// the parametarized constructor To initialize data members 

    public Checkup(Doctor doctor, Patient patient, int prioriity, String recomendation, String date) {
        this.doctor = doctor;
        this.patient = patient;
        this.prioriity = prioriity;
        this.recomendation = recomendation;
        this.date = date;
    }

//    Checkup(DoctorList d, Patient p1, int i, String a, String string) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
////accessor and mutator methods getters and setters 
    
    //like any getters and setters method in the previus classes
    
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getPrioriity() {
        return prioriity;
    }

    public void setPrioriity(int prioriity) {
        this.prioriity = prioriity;
    }

    public String getRecomendation() {
        return recomendation;
    }

    public void setRecomendation(String recomendation) {
        this.recomendation = recomendation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    ////the toString function to display data
    @Override
    public String toString() {
        return "Checkup{" + "doctor=" + doctor.toString() + ", patient=" + patient.toString() + ", prioriity=" + prioriity + ", recomendation=" + recomendation + ", date=" + date + '}';
    }



    
}
