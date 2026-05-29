import java.util.Scanner;

class question16_armstrong
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting number: ");
        int start = sc.nextInt();

        System.out.println("Enter ending number: ");
        int end = sc.nextInt();

        for(int num = start;num<=end;num++)
        {
            int org = num;
            int temp = num;
            int sum = 0;

            while(temp>0)
            {
                int dig = temp%10;
                sum = sum+(dig*dig*dig);
                temp = temp/10;
            }

            if(sum==org)
            {
                System.out.println(org);
            }
        }
    }
}