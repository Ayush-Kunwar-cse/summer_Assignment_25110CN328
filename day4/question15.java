import java.util.Scanner;

class question15_armstrong
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int org = num;
        int sum = 0;

        while(num>0)
        {
            int dig = num%10;
            sum = sum+(dig*dig*dig);
            num = num/10;
        }

        if(sum==org)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }
    }
}