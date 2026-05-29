import java.util.Scanner;

class Question8_Palindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int org = num;
        int rev = 0;

        while(num>0)
        {
            rev = rev*10+(num%10);
            num = num/10;
        }

        if(org==rev)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
        }
    }
}