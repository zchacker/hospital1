
package hospital;

public class Doctor extends Employee{
    String specialty;
    int rank;
    Nurse nurse;
    
    public Doctor() {
    }

    public Doctor(int ID, String name, String address, String phone, String email, int salary, Nurse nurse, int rank, String specialty) {
        super(ID, name, address, phone, email, salary);
        this.rank = rank;
        this.specialty = specialty;
        this.nurse = nurse;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    @Override
    public String toString() {
        return "ID: "+this.ID+"\nName: "+this.name+"\nAddress : "+this.address+"\nPhone : "+this.phone+"\nEmail: "+this.email+"\nSalary: "+this.salary+"\n\nNurse information :\nName : "+this.nurse.getName()+"\nAddress : "+this.nurse.getAddress()+"\nPhone : "+this.nurse.getPhone()+"\nEmail : "+this.nurse.getEmail()+"\nSalary:"+this.nurse.getSalary()+"\n************************************\n";
    }
    
    
}
