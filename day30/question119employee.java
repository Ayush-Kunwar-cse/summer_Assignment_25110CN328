import java.util.*;

public class question119employee {

    static int count = 0;

    public static void add(String[] empid, String[] empname,
            String[] designation, double[] salary, double[] monthlypf) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees whose data is to be added");
        int n = sc.nextInt();
        sc.nextLine();

        int r = count;

        for (int i = count; i < n + r; i++) {

            System.out.println("Enter details of employee " + (i + 1));

            System.out.println("Enter employee id");
            empid[i] = sc.nextLine();

            System.out.println("Enter employee name");
            empname[i] = sc.nextLine();

            System.out.println("Enter designation");
            designation[i] = sc.nextLine();

            System.out.println("Enter salary");
            salary[i] = sc.nextDouble();
            sc.nextLine();

            monthlypf[i] = salary[i] * 0.12;

            count++;
        }
    }

    public static void display(String[] empid, String[] empname,
            String[] designation, double[] salary, double[] monthlypf) {

         System.out.printf("%-10s %-15s %-15s %-8s %-6s%n",
                 "Employee ID",
                 "Employee Name",
                 "Designation",
                 "Salary",
                 "PF");
        for (int i = 0; i < count; i++) {

            if (salary[i] != 0) {

                System.out.printf("%-10s %-15s %-15s %-8.2f %-6.2f%n",
                 empid[i],
                 empname[i],
                 designation[i],
                 salary[i],
                 monthlypf[i]);
            }
        }
    }

    public static void search(String[] empid, String[] empname,
            String[] designation, double[] salary, double[] monthlypf) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee id");
        String id = sc.nextLine();

        boolean found = false;

         System.out.printf("%-10s %-15s %-15s %-8s %-6s%n",
                 "Employee ID",
                 "Employee Name",
                 "Designation",
                 "Salary",
                 "PF");
        for (int i = 0; i < count; i++) {

            if (empid[i] != null && empid[i].equals(id)) {

                System.out.printf("%-10s %-15s %-15s %-8.2f %-6.2f%n",
                 empid[i],
                 empname[i],
                 designation[i],
                 salary[i],
                 monthlypf[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found");
        }
    }

    public static void update(String[] empid, String[] empname,
            String[] designation, double[] salary, double[] monthlypf) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee id");
        String id = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (empid[i] != null && empid[i].equals(id)) {

                found = true;

                System.out.println("\nWhat do you want to update?");
                System.out.println("1. Employee Name");
                System.out.println("2. Designation");
                System.out.println("3. Salary");
                System.out.println("4. Employee ID");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        System.out.println("Enter new employee name");
                        empname[i] = sc.nextLine();
                        break;

                    case 2:
                        System.out.println("Enter new designation");
                        designation[i] = sc.nextLine();
                        break;

                    case 3:
                        System.out.println("Enter new salary");
                        salary[i] = sc.nextDouble();
                        monthlypf[i] = salary[i] * 0.12;
                        break;

                    case 4:
                        System.out.println("Enter new employee id");
                        empid[i] = sc.nextLine();
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

                System.out.println("\nRecord Updated Successfully\n");

                System.out.printf("%-10s %-15s %-15s %-8s %-6s%n",
                 "Employee ID",
                 "Employee Name",
                 "Designation",
                 "Salary",
                 "PF");
                 System.out.printf("%-10s %-15s %-15s %-8.2f %-6.2f%n",
                 empid[i],
                 empname[i],
                 designation[i],
                 salary[i],
                 monthlypf[i]);
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] empid = new String[500];
        String[] empname = new String[500];
        String[] designation = new String[500];
        double[] salary = new double[500];
        double[] monthlypf = new double[500];

        int ch = 0;

        while (ch != 5) {

            System.out.println("Enter the choice");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Exit\n");

            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    add(empid, empname, designation, salary, monthlypf);
                    System.out.println("Employees added successfully\n");
                    break;

                case 2:
                    display(empid, empname, designation, salary, monthlypf);
                    break;

                case 3:
                    search(empid, empname, designation, salary, monthlypf);
                    break;

                case 4:
                    update(empid, empname, designation, salary, monthlypf);
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Enter a valid choice\n");
            }
        }
    }
}