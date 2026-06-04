import java.util.*;
class question17perfect{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numberr");
        int n = sc.nextInt();
        int sum=0;

        for(int i=1; i<n; i++){
            if (n%i==0){
                sum=sum+i;
            }

        }
        if(sum==n){
            System.out.println("the number is perfect no");
        }
        else{
            System.out.println("the number is not a perfect no.");
        }
        
    }
}