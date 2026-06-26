import java.util.*;

class question102voting{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("WELCOME DEAR VOTER!!");
            System.out.println("Enter the voter's age");
            int age = sc.nextInt();
            if(age<18)
            {
                System.out.println("Sorry you are not eligible to vote\nsince yoou are not 18 years old\n");
            }
            else
            {
                System.out.println("Enter the part you want to vote");
                System.out.println("Choose the option number\n");
                System.out.println("1.party1 \n2.party2\n3.party3\n4.party4\n");
                int op2= sc.nextInt();
                System.out.println("Your response was recorded");
                System.out.println("THANKS FOR YOUR VOTE");

            }

        

        
    }
}
