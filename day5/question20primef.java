import java.util.*;
class question20primef{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int large = 1;

        for(int i = 2;i<=num;i++){
            if(num%i==0) {
                int count = 0;

                for(int j = 1;j<=i;j++){
                    if(i%j==0)
                    {
                        count = count+1;
                    }
                }

                if(count==2){
                    large = i;
                }
            }
        }

        System.out.println("Largest Prime Factor = "+large);
    }
}