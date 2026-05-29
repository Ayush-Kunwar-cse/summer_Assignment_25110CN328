import java.util.Scanner;

class question9_prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int cnt = 0;

        for(int i = 1;i<=num;i++)
        {
            if(num%i==0)
            {
                cnt = cnt+1;
            }
        }

        if(cnt==2)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not a Prime Number");
        }
    }
}