import java.util.Scanner;

class question13_fibonacci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of terms: ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        for(int i = 1;i<=num;i++)
        {
            System.out.println(a);

            int sum = a+b;
            a = b;
            b = sum;
        }
    }
}