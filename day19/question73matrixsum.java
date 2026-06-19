import java.util.*;
public class question73matrixsum{
    public static void sum(int [][] arr1, int[][] arr2,int r,int c){
        int[][] arr3= new int[r][c];
        for(int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("the final result is");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the row range");
        int r=sc.nextInt(); 
        System.out.println("enter the column range");
        int c=sc.nextInt();
            
        int[][] arr1= new int[r][c];
        System.out.println("enter the elements of array1");
        for(int i=0;i<r;i++)
            {
                System.out.println("enter elements of row "+(i+1));
                for (int j=0;j<c;j++)
                {
                    arr1[i][j]=sc.nextInt();
                }
            }

       int[][] arr2= new int[r][c];
       System.out.println("enter the elements of array 2");
        for(int i=0;i<r;i++)
            {
                System.out.println("enter elements of row "+(i+1));
                for (int j=0;j<c;j++)
                {
                    arr2[i][j]=sc.nextInt();
                }
            }
        sum(arr1,arr2,r,c);
            
        }
       
    }

