import java.util.*;
public class question47Fibonacci {
    public static void fib(int n){
        int first=0;
        int second=1;
        for(int i=0;i<n;i++)
        {
            System.out.println(first);
            int next=first+second;
            first=second;
            second=next; 
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  number");
        int num= sc.nextInt();
        fib(num);
    }
}
