import java.util.*;
class question21d2b{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the decimal number");
        int num= sc.nextInt();
        String bin="" ;
        while(num!=0){
            int r =num%2;
            bin=r+bin;
            num=num/2;

        }
        System.out.println("the binary no is "+bin);
    }
}