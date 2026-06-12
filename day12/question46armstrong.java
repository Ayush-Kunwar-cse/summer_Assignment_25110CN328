import java.util.*;
class question46armstrong{
public static int armstrong(int n){
    int a= n;
    int count=0;
    while(a>0)
    {
        count=count+1;
        a=a/10;
    }
    int sum=0;
    while(n>0)
    {
        int rem=n%10;
        sum=sum+(int)Math.pow(rem,count);
        n=n/10;

    }
    return sum;
}
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number");
    int num= sc.nextInt();
    int result=armstrong(num);
    if(result==num)
    {
        System.out.println("the number is armstrong");
    }
    else
    {
        System.out.println("the number is not armstrong");
    }
}
}
