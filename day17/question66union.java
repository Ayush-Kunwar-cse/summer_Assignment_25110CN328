import java.util.*;

public class question66union {

    public static void union(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];
        int k = 0;

        for(int i = 0; i < arr1.length; i++) {
            arr3[k] = arr1[i];
            k++;
        }

        for(int i = 0; i < arr2.length; i++) {
            arr3[k] = arr2[i];
            k++;
        }

        Arrays.sort(arr3);

        System.out.println("Union of arrays:");

        System.out.print(arr3[0] + " ");

        for(int i = 1; i < arr3.length; i++) {

            if(arr3[i] != arr3[i - 1]) {
                System.out.print(arr3[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        for(int i = 0; i < n1; i++) {
            System.out.println("Enter array 1 element " + (i + 1));
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array:");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        for(int i = 0; i < n2; i++) {
            System.out.println("Enter array 2 element " + (i + 1));
            arr2[i] = sc.nextInt();
        }

        union(arr1, arr2);
    }
}
