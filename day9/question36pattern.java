import java.util.*;
public class question36pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the row range");
        int n =sc.nextInt();
        System.out.println("enter the column rsnge");
        int m= sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(i==n || j==m || i==1 || j==1)
                {
                    System.out.print("*");
                }
                else
                {
                        System.out.print(" ");
                }
            }
            System.out.println();


        }

    }

    
}