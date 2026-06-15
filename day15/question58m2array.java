//method 2
// long method 
import java.util.*;
public class question58m2array{
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
        int [] narr= new int[n];
        System.out.println("enter the place to rotated");
        int d= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if((i+d)<arr.length){
                narr[i]=arr[i+d];
            }
            else{
                for(int j=0;j<d;j++)
                {
                    narr[n-(j+1)]=arr[d-(j+1)];
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(narr[i]+" ");
        }
    }
}
            
    
