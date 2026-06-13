import java.util.*;
public class question51array{
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
            int large=0;
            int small=0;
            for(int i=0;i<n;i++)
            {
                if (large<arr[i])
                {
                    large=arr[i];
                }
                if(small>=arr[i])
                {
                    small=arr[i];
                }

                
            }
            System.out.println("the largest number is "+large);
            System.out.println("the smallest number is "+small);

        }
}