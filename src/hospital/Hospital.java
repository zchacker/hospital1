package hospital;

import java.util.ArrayList;
import java.util.Scanner;
import sun.java2d.SunGraphics2D;

public class Hospital {

    ArrayList<Administration> admins = new ArrayList<Administration>();
    ArrayList<Nurse> nurses = new ArrayList<Nurse>();
    ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    ArrayList<Patients> patients = new ArrayList<Patients>();
    ArrayList<Service> services = new ArrayList<Service>();

    public static void main(String args[]) {
        Hospital main = new Hospital();
        main.program();
    }

    public void program() {

        Scanner sc = new Scanner(System.in);// هذا حتى نقرأ كتابة المتسخدم

        // هنا اضفنا المدراء فقط  ثلاث مدراء
        admins.add(new Administration(1, "hind", "Ryidh", "05000000", "a@gmail.com", 15000, 1));
        admins.add(new Administration(2, "salma", "Ryidh", "05000000", "b@gmail.com", 15000, 1));
        admins.add(new Administration(3, "rawan", "Ryidh", "05000000", "c@gmail.com", 15000, 1));

        while (true) {

            // هنا تسجيل الدخول واخذ الاسم 
            System.out.println("Enter name : ");
            String name = sc.next();

            boolean found = false;// هذا المتغير يحدد اذا وجدنا اسم المدير ام لأ

            // البحث في المصفوفة الخاصة بالمدراء و ايجاد الاسم 
            for (int i = 0; i < admins.size(); i++) {
                // مقارنة الاسم الذي ادخله المستخدم و الاسم الموجود بالمصفوفة
                if (admins.get(i).getName().equals(name)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        while (true) {

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

            try {
                String stringAnswer = "";// هذا المتغير يستقبل النص الحرفي من المستخدم في الجافا
                int intAnswer = 0;// هذا المتغير يستقبل الارقام من المستخدم و يخزنها

                // هنا نأخذ المدخل الخاص بالمستخدم 
                switch (choose) {
                    case 1:

                        Doctor doctor = new Doctor();// انشاء اوجيكت الدكتور

                        System.out.print("Enter ID : ");
                        try {
                            intAnswer = sc.nextInt();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        doctor.setID(intAnswer);

                        System.out.print("Enter name : ");
                        try {
                            stringAnswer = sc.next();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        doctor.setName(stringAnswer);

                        System.out.print("Enter address : ");
                        try {
                            stringAnswer = sc.next();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        doctor.setAddress(stringAnswer);

                        System.out.print("Enter phone : ");
                        try {
                            stringAnswer = sc.next();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        doctor.setPhone(stringAnswer);

                        System.out.print("Enter email : ");
                        try {
                            stringAnswer = sc.next();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        doctor.setEmail(stringAnswer);

                        System.out.print("Enter salary : ");
                        try {
                            intAnswer = sc.nextInt();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        doctor.setSalary(intAnswer);

                        System.out.print("Enter specialty: ");
                        try {
                            stringAnswer = sc.next();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        doctor.setSpecialty(stringAnswer);

                        System.out.print("Enter rank: ");
                        try {
                            intAnswer = sc.nextInt();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        doctor.setRank(intAnswer);

                        System.out.println("Nurse information:- ");

                        Nurse nurse = new Nurse();// انشاء اوبجيكت الممرضة

                        System.out.print("Enter nurse ID: ");
                        try {
                            intAnswer = sc.nextInt();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        nurse.setID(intAnswer);

                        System.out.print("Enter nurse Name: ");
                        try {
                            stringAnswer = sc.next();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        nurse.setName(stringAnswer);

                        System.out.print("Enter nurse address: ");
                        try {
                            stringAnswer = sc.next();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        nurse.setAddress(stringAnswer);

                        System.out.print("Enter nurse phone: ");
                        try {
                            stringAnswer = sc.next();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        nurse.setPhone(stringAnswer);

                        System.out.print("Enter nurse email: ");
                        try {
                            stringAnswer = sc.next();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        nurse.setEmail(stringAnswer);

                        System.out.print("Enter nurse salary: ");
                        try {
                            intAnswer = sc.nextInt();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        nurse.setSalary(intAnswer);

                        System.out.println("Enter nurse specialty");
                        try {
                            stringAnswer = sc.next();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        nurse.setSpecialty(stringAnswer);

                        System.out.println("Enter nurse rank");
                        try {
                            intAnswer = sc.nextInt();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        nurse.setRank(intAnswer);

                        doctor.setNurse(nurse);
                        doctors.add(doctor);

                        break;

                    case 2:

                        Patients patient = new Patients();

                        System.out.println("Enter patient information:- ");
                        System.out.println("Enter ID :");
                        try {
                            intAnswer = sc.nextInt();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        patient.setID(intAnswer);

                        System.out.println("Enter name: ");
                        try {
                            stringAnswer = sc.next();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        patient.setName(stringAnswer);

                        System.out.println("Enter Address: ");
                        try {
                            stringAnswer = sc.next();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        patient.setAddress(stringAnswer);

                        System.out.println("Enter Phone: ");
                        try {
                            stringAnswer = sc.next();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        patient.setPhone(stringAnswer);

                        System.out.println("Enter Email: ");
                        try {
                            stringAnswer = sc.next();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        patient.setEmail(stringAnswer);

                        System.out.println("Enter type (A or B) : ");
                        try {
                            stringAnswer = sc.next();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        patient.setType(stringAnswer);

                        patients.add(patient);

                        break;
                    case 3:
                        Service service = new Service();

                        System.out.println("Enter ID: ");
                        try {
                            intAnswer = sc.nextInt();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        service.setID(intAnswer);

                        System.out.println("Enter Name: ");
                        try {
                            stringAnswer = sc.next();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        service.setName(stringAnswer);

                        System.out.println("Enter Price: ");
                        try {
                            intAnswer = sc.nextInt();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        service.setPrice(intAnswer);

                        System.out.println("Select Doctor from list :- ");
                        // هنا نعرض الأطباء
                        for (int i = 0; i < doctors.size(); i++) {
                            System.out.println(i + ") Doctor Name : " + doctors.get(i).getName());
                        }

                        // هنا يجب اختيار طبيب
                        System.out.print("Select Doctor : ");
                        try {
                            intAnswer = sc.nextInt();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        // نختبر اذا اختار الرقم صح أو لا الرقم لازم يكون نفس حجم المصفوفة ولا يكون اكبر منها
                        if (intAnswer < doctors.size()) {
                            service.setDoctor(doctors.get(intAnswer));
                            services.add(service);
                        } else {
                            // في حالة اختار رقم خطأ تعطيه رسالة غلط
                            System.out.println("Pleas choose right doctor");
                        }

                        break;
                    case 4:
                       
                        /**
                         * ######################################
                           #                                    #
                           #            Part One                #   
                           ######################################
                         */
                        
                        // هذا الجزء خاص بطباعة فاتورة المريض
                        boolean patientFound = false; // هذا حتى نعرف اذا كان المريض موجود ام لا
                        int patient_index = 0; // هذا رقم المريض في المصفوفة

                        // يدخل اسم المريض
                        // ورقم الاي دي 
                        System.out.println("Enter patient name : ");
                        String name = "";
                        try {
                            name = sc.next();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        System.out.println("Enter ID : ");
                        int id = 0;
                        try {
                            id = sc.nextInt();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        
                        // بعد اخذنا معلومات المريض نقوم بالبحث هل هو موجود أم لا
                        
                        // هنا البحث 
                        for (int i = 0; i < patients.size(); i++) {
                            if (patients.get(i).getName().equals(name) && patients.get(i).getID() == id) {
                                patient_index = i;
                                patientFound = true;
                                break;
                            }
                        }

                        
                        
                        /*
                        #################################################
                        #    End of part one                            #
                        #################################################
                         */
                        
                        
                        if (patientFound == true) { // تم ايجاد المريض

                            //نختبر هل توجد خدمات ام لا
                            if (services.size() > 0) {
                                
                                // هنا فقط نعرض للمريض الخدمات المتاحة في النظام
                                System.out.println("Choose one of thsee services : -");
                                for (int i = 0; i < services.size(); i++) {
                                    // استخدمت دالة 
                                    // toLowerCase
                                    // حتى اجعل الحروف صغيرة لتكون المقارنة صحيحة في حالة ان المستخدم ادخل حرف كبير
                                    if (patients.get(patient_index).getType().toLowerCase().equals("a")) {

                                        // حتى نحسب الخصم 
                                        // نضرب  المبلغ الاجمالي في  
                                        // 25
                                        // ثم نقسم على  
                                        // 100
                                        // بعدها ينتج لنا العدد الذي يمثل النسبة 
                                        // نقوم بخصمه من المبلغ الكبير الاجمالي فنحصل على الاجمالي بعد الخصم
                                        
                                        int service_price = services.get(i).getPrice();
                                        int discount = ((25 * service_price) / 100);// هنا نحسب كم المبلغ المطلوب خصمة 
                                        
                                        int total_after_discount = service_price - discount;

                                        System.out.println(i + ")" + services.get(i).getName() + " -- " + service_price + " after discount = " + total_after_discount);
                                    } else {
                                        // هنا لا يحتاج الى تعديل لان المريض ليس من نوع الاول
                                        int service_price = services.get(i).getPrice();                                        
                                        System.out.println(i + ")" + services.get(i).getName() + " -- " + service_price);
                                    }
                                }
                                   
                                // هنا يختار الخدمة
                                System.out.print("Please select service : ");
                                int ch = 0;
                                try{
                                    ch = sc.nextInt();
                                }catch(Exception e){
                                    e.printStackTrace();
                                }
                                
                                
                                // هنا نختبر الرقم اللي ادخله المستخدم اذا كان اكبر من المصفوفة نعطيه رسالة خطأ
                                if (ch > services.size()) {
                                    System.out.println("Incorrect choose !");
                                } else {
                                    
                                    // هنا نختبر نوع المريض 
                                    if (patients.get(patient_index).getType().toLowerCase().equals("a")) {
                                        
                                        int service_price = services.get(ch).getPrice();
                                        
                                        int discount = ((25 * service_price) / 100);// هنا نحسب كم المبلغ المطلوب خصمة 
                                        int total_after_discount = service_price - discount;

                                        Service se = services.get(ch);// هنا ناخذ نسخة من الخدمة و نضعها في اوبجيكت جديد حتى نضيفه في خدمات المريض
                                        se.setPrice(total_after_discount);// هنا السعر بعد التعديل
                                        // فوق عدلنا على السعر علشان الخصم
                                        
                                        patients.get(patient_index).add_service(se);
                                        
                                    } else {
                                        
                                        // هنا ما يحتاج نعمل خصم على الخدمة فقط نضيفها على طول للخدمات المقدمة للمريض
                                        patients.get(patient_index).add_service(services.get(ch));
                                        
                                    }
                                }

                            } else {
                                System.out.println("No Services found!");
                            }

                            // هنا طباعة الفاتورة الخاصة بالمريض
                            System.out.println("******************************");
                            System.out.println("* \t\t Bill \t\t *");
                            System.out.println("******************************");

                            int total_bill = 0;// هنا اجمالي الفاتورة

                            // نعرض جميع الخدمات مع السعر و نعطيه الاجمالي
                            for (int i = 0; i < patients.get(patient_index).getServices().size(); i++) {
                                // هنا نعرض تفاصيل الخدمة وسعرها
                                System.out.println("Service Name : " + patients.get(patient_index).getServices().get(i).getName() + " --- " + patients.get(patient_index).getServices().get(i).getPrice());
                                
                                // هنا نجمع اجمالي الفاتورة
                                total_bill += patients.get(patient_index).getServices().get(i).getPrice();
                            }

                            System.out.println("*****************************");
                            System.out.println("Total Bill : " + total_bill);
                            System.out.println("*****************************");

                        } else {
                            System.out.println("Patint not found");
                        }

                        break;
                        
                    case 5:
                        // هنا طباعة معلومات الأطباء
                        // ننتبه أننا استخدمنا الدالة 
                        // toString()
                        // و الموجودة بداخل الكلاس والتي تطبع لنا جميع المعلومات الخاصة بالكلاس
                        for (int i = 0; i < doctors.size(); i++) {
                            System.out.println(doctors.get(i).toString());
                        }
                        break;
                    case 6:
                        // هنا طباعة معلومات المرضى كلهم
                        // ننتبه أننا استخدمنا الدالة 
                        // toString()
                        // و الموجودة بداخل الكلاس والتي تطبع لنا جميع المعلومات الخاصة بالكلاس
                        for (int i = 0; i < patients.size(); i++) {
                            System.out.println(patients.get(i).toString());
                        }
                        break;
                    case 7:
                        System.out.println("Exit program , Thanks");
                        System.exit(1);
                        break;
                    default:
                        System.out.println("Incorrect Entry! Try agian!");
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
