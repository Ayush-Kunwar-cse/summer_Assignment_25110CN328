import java.util.*;
public class question43prime {
    public static int prime(int n){
        int flag=0;
        if(n<=1)
        {
            System.out.println("the number is not prime ");
            return flag;
        }
        else
        {
            for(int i=2; i<n;i++)
            {
                if(n%i==0)
                {
                    flag=1;
                    break;
                }
                
            }
            return flag;

        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int flag=prime(num);
        if(flag==1)
        {
            System.out.println("the number is not a prime number");
        }
        else 
        {
            System.out.println("the number is a prime number");
        }
    }



 }
    

