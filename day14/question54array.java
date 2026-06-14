import java.util.*;
public class question54array{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n= sc.nextInt();
        int[] arr= new int[n];
         //i\p
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the array"+(i+1));
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element whose frequency is to be determined");
        int el= sc.nextInt();
        int count=0;

        //operation
        for(int i=0;i<n;i++)
        {
            if(el==arr[i])
            {
                count=count+1;
            }
        }
        System.out.println("the frequency of the element is "+count);
    }
}

