import java.util.*;

public class question114arraymenu {
    public static void display(int arr[], int n) {
        System.out.println("Array Elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void search(int arr[], int n, Scanner sc) {
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int flag=0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element Found at Position " + i);
                flag=1;
                break;
            }
        }

        if (flag==0)
            System.out.println("Element Not Found");
    }

    public static void sort(int arr[], int n) {
        Arrays.sort(arr, 0, n);
        System.out.println("Array Sorted Successfully");
        display(arr, n);
    }

    public static void maximum(int arr[], int n) {
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Maximum Element = " + max);
    }

    public static void minimum(int arr[], int n) {
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println("Minimum Element = " + min);
    }

    public static void update(int arr[], int n, Scanner sc) {

        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        if (pos >= 0 && pos < n) {

            System.out.print("Enter New Element: ");
            arr[pos] = sc.nextInt();

            System.out.println("Element Updated Successfully.");

            display(arr, n);

        } else {
            System.out.println("Invalid Position");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\n===== MENU =====");
        System.out.println("1. Display Array");
        System.out.println("2. Search Element");
        System.out.println("3. Sort Array");
        System.out.println("4. Find Maximum");
        System.out.println("5. Find Minimum");
        System.out.println("6. Update Element");

        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                display(arr, n);
                break;

            case 2:
                search(arr, n, sc);
                break;

            case 3:
                sort(arr, n);
                break;

            case 4:
                maximum(arr, n);
                break;

            case 5:
                minimum(arr, n);
                break;

            case 6:
                update(arr, n, sc);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
