import java.util.*;

public class question78symmetric {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter array size");
    int r = sc.nextInt();
    int[][] arr = new int[r][r];

    for(int i = 0; i < r; i++) 
    {
        System.out.println("Enter elements of row "+(i+1));
        for(int j = 0; j < r; j++) 
        {
            arr[i][j] = sc.nextInt();
        }
    }


    int flag = 0;

    for(int i = 0; i < r; i++) 
    {
        for(int j = 0; j < r; j++) 
        {

            if(arr[i][j] != arr[j][i]) {
                flag = 1;
                break;
            }
        }

        if(flag == 1) {
            break;
        }
    }

    if(flag == 0) 
    {
        System.out.println("Matrix is symmetric");
    }
    else 
    {
        System.out.println("Matrix is not symmetric");
    }
}

}

