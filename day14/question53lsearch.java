import java.util.*;
public class question53lsearch{
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
        System.out.println("enter the element to be searched");
        int el=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==el)
            {
                System.out.println("the element has been found at index"+i);
            }
        }
    }
}
