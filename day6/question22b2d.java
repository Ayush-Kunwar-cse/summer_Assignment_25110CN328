import java.util.*;
class question22b2d{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the binary number");
        int num= sc.nextInt();
        int count =0;
        int copy = num;
        while(copy!=0){
            copy=copy/10;
            count=count+1;

        }
        int dec =0;
        for (int i =0; i<count; i++){
            int rem= num%10;
            dec= dec+ (rem*(int)Math.pow(2, i));
            num=num/10;

        }
        System.out.println("the decimal number is"+dec);
    } 
}
