import java.util.*;
class question113calculator{
    public static double sum(double a, double b){
        double add= a+b;
        return add;
    }
    public static double subtract(double a, double b){
        double minus= a-b;
        return minus;
    }
    public static double multiply(double a, double b){
        double product= a*b;
        return product;
    }
    public static double divide(double a, double b){
        double div= a/b;
        return div;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double res=0;
        System.out.println("MENU DRIVEN CALCULATOR");
        System.out.println("----------------------");
        System.out.println("Enter the first no");
        int num1= sc.nextInt();
       
        System.out.println("Enter your choice");
        System.out.println("---------------------");
        System.out.println("1.Addition");
        System.out.println("---------------------");
        System.out.println("2.Subtraction");
        System.out.println("---------------------");
        System.out.println("3.Multiply");
        System.out.println("---------------------");
        System.out.println("4.Divide");
        System.out.println("---------------------");

        int choice = sc.nextInt();

        System.out.println("Enter the second number");
        System.out.println("---------------------\n");
        int num2= sc.nextInt();


        switch(choice){
            case 1:
                res = sum(num1,num2);
                break;
            case 2:
                res= subtract(num1,num2);
                break;
            case 3:
                res= multiply(num1,num2);
                break;
            case 4:
                res= divide(num1,num2);
                break;
            default:
                System.out.println("The choice is invalid");

            
        }
        System.out.println("The result is   "+res);
    }
}