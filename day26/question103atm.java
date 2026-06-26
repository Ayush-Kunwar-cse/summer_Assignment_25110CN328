import java.util.*;
public class question103atm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float tot = 100000;
        int pin =1111;
        System.out.println("Welcome to the ATM service \n");
        
            
            System.out.println("Insert the debit card");
            System.out.println("Enter the pin");
            int oppin = sc.nextInt();
            if (oppin==pin){
            System.out.println("ATM MENU\n");
            System.out.println("Enter the option number\n");
            System.out.println("1.WITHDRAW");
            System.out.println("2.CHECK BALANCE");
            System.out.println("3.CHANGE PIN");
            System.out.println("4.EXIT");



            int op= sc.nextInt();

            switch(op) 
            {
                case 1:
                    System.out.println("Enter the amount you want to withdraw");
                    int bal= sc.nextInt();
                    tot=tot-bal;
                    System.out.println("the withdrawl is successful");
                case 2:
                    System.out.println("Your total balance is "+ tot);
                    break;
                case 3:
                    System.out.println("enter the new pin");
                    int oppin2= sc.nextInt();
                    if(oppin!=oppin2){
                    pin=oppin2;
                    break;
                    }
                    else{
                        System.out.println("the pin can't be same as previous pin");
                        break;
                    }
                case 4:
                    System.out.println("thanks for using the atm");
                    break;
            }
        }
        else{
            System.out.println("incorrect pin");
            
        }

        }

}

