import java.util.*;
public class question50{
    public static void main(String[] args) {
        int sum=0;
        float avg=0;
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
            for(int i=0;i<n;i++)
            {
                sum=sum+arr[i];
            }
            avg=((float)sum)/n;
            System.out.println("the sum is "+sum);
            System.out.println("the average is"+avg);
            
        }
}