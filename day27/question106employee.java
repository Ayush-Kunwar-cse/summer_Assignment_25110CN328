import java.util.*;

public class question106employee {

    public static void addnew(String[] empid,String[] empname,
            String[] designation,double[] salary,double[] monthlypf){

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<empid.length;i++)
        {
            if(salary[i]==0)
            {
                System.out.println("enter employee id");
                empid[i]=sc.nextLine();

                System.out.println("enter employee name");
                empname[i]=sc.nextLine();

                System.out.println("enter designation");
                designation[i]=sc.nextLine();

                System.out.println("enter salary");
                salary[i]=sc.nextDouble();

                monthlypf[i]=salary[i]*0.12;

                System.out.println("employee added successfully");
                break;
            }
        }
    }

    public static void add(String[] empid,String[] empname,
            String[] designation,double[] salary,double[] monthlypf){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number of employees whose data is to be added");
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            sc.nextLine();

            System.out.println("enter employee id");
            empid[i]=sc.nextLine();

            System.out.println("enter employee name");
            empname[i]=sc.nextLine();

            System.out.println("enter designation");
            designation[i]=sc.nextLine();

            System.out.println("enter salary");
            salary[i]=sc.nextDouble();

            monthlypf[i]=salary[i]*0.12;
        }
    }

    public static void display(String[] empid,String[] empname,
            String[] designation,double[] salary,double[] monthlypf){

        System.out.println("employee id employee name designation salary monthly pf");

        for(int i=0;i<empid.length;i++)
        {
            if(salary[i]!=0)
            {
                System.out.print(empid[i]+" ");
                System.out.print(empname[i]+" ");
                System.out.print(designation[i]+" ");
                System.out.print(salary[i]+" ");
                System.out.print(monthlypf[i]+" ");
                System.out.println();
            }
        }
    }
        public static void search(String[] empid,String[] empname,
            String[] designation,double[] salary,double[] monthlypf){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter employee id");
        String id=sc.nextLine();

        int flag=0;

        System.out.println("employee id employee name designation salary monthly pf");

        for(int i=0;i<empid.length;i++)
        {
            if(empid[i]!=null && empid[i].equals(id))
            {
                System.out.print(empid[i]+" ");
                System.out.print(empname[i]+" ");
                System.out.print(designation[i]+" ");
                System.out.print(salary[i]+" ");
                System.out.print(monthlypf[i]+" ");
                System.out.println();

                flag=1;
                break;
            }
        }

        if(flag==0)
        {
            System.out.println("employee not found");
        }
    }

    public static void update(String[] empid,String[] empname,
            String[] designation,double[] salary,double[] monthlypf){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter employee id");
        String id=sc.nextLine();

        int flag=0;

        for(int i=0;i<empid.length;i++)
        {
            if(empid[i]!=null && empid[i].equals(id))
            {
                flag=1;

                System.out.println("1.employee name");
                System.out.println("2.designation");
                System.out.println("3.salary");
                System.out.println("4.employee id");

                int choice=sc.nextInt();
                sc.nextLine();

                switch(choice)
                {
                    case 1:
                        System.out.println("enter new employee name");
                        empname[i]=sc.nextLine();
                        break;

                    case 2:
                        System.out.println("enter new designation");
                        designation[i]=sc.nextLine();
                        break;

                    case 3:
                        System.out.println("enter new salary");
                        salary[i]=sc.nextDouble();
                        monthlypf[i]=salary[i]*0.12;
                        break;

                    case 4:
                        System.out.println("enter new employee id");
                        empid[i]=sc.nextLine();
                        break;

                    default:
                        System.out.println("invalid choice");
                }

                System.out.println("record updated successfully");
                break;
            }
        }

        if(flag==0)
        {
            System.out.println("employee not found");
        }
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String[] empid=new String[500];
        String[] empname=new String[500];
        String[] designation=new String[500];
        double[] salary=new double[500];
        double[] monthlypf=new double[500];

        add(empid,empname,designation,salary,monthlypf);

        System.out.println("\n===== menu =====");
        System.out.println("1.add employee");
        System.out.println("2.display employees");
        System.out.println("3.search employee");
        System.out.println("4.update employee");

        System.out.println("enter choice");
        int choice=sc.nextInt();

        switch(choice)
        {
            case 1:
                sc.nextLine();
                addnew(empid,empname,designation,salary,monthlypf);
                display(empid,empname,designation,salary,monthlypf);
                break;

            case 2:
                display(empid,empname,designation,salary,monthlypf);
                break;

            case 3:
                sc.nextLine();
                search(empid,empname,designation,salary,monthlypf);
                break;

            case 4:
                sc.nextLine();
                update(empid,empname,designation,salary,monthlypf);
                break;

            default:
                System.out.println("invalid choice");
        }
    }
}