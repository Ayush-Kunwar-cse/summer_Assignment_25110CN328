import java.util.*;
class question19factors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbr");
        int n = sc.nextInt();
        System.out.println("the factors are");

        for(int i=1; i<=n ; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}