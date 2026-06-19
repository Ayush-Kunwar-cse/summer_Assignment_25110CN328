import java.util.*;
public class question76diagonal{
    public static void diagonal(int[][] arr1){
        int suml=0;
        int sumr=0;
        int total=0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                if (i==j){
                    suml=suml + arr1[i][j];
                }
                else if ((i+j)==(arr1.length-1))
                {
                    sumr=sumr+arr1[i][j];
                }
                total=suml+sumr;
                

            }
        }
        System.out.println("the sum of left diagonal element is "+suml);
        System.out.println("the sum of right diagonal element is"+ sumr);
        System.out.println("the total sum of both left and right diagonal element is "+total);
    }
        
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the row or column range of square matrix");
        int r=sc.nextInt(); 
            
        int[][] arr1= new int[r][r];
        System.out.println("enter the elements of array1");
        for(int i=0;i<r;i++)
            {
                System.out.println("enter elements of row "+(i+1));
                for (int j=0;j<r;j++)
                {
                    arr1[i][j]=sc.nextInt();
                }
            }

        diagonal(arr1);            
        
    }
    }

