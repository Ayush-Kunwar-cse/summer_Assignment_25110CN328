import java.util.*;
public class question99sortnames{
    public static void sort(String[] arr){
        Arrays.sort(arr);
        System.out.println("the sorted array is");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of names to be entered");
        int n= sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n];
        System.out.println("enter the names");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }
        sort(arr);
    }
}