import java.util.*;

public class question117studentrecord {

    static int count = 0;

    public static void add(String[] name, String[] father, int[] age, String[] admno, long[] phone, String classn[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students you want to add");
        int n = sc.nextInt();
        sc.nextLine();

        int r = count;

        for (int i = count; i < n + r; i++) {

            System.out.println("Enter details of student " + (i + 1));

            System.out.println("Enter the name of the student");
            name[i] = sc.nextLine();

            System.out.println("Enter the father's name of the student");
            father[i] = sc.nextLine();

            System.out.println("Enter the age of the student");
            age[i] = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the admission number of the student");
            admno[i] = sc.nextLine();

            System.out.println("Enter the phone number of the student");
            phone[i] = sc.nextLong();
            sc.nextLine();

            System.out.println("Enter the class of the student");
            classn[i] = sc.nextLine();

            count++;
        }
    }

    public static void display(String[] name, String[] father, int[] age, String[] admno, long[] phone, String classn[]) {

         System.out.printf("%-10s %-14s %-14s %-10s %-4s %-13s%n",
            "Admission", "Name", "Father", "Class","Age", "Phone");

        for (int i = 0; i < count; i++) {

            if (admno[i] != null) {
                 System.out.printf("%-10s %-14s %-14s %-10s %-4d %-13d%n",
        admno[i],
        name[i],
        father[i],
        classn[i],
        age[i],
        phone[i]);
            }
        }
    }

    public static void search(String[] name, String[] father, int[] age, String[] admno, long[] phone, String classn[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the admission number of the student");
        String o = sc.nextLine();

        boolean found = false;

         System.out.printf("%-10s %-14s %-14s %-10s %-4s %-13s%n",
            "Admission", "Name", "Father", "Class","Age", "Phone");


        for (int i = 0; i < count; i++) {

            if (admno[i] != null && admno[i].equals(o)) {

                System.out.printf("%-10s %-14s %-14s %-10s %-4d %-13d%n",
        admno[i],
        name[i],
        father[i],
        classn[i],
        age[i],
        phone[i]);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Record not found");
        }
    }

    public static void update(String[] name, String[] father, int[] age, String[] admno, long[] phone, String classn[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the admission number of the student");
        String o = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (admno[i] != null && admno[i].equals(o)) {

                found = true;

                System.out.println("\nWhat do you want to update?");
                System.out.println("1. Student Name");
                System.out.println("2. Father's Name");
                System.out.println("3. Class");
                System.out.println("4. Phone Number");
                System.out.println("5. Age");
                System.out.println("6. Admission Number");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        System.out.println("Enter new student name");
                        name[i] = sc.nextLine();
                        break;

                    case 2:
                        System.out.println("Enter new father's name");
                        father[i] = sc.nextLine();
                        break;

                    case 3:
                        System.out.println("Enter new class");
                        classn[i] = sc.nextLine();
                        break;

                    case 4:
                        System.out.println("Enter new phone number");
                        phone[i] = sc.nextLong();
                        break;

                    case 5:
                        System.out.println("Enter new age");
                        age[i] = sc.nextInt();
                        break;

                    case 6:
                        System.out.println("Enter new admission number");
                        admno[i] = sc.nextLine();
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

                System.out.println("\nRecord Updated Successfully\n");

            System.out.printf("%-10s %-14s %-14s %-10s %-4s %-13s%n",
            "Admission", "Name", "Father", "Class", "Age", "Phone");
                System.out.printf("%-10s %-14s %-14s %-10s %-4d %-13d%n",
        admno[i],
        name[i],
        father[i],
        classn[i],
        age[i],
        phone[i]);
                break;
            }
        }

        if (!found) {
            System.out.println("Record not found");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] name = new String[500];
        String[] father = new String[500];
        int[] age = new int[500];
        String[] admno = new String[500];
        long[] phone = new long[500];
        String[] classn = new String[500];

        int ch = 0;

        while (ch != 5) {

            System.out.println("\nEnter the choice");
            System.out.println("1. Add Students");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Exit");

            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    add(name, father, age, admno, phone, classn);
                    System.out.println("Students added successfully\n");
                    break;

                case 2:
                    display(name, father, age, admno, phone, classn);
                    break;

                case 3:
                    search(name, father, age, admno, phone, classn);
                    break;

                case 4:
                    update(name, father, age, admno, phone, classn);
                    break;

                case 5:
                    System.out.println("Program exited");
                    break;

                default:
                    System.out.println("Enter a valid choice");
            }
        }
    }
}