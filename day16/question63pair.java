import java.util.*;

public class question63pair {
    
    public static void pair(int [] arr,int num){
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                sum=arr[i]+arr[j];
                if(sum==num)
                {
                    System.out.println("the pair  elements are "+arr[i]+"+"+arr[j]);
                }
            }
        }
        
    }

    
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1));
            arr[i] = sc.nextInt();
            
        }
        System.out.println("enter the sum value ");
        int num=sc.nextInt();

        pair(arr, num);

    }
}