import java.util.*;

public class question118library {

    static int count = 0;

    public static void add(String[] bookid, String[] bookname,
            String[] author, String[] publisher, int[] quantity) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of books you want to add");
        int n = sc.nextInt();
        sc.nextLine();

        int r = count;

        for (int i = count; i < n + r; i++) {

            System.out.println("Enter details of Book " + (i + 1));

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
            sc.nextLine();

            count++;
        }
    }

    public static void display(String[] bookid, String[] bookname,
            String[] author, String[] publisher, int[] quantity) {

        System.out.println("\nBookID     BookName     Author    Publisher     Quantity\n");

        for (int i = 0; i < count; i++) {

            if (quantity[i] != 0) {

                System.out.print(bookid[i] + "   ");
                System.out.print(bookname[i] + "   ");
                System.out.print(author[i] + "   ");
                System.out.print(publisher[i] + "   ");
                System.out.println(quantity[i]);
            }
        }
    }

    public static void search(String[] bookid, String[] bookname,
            String[] author, String[] publisher, int[] quantity) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book ID");
        String id = sc.nextLine();

        boolean found = false;

        System.out.println("\nBookID     BookName     Author    Publisher     Quantity\n");

        for (int i = 0; i < count; i++) {

            if (bookid[i] != null && bookid[i].equals(id)) {

                System.out.print(bookid[i] + "   ");
                System.out.print(bookname[i] + "   ");
                System.out.print(author[i] + "   ");
                System.out.print(publisher[i] + "   ");
                System.out.println(quantity[i]);

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

        for (int i = 0; i < count; i++) {

            if (bookid[i] != null && bookid[i].equals(id)) {

                found = true;

                System.out.println("\nWhat do you want to update?");
                System.out.println("1. Book Name");
                System.out.println("2. Author");
                System.out.println("3. Publisher");
                System.out.println("4. Quantity");
                System.out.println("5. Book ID");

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
                        System.out.println("Enter New Book ID");
                        bookid[i] = sc.nextLine();
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }

                System.out.println("\nRecord Updated Successfully\n");

               System.out.println("\nBookID     BookName     Author    Publisher     Quantity\n");
                System.out.print(bookid[i] + "   ");
                System.out.print(bookname[i] + "   ");
                System.out.print(author[i] + "   ");
                System.out.print(publisher[i] + "   ");
                System.out.println(quantity[i]);

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

        int ch = 0;

        while (ch != 5) {

            System.out.println("Enter the choice");
            System.out.println("1. Add Books");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Exit\n");

            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    add(bookid, bookname, author, publisher, quantity);
                    System.out.println("Books Added Successfully\n");
                    break;

                case 2:
                    display(bookid, bookname, author, publisher, quantity);
                    break;

                case 3:
                    search(bookid, bookname, author, publisher, quantity);
                    break;

                case 4:
                    update(bookid, bookname, author, publisher, quantity);
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Enter a valid choice\n");
            }
        }
    }
}
