//method1
import java.util.*;
public class question58leftrotate
{
    public static void rotate1(int []arr){
        int temp=arr[0];
        for (int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        
    }
    public static void rotate(int[]arr,int d){
        d=d%arr.length;
        if(d<0)
        {
            d=d+arr.length;
        }
        for(int i=1;i<=d;i++)
        {
            rotate1(arr);
        }

    }
   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the number of places to be rotated");
        int d = sc.nextInt();
        //i\p
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the array's element "+(i+1));
            arr[i]=sc.nextInt();
        }
       rotate(arr,d);

        System.out.println("the rotated resultant array is");
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");

        }


    }
}