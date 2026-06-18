import java.util.*;

public class question70selectionsort {
public static void selectionsort(int[] arr) {

    for(int i = 0; i < arr.length - 1; i++) {

        int min = i;

        for(int j = i + 1; j < arr.length; j++) {

            if(arr[j] < arr[min]) {
                min = j;
            }
        }

        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of array:");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter array elements:");

    for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    selectionsort(arr);

    System.out.println("Sorted array:");

    for(int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
}
}
