
package hospital;

import java.util.ArrayList;
import java.util.Scanner;
import sun.java2d.SunGraphics2D;

public class Main {
 
    ArrayList<Administration> admins = new ArrayList<Administration>();
    ArrayList<Nurse> nurses = new ArrayList<Nurse>();
    ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    
    public static void main(String args[]){
        Main main = new Main();
        main.program();
    }
    
    public void program(){
        
        Scanner sc = new Scanner(System.in);// هذا حتى نقرأ كتابة المتسخدم
       
        // هنا اضفنا المدراء فقط  ثلاث مدراء
        admins.add(new Administration(1, "hind", "Ryidh", "05000000", "a@gmail.com", 15000, 1));
        admins.add(new Administration(2, "salma", "Ryidh", "05000000", "b@gmail.com", 15000, 1));
        admins.add(new Administration(3, "rawan", "Ryidh", "05000000", "c@gmail.com", 15000, 1));
        
        while(true){
            
            // هنا تسجيل الدخول واخذ الاسم 
            System.out.println("Enter name : ");
            String name = sc.next();
            
            boolean found = false;// هذا المتغير يحدد اذا وجدنا اسم المدير ام لأ
            
            // البحث في المصفوفة الخاصة بالمدراء و ايجاد الاسم 
            for(int i = 0; i < admins.size(); i++){
                // مقارنة الاسم الذي ادخله المستخدم و الاسم الموجود بالمصفوفة
                if(admins.get(i).getName().equals(name)){
                    found = true;
                    break;
                }
            }
            
            if(found)
                break;
        }
       
        while(true){
            
            // هذه القائمة الرئيسية
            System.out.println("1 - Add doctor");
            System.out.println("2 - Add patients");
            System.out.println("3 - Add services");
            System.out.println("4 - Print the patient’s bill");
            System.out.println("5 - Print the doctor information");
            System.out.println("6 - Print the patient information");
            System.out.println("7 - Exit the program");
            
            int choose = sc.nextInt();
            
            try{
                // هنا نأخذ المدخل الخاص بالمستخدم 
                switch(choose){
                    case 1: 

                        Doctor doctor = new Doctor();// انشاء اوجيكت الدكتور
                        
                        String stringAnswer;// هذا المتغير يستقبل النص الحرفي من المستخدم في الجافا
                        int intAnswer;// هذا المتغير يستقبل الارقام من المستخدم و يخزنها

                        System.out.print("Enter ID : ");
                        intAnswer = sc.nextInt();
                        doctor.setID(intAnswer);

                        System.out.print("Enter name : "); 
                        stringAnswer = sc.next();
                        doctor.setName(stringAnswer);


                        System.out.print("Enter address : ");    
                        stringAnswer = sc.next();
                        doctor.setAddress(stringAnswer);

                        System.out.print("Enter phone : ");   
                        stringAnswer = sc.next();
                        doctor.setPhone(stringAnswer);

                        System.out.print("Enter email : ");   
                        stringAnswer = sc.next();
                        doctor.setEmail(stringAnswer);


                        System.out.print("Enter salary : ");   
                        intAnswer = sc.nextInt();
                        doctor.setSalary(intAnswer);


                        System.out.print("Enter specialty: ");   
                        stringAnswer = sc.next();
                        doctor.setSpecialty(stringAnswer);

                        System.out.print("Enter rank: ");   
                        intAnswer = sc.nextInt();
                        doctor.setRank(intAnswer);

                        System.out.println("Nurse information:- ");

                        Nurse nurse = new Nurse();// انشاء اوبجيكت الممرضة

                        System.out.print("Enter nurse ID: ");
                        intAnswer = sc.nextInt();
                        nurse.setID(intAnswer);                    

                        System.out.print("Enter nurse Name: ");
                        stringAnswer = sc.next();
                        nurse.setName(stringAnswer);

                        System.out.print("Enter nurse address: ");
                        stringAnswer = sc.next();
                        nurse.setAddress(stringAnswer);

                        System.out.print("Enter nurse phone: ");
                        stringAnswer = sc.next();
                        nurse.setPhone(stringAnswer);

                        System.out.print("Enter nurse email: ");                    
                        stringAnswer = sc.next();
                        nurse.setEmail(stringAnswer);

                        System.out.print("Enter nurse salary: ");
                        intAnswer = sc.nextInt();
                        nurse.setSalary(intAnswer);

                        System.out.println("Enter nurse specialty");
                        stringAnswer = sc.next();
                        nurse.setSpecialty(stringAnswer);

                        System.out.println("Enter nurse rank");
                        intAnswer = sc.nextInt();
                        nurse.setRank(intAnswer);

                        doctor.setNurse(nurse);
                        doctors.add(doctor);

                        break;
                    
                    case 2:
                        
                        Patients patient = new Patients();
                        
                        System.out.println("Enter patient information:- ");
                        System.out.println("Enter ID :");
                        intAnswer = sc.nextInt();
                        patient.setID(intAnswer);
                        
                        System.out.println("Enter name: ");
                        stringAnswer = sc.next();
                        patient.setName(stringAnswer);
                                                
                        System.out.println("Enter Address: ");
                        stringAnswer = sc.next();
                        patient.setAddress(stringAnswer);
                        
                        System.out.println("Enter Phone: ");
                        stringAnswer = sc.next();
                        patient.setPhone(stringAnswer);
                        
                        System.out.println();
                        System.out.println();
                        break;                     
                    case 5: 
                        // هنا طباعة معلومات الأطباء
                        for(int i = 0; i < doctors.size(); i++){
                            System.out.println(doctors.get(i).toString());
                        }
                        break;
                    case 7: 
                        System.out.println("Exit program , Thanks");
                        System.exit(1);
                        break;
                    default :
                        System.out.println("Incorrect Entry! Try agian!");
                        break;
                }                                
            }catch(Exception e){
                e.printStackTrace();
            }
        }        
    }
}
