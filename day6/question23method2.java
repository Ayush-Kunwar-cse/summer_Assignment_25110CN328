import java.util.*;
class question23method2{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the decimal number");
        int num= sc.nextInt();
        int count=0;
        while(num!=0){
            int r =num%2;
            if (r==1){
                count=count+1;
            }
            num=num/2;

        }
        System.out.println("set bits="+count);
    }
}