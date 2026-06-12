import java.util.*;
public class question48perfect {
    public static int perfect(int n){
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if (n%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        int check=perfect(num);
        if (check==num)
        {
            System.out.println("the number is a perfect number");
         }
        else
        {
            System.out.println("the nymber is not a perfect number");
        }
    }
    
}
