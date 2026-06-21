import java.util.*;
public class question79rowsum{
    public static void sum(int [][] arr){
        int add=0;
        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                add=add+arr[i][j];
            }
            System.out.println("the sum of elements of row "+(i+1)+" is"+add);
            add=0;
        }
        
        }
        
    
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
        sum(arr);
        
            
        }
       
    }