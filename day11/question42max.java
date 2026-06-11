import java.util.*;
public class question42max {
    
public static float max(float a,float b)
{

    if(a>b)
    {
        return a;
    }
    else 
        return b;

}
public static  void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the first num");
    float num1= sc.nextFloat();
    System.out.println("enter the second num");
    float num2= sc.nextFloat();
    float m =max(num1,num2);
    System.out.println("the maximum is"+m);

}
}
