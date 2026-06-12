import java.util.*;
public class question45pallindrome {
    public static int pldrm(int n){
        int rev=0;
        while(n>0)
        {
            rev=rev*10 + (n%10);
            n=n/10; 
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        int rev =pldrm(num);
        if(rev==num)
        {
            System.out.println("the number is pallindrome");
        }
        else
        {
            System.out.println("the number is not a pallindrome");
        }
    }
}
