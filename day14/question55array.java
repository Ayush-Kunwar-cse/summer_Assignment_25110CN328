import java.util.*;
public class question55array{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        //i\p
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the array"+(i+1));
            arr[i]=sc.nextInt();
        }
         int large=arr[0];
         int seclarge=arr[0];

         for (int i=0;i<n;i++)
         {
            if (large<arr[i])
            {
                seclarge=large;
                large=arr[i];

            }
         }
         System.out.println("the  second largest number is"+seclarge);

    }
}
