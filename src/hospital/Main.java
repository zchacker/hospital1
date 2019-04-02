
package hospital;

import java.util.ArrayList;
import java.util.Scanner;
import sun.java2d.SunGraphics2D;

public class Main {
 
    ArrayList<Administration> admins = new ArrayList<Administration>();
    ArrayList<Nurse> nurses = new ArrayList<Nurse>();
    ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    ArrayList<Patients> patients = new ArrayList<Patients>();
    ArrayList<Service> services = new ArrayList<Service>();
    
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
            System.out.print("Choose number : ");
            
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
                        
                        System.out.println("Enter Email: ");
                        stringAnswer = sc.next();
                        patient.setEmail(stringAnswer);
                        
                        System.out.println("Enter type (A or B) : ");
                        stringAnswer = sc.next();
                        patient.setType(stringAnswer);
                        
                        patients.add(patient);
                        
                        break; 
                    case 3:
                        Service service = new Service();
                        
                        System.out.println("Enter ID: ");
                        intAnswer = sc.nextInt();
                        service.setID(intAnswer);
                        
                        System.out.println("Enter Name: ");
                        stringAnswer = sc.next();
                        service.setName(stringAnswer);
                        
                        System.out.println("Enter Price: ");
                        intAnswer = sc.nextInt();
                        service.setPrice(intAnswer);
                        
                        services.add(service);
                        break;
                    case 4:
                        
                        boolean patientFound = false;
                        int  patient_index = 0; // هذا رقم المريض في المصفوفة
                        
                        while(true){
                            // يدخل اسم المريض
                            // ورقم الاي دي 
                            System.out.println("Enter patient name : ");
                            String name = sc.next();
                            System.out.println("Enter ID : "); 
                            int id = sc.nextInt();
                            
                            for(int i = 0; i < patients.size(); i++ ){
                                if(patients.get(i).getName().equals(name) && patients.get(i).getID() == id){
                                    patient_index = i;
                                    patientFound = true;
                                    break;
                                }
                            }
                            
                            if(patientFound)
                                break;
                            else 
                                continue;
                        }
                        //نختبر هل توجد خدمات ام لا
                        
                        if(services.size() > 0){
                            // هنا فقط نعرض للمريض الخدمات المتاحة في النظام
                            System.out.println("Choose one of thsee services : -");
                            for(int i = 0; i < services.size(); i++){
                                // استخدمت دالة 
                                // toLowerCase
                                // حتى اجعل الحروف صغيرة لتكون المقارنة صحيحة في حالة ان المستخدم ادخل حرف كبير
                                if(patients.get(patient_index).getType().toLowerCase().equals("a")){
                                    
                                    // حتى نحسب الخصم 
                                    // نضرب  المبلغ الاجمالي في  
                                    // 25
                                    // ثم نقسم على  
                                    // 100
                                    // بعدها ينتج لنا العدد الذي يمثل النسبة 
                                    // نقوم بخصمه من المبلغ الكبير الاجمالي فنحصل على الاجمالي بعد الخصم
                                    int discount = ((25 * services.get(i).getPrice()) / 100);// هنا نحسب كم المبلغ المطلوب خصمة 
                                    int total_after_discount = services.get(i).getPrice() - discount;
                                    
                                    System.out.println( i + ")" + services.get(i).getName() + " -- " + services.get(i).getPrice() + " after discount = "+ total_after_discount);
                                }else{
                                    System.out.println( i + ")" + services.get(i).getName() + " -- " + services.get(i).getPrice());
                                }
                            }

                            int ch = sc.nextInt();
                            if(ch > services.size()){
                                System.out.println("Incorrect choose !");
                            }else{
                                if(patients.get(patient_index).getType().toLowerCase().equals("a")){
                                    int discount = ((25 * services.get(ch).getPrice()) / 100);// هنا نحسب كم المبلغ المطلوب خصمة 
                                    int total_after_discount = services.get(ch).getPrice() - discount;
                                    
                                    Service se = services.get(ch);
                                    se.setPrice(total_after_discount);// هنا السعر بعد التعديل
                                    patients.get(patient_index).add_service(se);
                                }else{
                                    patients.get(patient_index).add_service(services.get(ch));
                                }
                                
                            }
                        }else{
                            System.out.println("No Services found!");
                        }
                        
                        // هنا طباعة الفاتورة الخاصة بالمريض
                        System.out.println("******************************");
                        System.out.println("* \t\t Bill \t\t *");
                        int total_bill = 0;// هنا اجمالي الفاتورة
                        for(int i = 0 ; i < patients.get(patient_index).getServices().size(); i++){
                            System.out.println("Service Name : " + patients.get(patient_index).getServices().get(i).getName() + " --- " + patients.get(patient_index).getServices().get(i).getPrice());
                            total_bill += patients.get(patient_index).getServices().get(i).getPrice();
                        }   
                        
                        System.out.println("Totla Bill : " + total_bill);
                        System.out.println("*****************************");
                        break;
                    case 5: 
                        // هنا طباعة معلومات الأطباء
                        // ننتبه أننا استخدمنا الدالة 
                        // toString()
                        // و الموجودة بداخل الكلاس والتي تطبع لنا جميع المعلومات الخاصة بالكلاس
                        for(int i = 0; i < doctors.size(); i++){
                            System.out.println(doctors.get(i).toString());
                        }
                        break;
                    case 6:
                        // هنا طباعة معلومات المرضى كلهم
                        // ننتبه أننا استخدمنا الدالة 
                        // toString()
                        // و الموجودة بداخل الكلاس والتي تطبع لنا جميع المعلومات الخاصة بالكلاس
                        for(int i = 0; i < patients.size(); i++){
                            System.out.println(patients.get(i).toString());
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
