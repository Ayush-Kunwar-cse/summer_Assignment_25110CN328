import java.util.*;

class question28rev
{
    static int reverse(int num, int rev){
        if(num==0){
            return rev;
        }

        return reverse(num/10,rev*10+(num%10));
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Reversed number = "+reverse(num,0));
    }
}