 import java.util.*;

public class question64duplicate {

    public static void removeduplicate(int[] arr) {

        Arrays.sort(arr);

        int[] result = new int[arr.length];
        int k = 0;

        result[k] = arr[0];
        k++;

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] != arr[i - 1]) {
                result[k] = arr[i];
                k++;
            }
        }

        System.out.println("Array after removing duplicates:");

        for(int i = 0; i < k; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.println("enter the element " +(i+1));
            arr[i] = sc.nextInt();
        }

        removeduplicate(arr);
    }
}
    

