import java.util.*;

public class question65merge {
    
    public static void merge(int [] arr,int []arr2){
        int[] arr3= new int[arr.length+arr2.length];
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            arr3[k]=arr[i];
            k++;
        }
        for(int i=0;i<arr2.length;i++)
        {
            arr3[k]=arr2[i];
            k++;
        }
        System.out.println("the resultant array is");
        for(int i=0;i<arr3.length;i++)
        {
            System.out.print(arr3[i]+" ");
        }
    }

    
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array 1 ");
        int n = sc.nextInt();

        System.out.println("Enter the length of the array 2 ");
        int n2 = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Enter array 1's element " + (i + 1));
            arr[i] = sc.nextInt();
            
        }
        int[] arr2 = new int[n2];

        for(int i = 0; i < n2; i++) {
            System.out.println("Enter array 2's element " + (i + 1));
            arr2[i] = sc.nextInt();
            
        }
         merge(arr, arr2);

    }
}