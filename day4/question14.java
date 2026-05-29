import java.util.Scanner;

class question14_fibonacci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter nth term: ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        int sum = 0;

        if(num==1)
        {
            System.out.println("Nth Fibonacci Term = "+a);
        }
        else if(num==2)
        {
            System.out.println("Nth Fibonacci Term = "+b);
        }
        else
        {
            for(int i = 3;i<=num;i++)
            {
                sum = a+b;
                a = b;
                b = sum;
            }

            System.out.println("Nth Fibonacci Term = "+b);
        }
    }
}