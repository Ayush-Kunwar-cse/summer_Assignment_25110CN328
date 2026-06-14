import java.util.*;
public class question56array {

    public static void duplicate(int arr[], int size) {

        for(int i = 0; i < size; i++) {

            int flag = 0;

            for(int k = 0; k < i; k++) {
                if(arr[i] == arr[k]) {
                    flag = 1;
                    break;
                }
            }

            if(flag == 1)
                continue;

            for(int j = i + 1; j < size; j++) {

                if(arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i = 0; i < size; i++) {
            
         System.out.println("enter the array"+(i+1));
            arr[i] = sc.nextInt();
        }
        System.out.println("the duplicate elements are");
        duplicate(arr, size);
    }
}