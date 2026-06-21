import java.util.*;
public class question80columnsum{
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the row range");
        int r=sc.nextInt(); 
        System.out.println("enter the column range");
        int c=sc.nextInt();
            
        int[][] arr= new int[r][c];
        System.out.println("enter the elements of array");
        for(int i=0;i<r;i++)
            {
                System.out.println("enter elements of row "+(i+1));
                for (int j=0;j<c;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
        int add=0;
        for(int i=0;i<c;i++)
        {
            for (int j=0;j<r;j++)
            {
                add=add+arr[j][i];
            }
            System.out.println("the sum of elements of column "+(i+1)+" is"+add);
            add=0;
        }
        
            
        }
       
    }