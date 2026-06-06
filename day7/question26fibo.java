import java.util.*;
class question26fibo
{
    static int fib(int num)
    {
        if(num==1)
        {
            return 0;
        }

        if(num==2)
        {
            return 1;
        }

        return fib(num-1)+fib(num-2);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter nth term: ");
        int num = sc.nextInt();

        for(int i = 1;i<=num;i++)
        {
            System.out.print(fib(i)+" ");
        }
    }
}