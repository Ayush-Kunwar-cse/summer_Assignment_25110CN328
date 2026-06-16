import java.util.*;

public class question61missing {
    
    public static int missing(int [] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        int originalsum= ((arr.length)*(arr.length+1))/2;
        int miss= originalsum-sum;
        return miss;
    }
    
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter the number between 0 to "+n);
        for(int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1));
            arr[i] = sc.nextInt();
        }

        int miss=missing(arr);
        System.out.println("the missing element is"+miss);
    }
}
