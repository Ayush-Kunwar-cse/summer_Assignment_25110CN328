import java.util.*;

public class question67intersection {

    public static void intersection(int[] arr1, int[] arr2) {

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < arr1.length && j < arr2.length) {

            if(arr1[i] == arr2[j]) {

                if(k == 0 || arr3[k - 1] != arr1[i]) {
                    arr3[k] = arr1[i];
                    k++;
                }

                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        System.out.println("The intersection of arrays is");

        for(int x = 0; x < k; x++) {
            System.out.print(arr3[x] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array 1");
        int n1 = sc.nextInt();

        System.out.println("Enter the length of array 2");
        int n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i = 0; i < n1; i++) {
            System.out.println("Enter array 1 element " + (i + 1));
            arr1[i] = sc.nextInt();
        }

        for(int i = 0; i < n2; i++) {
            System.out.println("Enter array 2 element " + (i + 1));
            arr2[i] = sc.nextInt();
        }

        intersection(arr1, arr2);
    }
}