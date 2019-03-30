package hospital;

public class Administration extends Employee {
    int position;

    public Administration() {
    }
    
    public Administration(int ID, String name, String address, String phone, String email, int salary, int position) {
        super(ID, name, address, phone, email, salary);
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    
    
    
}
