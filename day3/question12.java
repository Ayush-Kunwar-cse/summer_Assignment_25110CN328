import java.util.Scanner;

class question12_lcm
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        int max;

        if(num1>num2)
        {
            max = num1;
        }
        else
        {
            max = num2;
        }

        while(true)
        {
            if(max%num1==0 && max%num2==0)
            {
                System.out.println("LCM = "+max);
                break;
            }

            max = max+1;
        }
    }
}