import java.util.*;
class question23{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        int count =0;
        while (num>0){
            if ((num&1)==1){
                count= count+1;
            }
            num= num>>1;
        }
        System.out.println("set bits ="+count);
    }
}