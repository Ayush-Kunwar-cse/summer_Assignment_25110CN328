import java.util.*;
public class question52array{
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
            for(int i=0;i<n;i++)
            {
                System.out.println();
            }
            int counteven=0;
            int oddcount=0;
            for (int i=0;i<n;i++)
            {
                if(arr[i]%2==0)
                {
                    counteven++;
                }
                else{
                    oddcount++;
                }
                
            }
            System.out.println("the number of even is "+counteven);
            System.out.println("the number of odd is "+oddcount);
        }
    }
