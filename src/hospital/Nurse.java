package hospital;

public class Nurse extends Employee{
    String specialty;
    int rank;

    public Nurse(int ID, String name, String address, String phone, String email, int salary , int rank, String specialty) {
        super(ID, name, address, phone, email, salary);
        this.rank = rank;
        this.specialty = specialty;
    }

    public Nurse() {
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
    
    
    
            
}
