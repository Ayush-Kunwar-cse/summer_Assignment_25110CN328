import java.util.*;

public class question60movezero {

    public static void movezero(int[] arr) {

        int z = 0;
        int nz = 0;

        while(nz < arr.length) {

            if(arr[nz] != 0) {

                int temp = arr[z];
                arr[z] = arr[nz];
                arr[nz] = temp;

                z++;
            }

            nz++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1));
            arr[i] = sc.nextInt();
        }

        movezero(arr);

        System.out.println("Array after moving zeroes to end:");

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}