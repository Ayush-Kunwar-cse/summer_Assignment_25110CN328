import java.util.*;

class question27sum
{
    static int sum(int num)
    {
        int r= num%10;
        if(num==0)
        {
            return 0;
        }

        return (r)+sum(num/10);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Sum of digits = "+sum(num));
    }
}