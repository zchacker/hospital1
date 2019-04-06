package hospital;

public class Service {

    int ID;
    String name;
    int price;
    private Doctor doctor;

    public Service() {
    }

    public Service(int ID, String name, int price, Doctor doctor) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.doctor = doctor;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "ID : " + this.ID + "\nName: " + this.name + "\nPrice: " + this.price + "\n";
    }

}
