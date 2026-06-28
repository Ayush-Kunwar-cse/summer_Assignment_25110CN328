import java.util.*;

public class question110bank {

    public static void addnew(String[] accno,String[] name,
            String[] acctype,double[] balance){

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<accno.length;i++)
        {
            if(balance[i]==0)
            {
                System.out.println("enter account number");
                accno[i]=sc.nextLine();

                System.out.println("enter account holder name");
                name[i]=sc.nextLine();

                System.out.println("enter account type");
                acctype[i]=sc.nextLine();

                System.out.println("enter balance");
                balance[i]=sc.nextDouble();

                System.out.println("account added successfully");
                break;
            }
        }
    }

    public static void add(String[] accno,String[] name,
            String[] acctype,double[] balance){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number of accounts");
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            sc.nextLine();

            System.out.println("enter account number");
            accno[i]=sc.nextLine();

            System.out.println("enter account holder name");
            name[i]=sc.nextLine();

            System.out.println("enter account type");
            acctype[i]=sc.nextLine();

            System.out.println("enter balance");
            balance[i]=sc.nextDouble();
        }
    }

    public static void display(String[] accno,String[] name,
            String[] acctype,double[] balance){

        System.out.println("account number account holder account type balance\n");

        for(int i=0;i<accno.length;i++)
        {
            if(balance[i]!=0)
            {
                System.out.print(accno[i]+" ");
                System.out.print(name[i]+" ");
                System.out.print(acctype[i]+" ");
                System.out.print(balance[i]+" ");
                System.out.println();
            }
        }
    }
        public static void search(String[] accno,String[] name,
            String[] acctype,double[] balance){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter account number");
        String acc=sc.nextLine();

        int flag=0;

        System.out.println("account number account holder account type balance");

        for(int i=0;i<accno.length;i++)
        {
            if(accno[i]!=null && accno[i].equals(acc))
            {
                System.out.print(accno[i]+" ");
                System.out.print(name[i]+" ");
                System.out.print(acctype[i]+" ");
                System.out.print(balance[i]+" ");
                System.out.println();

                flag=1;
                break;
            }
        }

        if(flag==0)
        {
            System.out.println("account not found");
        }
    }

    public static void update(String[] accno,String[] name,
            String[] acctype,double[] balance){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter account number");
        String acc=sc.nextLine();

        int flag=0;

        for(int i=0;i<accno.length;i++)
        {
            if(accno[i]!=null && accno[i].equals(acc))
            {
                flag=1;

                System.out.println("1.account holder name");
                System.out.println("2.account type");
                System.out.println("3.balance");
                System.out.println("4.account number");

                int choice=sc.nextInt();
                sc.nextLine();

                switch(choice)
                {
                    case 1:
                        System.out.println("enter new account holder name");
                        name[i]=sc.nextLine();
                        break;

                    case 2:
                        System.out.println("enter new account type");
                        acctype[i]=sc.nextLine();
                        break;

                    case 3:
                        System.out.println("enter new balance");
                        balance[i]=sc.nextDouble();
                        break;

                    case 4:
                        System.out.println("enter new account number");
                        accno[i]=sc.nextLine();
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
            System.out.println("account not found");
        }
    }

    public static void deposit(String[] accno,String[] name,
            String[] acctype,double[] balance){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter account number");
        String acc=sc.nextLine();

        int flag=0;

        for(int i=0;i<accno.length;i++)
        {
            if(accno[i]!=null && accno[i].equals(acc))
            {
                flag=1;

                System.out.println("enter amount to deposit");
                double amount=sc.nextDouble();

                balance[i]=balance[i]+amount;

                System.out.println("amount deposited successfully");
                break;
            }
        }

        if(flag==0)
        {
            System.out.println("account not found");
        }
    }
        public static void withdraw(String[] accno,String[] name,
            String[] acctype,double[] balance){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter account number");
        String acc=sc.nextLine();

        int flag=0;

        for(int i=0;i<accno.length;i++)
        {
            if(accno[i]!=null && accno[i].equals(acc))
            {
                flag=1;

                System.out.println("enter amount to withdraw");
                double amount=sc.nextDouble();

                if(amount<=balance[i])
                {
                    balance[i]=balance[i]-amount;
                    System.out.println("amount withdrawn successfully");
                }
                else
                {
                    System.out.println("insufficient balance");
                }

                break;
            }
        }

        if(flag==0)
        {
            System.out.println("account not found");
        }
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String[] accno=new String[500];
        String[] name=new String[500];
        String[] acctype=new String[500];
        double[] balance=new double[500];

        add(accno,name,acctype,balance);
        int choice=0;
        while(choice!=7){

        System.out.println("\n===== menu =====");
        System.out.println("1.add account");
        System.out.println("2.display account");
        System.out.println("3.search account");
        System.out.println("4.update account");
        System.out.println("5.deposit");
        System.out.println("6.withdraw");
        System.out.println("7.exit");

        System.out.println("enter choice");
        choice=sc.nextInt();

        switch(choice)
        {
            case 1:
                sc.nextLine();
                addnew(accno,name,acctype,balance);
                display(accno,name,acctype,balance);
                break;

            case 2:
                display(accno,name,acctype,balance);
                break;

            case 3:
                sc.nextLine();
                search(accno,name,acctype,balance);
                break;

            case 4:
                sc.nextLine();
                update(accno,name,acctype,balance);
                display(accno,name,acctype,balance);
                break;

            case 5:
                sc.nextLine();
                deposit(accno,name,acctype,balance);
                display(accno,name,acctype,balance);
                break;

            case 6:
                sc.nextLine();
                withdraw(accno,name,acctype,balance);
                display(accno,name,acctype,balance);
                break;

            default:
                System.out.println("invalid choice");
        }
        }
    }
}
