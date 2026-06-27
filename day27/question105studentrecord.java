import java.util.*;
public class question105studentrecord{

    public static void add(String[] name, String[] father, int[] age,String[] admno,long[] phone, String classn[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nmber of students you want to add");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            sc.nextLine();
            System.out.println("Enter the name of the student");
            name[i]= sc.nextLine();
            System.out.println("enter the father's name of the student");
            father[i]=sc.nextLine();
            System.out.println("enter the age of the student ");
            age[i]=sc.nextInt();
            sc.nextLine();

            System.out.println("enter the admission no of the student");
            admno[i]=sc.nextLine();

            System.out.println("enter the phone no of the student");
            phone[i]=sc.nextLong();
            sc.nextLine();

            System.out.println("enter the class name of the student");
        }
    }

    public static void search(String[] name, String[] father, int[] age,String[] admno,long[] phone, String classn[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the admission number of the student ");
        String o= sc.nextLine();
        System.out.println("\nAdmission Name Father Class Age Phone");



        boolean found=false;

        for(int i=0; i<name.length;i++){
            if(admno[i] != null && admno[i].equals(o))
            {
                System.out.print(admno[i]+" ");
                System.out.print(name[i]+" ");
                System.out.print(father[i]+" ");
                System.out.print(age[i]+" ");
                System.out.print(phone[i]+" ");
                System.out.print(classn[i]+" ");
                found=true;
                break;
            }
        }

        if(!found){
            System.out.println("invalid");
        }
    }
     public static void update(String[] name, String[] father, int[] age,String[] admno,long[] phone, String classn[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the admission number of the student ");
        String o= sc.nextLine();

        boolean found=false;
        System.out.println("\nAdmission Name Father Class Age Phone");

        for(int i=0; i<name.length;i++){

            if (admno[i]!=null && admno[i].equals(o))
            {
                found=true;

                System.out.println("\nWhat do you want to update?");
                System.out.println("1. Student Name");
                System.out.println("2. Father's Name");
                System.out.println("3. Class");
                System.out.println("4. Phone Number");
                System.out.println("5. Age");
                System.out.println("6. Admission Number");

                int choice = sc.nextInt();
                sc.nextLine();

                switch(choice)
                {
                    case 1:
                        System.out.print("Enter New Student Name: ");
                        name[i] = sc.nextLine();
                        break;

                    case 2:
                        System.out.print("Enter New Father's Name: ");
                        father[i] = sc.nextLine();
                        break;

                    case 3:
                        System.out.print("Enter New Class: ");
                        classn[i] = sc.nextLine();
                        break;

                    case 4:
                        System.out.print("Enter New Phone Number: ");
                        phone[i] = sc.nextLong();
                        break;

                    case 5:
                        System.out.print("Enter New Age: ");
                        age[i] = sc.nextInt();
                        break;

                    case 6:
                        System.out.print("Enter New Admission Number: ");
                        admno[i] = sc.nextLine();
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }

                System.out.println("Record Updated Successfully.");

                System.out.println("\nAdmission\tName\tFather\tClass\tAge\tPhone");
                System.out.print(admno[i]+" ");
                System.out.print(name[i]+" ");
                System.out.print(father[i]+" ");
                System.out.print(age[i]+" ");
                System.out.print(phone[i]+" ");
                System.out.print(classn[i]+" ");

                break;
            }
        }

        if(!found){
            System.out.println("record not found");
        }
    }
     public static void display(String[] name, String[] father, int[] age,String[] admno,long[] phone, String classn[]){
        System.out.println("\nAdmission\tName\tFather\tClass\tAge\tPhone");

        for(int i=0; i<name.length;i++){
            if (age[i]!=0)
            {
                System.out.print(admno[i]+" ");
                System.out.print(name[i]+" ");
                System.out.print(father[i]+" ");
                System.out.print(age[i]+" ");
                System.out.print(phone[i]+" ");
                System.out.print(classn[i]+" ");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String [] name = new String[500];
        String[] father= new String[500];
        int[] age = new int[500];
        String [] admno= new String[500];
        long[] phone= new long[500];
        String[] classn= new String[500];

        add(name, father, age, admno, phone, classn);

        System.out.println("\n===== MENU =====");
        System.out.println("1. Add Students");
        System.out.println("2. Display Students");
        System.out.println("3. Search Student");
        System.out.println("4. Update Student");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1 :
                add(name, father, age, admno, phone, classn);
                display(name, father, age, admno, phone, classn);
                break;

            case 2:
                display(name,father,age,admno,phone,classn);
                break;

            case 3:
                search(name, father, age,admno,phone, classn);
                break;

            case 4:
                update(name, father, age,admno,phone, classn);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}