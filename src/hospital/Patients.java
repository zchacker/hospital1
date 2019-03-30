
package hospital;

import java.util.ArrayList;

public class Patients {
    
    int ID;
    String name;
    String address;
    String phone;
    String email;
    String type;
    ArrayList<Service> services = new ArrayList<Service>();
    
    
    public Patients() {
    }

    public Patients(int ID, String name, String address, String phone, String email, String type) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.type = type;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }
    
    
     @Override
    public String toString() {
        return "ID: "+this.ID+"\nName: "+this.name+"\nAddress : "+this.address+"\nPhone : "+this.phone+"\nEmail: "+this.email+"\nType "+"\n************************************\n";
    }
        
}
