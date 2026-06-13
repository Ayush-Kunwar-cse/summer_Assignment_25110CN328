import java.util.*;
public class question49array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements of the array");
        int n=sc.nextInt();
            int[]arr=new int[n];
            //i/p
            for(int i=0;i<n;i++)
            {
                System.out.println("enter the element"+(i+1));
                arr[i]=sc.nextInt();
            }
            System.out.println("the array is");
            for (int i=0;i<n;i++)
            {
                System.out.println(arr[i]);

            }
    }
}