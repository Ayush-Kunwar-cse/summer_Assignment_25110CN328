import java.util.*;

public class question72descending
{
    public static void descending(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter array elements");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        descending(arr);

        System.out.println("Array in descending order");

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}