import java.util.*;
class question24pow{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        System.out.println("enter the power");
        int po= sc.nextInt();
        int res=1;
        if(po==0){
            System.out.println("the answer is" +1);
        }
        else{
        for(int i=1;i<=po;i++){
            res= res*num;
            

        }
    }
        System.out.println("the answer is "+res);

    }
}