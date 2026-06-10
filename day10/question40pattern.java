import java.util.*;
class question40pattern{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows");
        int n= sc.nextInt();
        char ch;
        char ch2='A';
    
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            ch='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            ch--;
            ch--;
            for(int l=i-1;l>=1;l--)
            {
                
                System.out.print(ch);
                ch--;
                
            }
        
            System.out.println();
        }

    }
}