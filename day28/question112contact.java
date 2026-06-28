import java.util.*;

public class question112contact {

    public static void addnew(String[] contactid,String[] name,
            long[] phone,String[] email,String[] address){

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<contactid.length;i++)
        {
            if(phone[i]==0)
            {
                System.out.println("enter contact id");
                contactid[i]=sc.nextLine();

                System.out.println("enter name");
                name[i]=sc.nextLine();

                System.out.println("enter phone number");
                phone[i]=sc.nextLong();
                sc.nextLine();

                System.out.println("enter email");
                email[i]=sc.nextLine();

                System.out.println("enter address");
                address[i]=sc.nextLine();

                System.out.println("contact added successfully");
                break;
            }
        }
    }

    public static void add(String[] contactid,String[] name,
            long[] phone,String[] email,String[] address){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number of contacts");
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            sc.nextLine();

            System.out.println("enter contact id");
            contactid[i]=sc.nextLine();

            System.out.println("enter name");
            name[i]=sc.nextLine();

            System.out.println("enter phone number");
            phone[i]=sc.nextLong();
            sc.nextLine();

            System.out.println("enter email");
            email[i]=sc.nextLine();

            System.out.println("enter address");
            address[i]=sc.nextLine();
        }
    }

    public static void display(String[] contactid,String[] name,
            long[] phone,String[] email,String[] address){

        System.out.println("contact id name phone email address");

        for(int i=0;i<contactid.length;i++)
        {
            if(phone[i]!=0)
            {
                System.out.print(contactid[i]+" ");
                System.out.print(name[i]+" ");
                System.out.print(phone[i]+" ");
                System.out.print(email[i]+" ");
                System.out.print(address[i]+" ");
                System.out.println();
            }
        }
    }
        public static void search(String[] contactid,String[] name,
            long[] phone,String[] email,String[] address){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter contact id");
        String id=sc.nextLine();

        int flag=0;

        System.out.println("contact id name phone email address");

        for(int i=0;i<contactid.length;i++)
        {
            if(contactid[i]!=null && contactid[i].equals(id))
            {
                System.out.print(contactid[i]+" ");
                System.out.print(name[i]+" ");
                System.out.print(phone[i]+" ");
                System.out.print(email[i]+" ");
                System.out.print(address[i]+" ");
                System.out.println();

                flag=1;
                break;
            }
        }

        if(flag==0)
        {
            System.out.println("contact not found");
        }
    }

    public static void update(String[] contactid,String[] name,
            long[] phone,String[] email,String[] address){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter contact id");
        String id=sc.nextLine();

        int flag=0;

        for(int i=0;i<contactid.length;i++)
        {
            if(contactid[i]!=null && contactid[i].equals(id))
            {
                flag=1;

                System.out.println("1.name");
                System.out.println("2.phone");
                System.out.println("3.email");
                System.out.println("4.address");
                System.out.println("5.contact id");

                int choice=sc.nextInt();
                sc.nextLine();

                switch(choice)
                {
                    case 1:
                        System.out.println("enter new name");
                        name[i]=sc.nextLine();
                        break;

                    case 2:
                        System.out.println("enter new phone number");
                        phone[i]=sc.nextLong();
                        break;

                    case 3:
                        sc.nextLine();
                        System.out.println("enter new email");
                        email[i]=sc.nextLine();
                        break;

                    case 4:
                        System.out.println("enter new address");
                        address[i]=sc.nextLine();
                        break;

                    case 5:
                        System.out.println("enter new contact id");
                        contactid[i]=sc.nextLine();
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
            System.out.println("contact not found");
        }
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String[] contactid=new String[500];
        String[] name=new String[500];
        long[] phone=new long[500];
        String[] email=new String[500];
        String[] address=new String[500];

        add(contactid,name,phone,email,address);

        System.out.println("\n===== menu =====");
        System.out.println("1.add contact");
        System.out.println("2.display contact");
        System.out.println("3.search contact");
        System.out.println("4.update contact");

        System.out.println("enter choice");
        int choice=sc.nextInt();

        switch(choice)
        {
            case 1:
                addnew(contactid,name,phone,email,address);
                display(contactid,name,phone,email,address);
                break;

            case 2:
                display(contactid,name,phone,email,address);
                break;

            case 3:
                sc.nextLine();
                search(contactid,name,phone,email,address);
                break;

            case 4:
                update(contactid,name,phone,email,address);
                display(contactid,name,phone,email,address);
                break;

            default:
                System.out.println("invalid choice");
        }
    }
}