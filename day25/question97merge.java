import java.util.*;
public class question97merge {
    public static void merge(int[] arr1,int [] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] arr3=  new int [arr1.length+arr2.length];
        int count=0;
        for(int i=0;i< arr1.length;i++)
        {
            arr3[i]=arr1[i];
            count++;
        }
        for(int i=0;i<arr2.length;i++)
        {
            arr3[count]=arr2[i];
            count++;
        }
        for(int i=0;i<arr3.length;i++)
        {
            System.out.print(arr3[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total no of elements in array1");
        int n1=sc.nextInt();
        System.out.println("enter the first array");
        int arr1[]= new int[n1];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the total no of elements in array2");
        int n2=sc.nextInt();
        System.out.println("enter the second array");
        int arr2[]= new int[n2];
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }

        merge(arr1, arr2);
        
    }
}
