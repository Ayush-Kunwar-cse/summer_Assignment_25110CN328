import java.util.*;
class question18strong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numberr");
        int n = sc.nextInt();
        int sum=0;
        int count=0;
        int dup=n;
        int orig=n;
        int fact=1;

        while(dup!=0){
            dup=dup/10;
            count=count+1;
        }
        for(int i=1; i<=count;i++){
            int rem= n%10;
            for (int j=1; j<=rem; j++){
                fact = fact*j;

            }
            sum=sum+fact;
            n=n/10;
            fact=1;
        }
        if(sum==orig){
            System.out.println("the number is strong no.");
        }
        else {
            System.out.println("the number is not a strong number");
        }
    }
}
