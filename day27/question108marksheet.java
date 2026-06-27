import java.util.*;

public class question108marksheet {

    public static void addnew(String[] rollno,String[] name,
            int[] physics,int[] chemistry,int[] maths,
            int[] total,double[] percentage,String[] grade){

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<rollno.length;i++)
        {
            if(total[i]==0)
            {
                System.out.println("enter roll number");
                rollno[i]=sc.nextLine();

                System.out.println("enter student name");
                name[i]=sc.nextLine();

                System.out.println("enter physics marks");
                physics[i]=sc.nextInt();

                System.out.println("enter chemistry marks");
                chemistry[i]=sc.nextInt();

                System.out.println("enter maths marks");
                maths[i]=sc.nextInt();

                total[i]=physics[i]+chemistry[i]+maths[i];
                percentage[i]=total[i]/3.0;

                if(percentage[i]>=90)
                    grade[i]="A+";
                else if(percentage[i]>=80)
                    grade[i]="A";
                else if(percentage[i]>=70)
                    grade[i]="B";
                else if(percentage[i]>=60)
                    grade[i]="C";
                else if(percentage[i]>=50)
                    grade[i]="D";
                else
                    grade[i]="F";

                System.out.println("record added successfully");
                break;
            }
        }
    }

    public static void add(String[] rollno,String[] name,
            int[] physics,int[] chemistry,int[] maths,
            int[] total,double[] percentage,String[] grade){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number of students marksheet 2to be added");
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            sc.nextLine();

            System.out.println("enter roll number");
            rollno[i]=sc.nextLine();

            System.out.println("enter student name");
            name[i]=sc.nextLine();

            System.out.println("enter physics marks");
            physics[i]=sc.nextInt();

            System.out.println("enter chemistry marks");
            chemistry[i]=sc.nextInt();

            System.out.println("enter maths marks");
            maths[i]=sc.nextInt();

            total[i]=physics[i]+chemistry[i]+maths[i];
            percentage[i]=total[i]/3.0;

            if(percentage[i]>=90)
                grade[i]="A+";
            else if(percentage[i]>=80)
                grade[i]="A";
            else if(percentage[i]>=70)
                grade[i]="B";
            else if(percentage[i]>=60)
                grade[i]="C";
            else if(percentage[i]>=50)
                grade[i]="D";
            else
                grade[i]="F";
        }
    }

    public static void display(String[] rollno,String[] name,
            int[] physics,int[] chemistry,int[] maths,
            int[] total,double[] percentage,String[] grade){

        System.out.println("rollno name physics chemistry maths total percentage grade");

        for(int i=0;i<rollno.length;i++)
        {
            if(total[i]!=0)
            {
                System.out.print(rollno[i]+" ");
                System.out.print(name[i]+" ");
                System.out.print(physics[i]+" ");
                System.out.print(chemistry[i]+" ");
                System.out.print(maths[i]+" ");
                System.out.print(total[i]+" ");
                System.out.print(percentage[i]+" ");
                System.out.print(grade[i]+" ");
                System.out.println();
            }
        }
    }
        public static void search(String[] rollno,String[] name,
            int[] physics,int[] chemistry,int[] maths,
            int[] total,double[] percentage,String[] grade){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter roll number");
        String roll=sc.nextLine();

        int flag=0;

        System.out.println("rollno name physics chemistry maths total percentage grade");

        for(int i=0;i<rollno.length;i++)
        {
            if(rollno[i]!=null && rollno[i].equals(roll))
            {
                System.out.print(rollno[i]+" ");
                System.out.print(name[i]+" ");
                System.out.print(physics[i]+" ");
                System.out.print(chemistry[i]+" ");
                System.out.print(maths[i]+" ");
                System.out.print(total[i]+" ");
                System.out.print(percentage[i]+" ");
                System.out.print(grade[i]+" ");
                System.out.println();

                flag=1;
                break;
            }
        }

        if(flag==0)
        {
            System.out.println("student not found");
        }
    }

    public static void update(String[] rollno,String[] name,
            int[] physics,int[] chemistry,int[] maths,
            int[] total,double[] percentage,String[] grade){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter roll number");
        String roll=sc.nextLine();

        int flag=0;

        for(int i=0;i<rollno.length;i++)
        {
            if(rollno[i]!=null && rollno[i].equals(roll))
            {
                flag=1;

                System.out.println("1.student name");
                System.out.println("2.physics marks");
                System.out.println("3.chemistry marks");
                System.out.println("4.maths marks");
                System.out.println("5.roll number");

                int choice=sc.nextInt();
                sc.nextLine();

                switch(choice)
                {
                    case 1:
                        System.out.println("enter new student name");
                        name[i]=sc.nextLine();
                        break;

                    case 2:
                        System.out.println("enter new physics marks");
                        physics[i]=sc.nextInt();
                        break;

                    case 3:
                        System.out.println("enter new chemistry marks");
                        chemistry[i]=sc.nextInt();
                        break;

                    case 4:
                        System.out.println("enter new maths marks");
                        maths[i]=sc.nextInt();
                        break;

                    case 5:
                        System.out.println("enter new roll number");
                        rollno[i]=sc.nextLine();
                        break;

                    default:
                        System.out.println("invalid choice");
                }

                total[i]=physics[i]+chemistry[i]+maths[i];
                percentage[i]=total[i]/3.0;

                if(percentage[i]>=90)
                    grade[i]="A+";
                else if(percentage[i]>=80)
                    grade[i]="A";
                else if(percentage[i]>=70)
                    grade[i]="B";
                else if(percentage[i]>=60)
                    grade[i]="C";
                else if(percentage[i]>=50)
                    grade[i]="D";
                else
                    grade[i]="F";

                System.out.println("record updated successfully");
                break;
            }
        }

        if(flag==0)
        {
            System.out.println("student not found");
        }
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String[] rollno=new String[500];
        String[] name=new String[500];
        int[] physics=new int[500];
        int[] chemistry=new int[500];
        int[] maths=new int[500];
        int[] total=new int[500];
        double[] percentage=new double[500];
        String[] grade=new String[500];

        add(rollno,name,physics,chemistry,maths,total,percentage,grade);

        System.out.println("\n===== menu =====");
        System.out.println("1.add student");
        System.out.println("2.display marksheet");
        System.out.println("3.search student");
        System.out.println("4.update student");

        System.out.println("enter choice");
        int choice=sc.nextInt();

        switch(choice)
        {
            case 1:
                sc.nextLine();
                addnew(rollno,name,physics,chemistry,maths,total,percentage,grade);
                display(rollno,name,physics,chemistry,maths,total,percentage,grade);
                break;

            case 2:
                display(rollno,name,physics,chemistry,maths,total,percentage,grade);
                break;

            case 3:
                sc.nextLine();
                search(rollno,name,physics,chemistry,maths,total,percentage,grade);
                break;

            case 4:
                update(rollno,name,physics,chemistry,maths,total,percentage,grade);
                display(rollno, name, physics, chemistry, maths, total, percentage, grade);
                break;

            default:
                System.out.println("invalid choice");
        }
    }
}
