import java.util.*;

public class question109library {

    public static void addnew(String[] bookid, String[] bookname,
        String[] author, String[] publisher, int[] quantity){

    Scanner sc = new Scanner(System.in);

    for(int i=0;i<bookid.length;i++)
    {
        if(quantity[i]==0)
        {

            System.out.println("Enter Book ID");
            bookid[i]=sc.nextLine();

            System.out.println("Enter Book Name");
            bookname[i]=sc.nextLine();

            System.out.println("Enter Author Name");
            author[i]=sc.nextLine();

            System.out.println("Enter Publisher Name");
            publisher[i]=sc.nextLine();

            System.out.println("Enter Quantity");
            quantity[i]=sc.nextInt();

            System.out.println("Book Added Successfully");
            break;
        }
    }
}
    public static void add(String[] bookid, String[] bookname,
            String[] author, String[] publisher, int[] quantity) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of books you want to add");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            sc.nextLine();

            System.out.println("Enter Book ID");
            bookid[i] = sc.nextLine();

            System.out.println("Enter Book Name");
            bookname[i] = sc.nextLine();

            System.out.println("Enter Author Name");
            author[i] = sc.nextLine();

            System.out.println("Enter Publisher Name");
            publisher[i] = sc.nextLine();

            System.out.println("Enter Quantity");
            quantity[i] = sc.nextInt();
        }
    }

    public static void display(String[] bookid, String[] bookname,
            String[] author, String[] publisher, int[] quantity) {

        System.out.println("BookID  bookName  author  publisher  Quantity");

        for (int i = 0; i < bookid.length; i++) {

            if (quantity[i] != 0) {

                System.out.print(bookid[i] + " ");
                System.out.print(bookname[i] + " ");
                System.out.print(author[i] + " ");
                System.out.print(publisher[i] + " ");
                System.out.print(quantity[i] + " ");
                System.out.println();
            }
        }
    }

    public static void search(String[] bookid, String[] bookname,
            String[] author, String[] publisher, int[] quantity) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book ID");
        String id = sc.nextLine();

        boolean found = false;
        System.out.println("BookID  bookName  author  publisher  Quantity");

        for (int i = 0; i < bookid.length; i++) {

            if (bookid[i] != null && bookid[i].equals(id)) {

                System.out.print(bookid[i] + " ");
                System.out.print(bookname[i] + " ");
                System.out.print(author[i] + " ");
                System.out.print(publisher[i] + " ");
                System.out.print(quantity[i] + " ");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book Not Found");
        }
    }

    public static void update(String[] bookid, String[] bookname,
            String[] author, String[] publisher, int[] quantity) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book ID");
        String id = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < bookid.length; i++) {

            if (bookid[i] != null && bookid[i].equals(id)) {

                found = true;

                System.out.println("1.Book Name");
                System.out.println("2.Author");
                System.out.println("3.Publisher");
                System.out.println("4.Quantity");
                System.out.println("5.Book ID");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        System.out.println("Enter New Book Name");
                        bookname[i] = sc.nextLine();
                        break;

                    case 2:
                        System.out.println("Enter New Author");
                        author[i] = sc.nextLine();
                        break;

                    case 3:
                        System.out.println("Enter New Publisher");
                        publisher[i] = sc.nextLine();
                        break;

                    case 4:
                        System.out.println("Enter New Quantity");
                        quantity[i] = sc.nextInt();
                        break;

                    case 5:
                        sc.nextLine();
                        System.out.println("Enter New Book ID");
                        bookid[i] = sc.nextLine();
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }

                System.out.println("Record Updated Successfully");
                break;
            }
        }

        if (!found) {
            System.out.println("Book Not Found");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] bookid = new String[500];
        String[] bookname = new String[500];
        String[] author = new String[500];
        String[] publisher = new String[500];
        int[] quantity = new int[500];

        add(bookid, bookname, author, publisher, quantity);

        int choice=0;
        while(choice!=5){



        System.out.println("\n===== MENU =====");
        System.out.println("1. Add books");
        System.out.println("2. Display books");
        System.out.println("3. Search books");
        System.out.println("4. Update book");
        System.out.println("5.Exit");

        System.out.print("Enter Choice ");
        choice = sc.nextInt();

        switch (choice) {

            case 1:
                addnew(bookid, bookname, author, publisher, quantity);
                display(bookid, bookname, author, publisher, quantity);
                break;

            case 2:
                display(bookid, bookname, author, publisher, quantity);
                break;

            case 3:
                search(bookid, bookname, author, publisher, quantity);
                break;

            case 4:
                sc.nextLine();
                update(bookid, bookname, author, publisher, quantity);
                break;

            default:
                System.out.println("invalid choice");
        }
    }
}
}
