import java.util.*;
class question41sum{

    public static float sum(float a , float b ){
        float add = a+b;
        return add;        
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first no.");
        float num1= sc.nextFloat();
        System.out.println("enter the number ");
        float num2= sc.nextFloat();
        System.out.println("the sum is="+sum(num1,num2));
    }
}
