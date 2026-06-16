import java.util.*;

public class question68common {

    public static void common(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int k = 0;
        for(int i = 0; i < arr1.length; i++)
         {
            int flag = 0;
            for(int j = 0; j < arr2.length; j++) {

                if(arr1[i] == arr2[j]) {

                    for(int l = 0; l < k; l++) {
                        if(arr3[l] == arr1[i]) {
                            flag = 1;
                            break;
                        }
                    }

                    if(flag == 0) {
                        arr3[k] = arr1[i];
                        k++;
                    }

                    break;
                }
            }
        }

        System.out.println("Common elements are:");

        for(int i = 0; i < k; i++) {
            System.out.print(arr3[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter array 1 elements:");
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array:");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter array 2 elements:");
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        common(arr1, arr2);
    }
}
