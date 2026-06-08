import java.util.*;
class question31pattern{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the row range");
        int n= sc.nextInt();
        //loop1
    for(int i=1;i<=n;i++)
    {
        char ch='A';
        for(int j=1;j<=i;j++)
        {
            System.out.print(ch);
            ch++;

        }
        System.out.println();
    }
    
    }
}
            

