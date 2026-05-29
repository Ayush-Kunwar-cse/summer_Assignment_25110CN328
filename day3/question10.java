import java.util.Scanner;

class question10_prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting number: ");
        int str = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        for(int num = str;num<=end;num++)
        {
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
                System.out.println(num);
            }
        }
    }
}