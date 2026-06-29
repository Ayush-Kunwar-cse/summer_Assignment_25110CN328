import java.util.*;

public class question116{

    public static void addnew(String[] productid,String[] productname,
            int[] quantity,double[] price){

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<productid.length;i++)
        {
            if(quantity[i]==0)
            {
                System.out.println("enter product id");
                productid[i]=sc.nextLine();

                System.out.println("enter product name");
                productname[i]=sc.nextLine();

                System.out.println("enter quantity");
                quantity[i]=sc.nextInt();

                System.out.println("enter price");
                price[i]=sc.nextDouble();

                System.out.println("product added successfully");
                break;
            }
        }
    }

    public static void add(String[] productid,String[] productname,
            int[] quantity,double[] price){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number of products");
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            sc.nextLine();

            System.out.println("enter product id");
            productid[i]=sc.nextLine();

            System.out.println("enter product name");
            productname[i]=sc.nextLine();

            System.out.println("enter quantity");
            quantity[i]=sc.nextInt();

            System.out.println("enter price");
            price[i]=sc.nextDouble();
        }
    }

    public static void display(String[] productid,String[] productname,
            int[] quantity,double[] price){

        System.out.println("product id product name quantity price");

        for(int i=0;i<productid.length;i++)
        {
            if(quantity[i]!=0)
            {
                System.out.print(productid[i]+" ");
                System.out.print(productname[i]+" ");
                System.out.print(quantity[i]+" ");
                System.out.print(price[i]+" ");
                System.out.println();
            }
        }
    }
        public static void search(String[] productid,String[] productname,
            int[] quantity,double[] price){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter product id");
        String id=sc.nextLine();

        int flag=0;

        System.out.println("product id product name quantity price");

        for(int i=0;i<productid.length;i++)
        {
            if(productid[i]!=null && productid[i].equals(id))
            {
                System.out.print(productid[i]+" ");
                System.out.print(productname[i]+" ");
                System.out.print(quantity[i]+" ");
                System.out.print(price[i]+" ");
                System.out.println();

                flag=1;
                break;
            }
        }

        if(flag==0)
        {
            System.out.println("product not found");
        }
    }

    public static void update(String[] productid,String[] productname,
            int[] quantity,double[] price){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter product id");
        String id=sc.nextLine();

        int flag=0;

        for(int i=0;i<productid.length;i++)
        {
            if(productid[i]!=null && productid[i].equals(id))
            {
                flag=1;

                System.out.println("1.product name");
                System.out.println("2.quantity");
                System.out.println("3.price");
                System.out.println("4.product id");

                int choice=sc.nextInt();
                sc.nextLine();

                switch(choice)
                {
                    case 1:
                        System.out.println("enter new product name");
                        productname[i]=sc.nextLine();
                        break;

                    case 2:
                        System.out.println("enter new quantity");
                        quantity[i]=sc.nextInt();
                        break;

                    case 3:
                        System.out.println("enter new price");
                        price[i]=sc.nextDouble();
                        break;

                    case 4:
                        System.out.println("enter new product id");
                        productid[i]=sc.nextLine();
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
            System.out.println("product not found");
        }
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String[] productid=new String[500];
        String[] productname=new String[500];
        int[] quantity=new int[500];
        double[] price=new double[500];

        add(productid,productname,quantity,price);

        System.out.println("\n===== menu =====");
        System.out.println("1.add product");
        System.out.println("2.display product");
        System.out.println("3.search product");
        System.out.println("4.update product");

        System.out.println("enter choice");
        int choice=sc.nextInt();

        switch(choice)
        {
            case 1:
                sc.nextLine();
                addnew(productid,productname,quantity,price);
                display(productid,productname,quantity,price);
                break;

            case 2:
                display(productid,productname,quantity,price);
                break;

            case 3:
                sc.nextLine();
                search(productid,productname,quantity,price);
                break;

            case 4:
                sc.nextLine();
                update(productid,productname,quantity,price);
                display(productid,productname,quantity,price);
                break;

            default:
                System.out.println("invalid choice");
        }
    }
}