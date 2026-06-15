import java.util.*;
public class question57array
{
    public static void reverse(int []arr){
        int i=0; int j=arr.length-1;
        while(i<j)
        {
            int temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
    }    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        //i\p
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the array's element "+(i+1));
            arr[i]=sc.nextInt();
        }
       reverse(arr);

        System.out.println("the resultant array is");
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");

        }


    }
}