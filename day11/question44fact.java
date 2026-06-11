import java.util.*;
public class question44fact {
    public static void factorial(int n){
        int fact=1;
        if(n<0){
            System.out.println("invalid no");
            return;
        }
        else if(n==0)
        {
            System.out.println("the factorial is "+1);
            return;
        }
        else
        {
            for(int i=n;i>=1;i--)
            {
                fact=fact*i;
            }
            System.out.println("the factorial is "+fact);
            return;
        }

        
        }
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the number");
            int num= sc.nextInt();
            factorial(num);
    }
    
}
