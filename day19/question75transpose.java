import java.util.*;

public class question75transpose {

public static void transpose(int[][] arr, int r, int c) {

    int[][] trans = new int[c][r];

    for(int i = 0; i < r; i++) {
        for(int j = 0; j < c; j++) {
            trans[j][i] = arr[i][j];
        }
    }

    System.out.println("Transpose matrix:");

    for(int i = 0; i < c; i++) {
        for(int j = 0; j < r; j++) {
            System.out.print(trans[i][j] + " ");
        }
        System.out.println();
    }
}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of rows:");
    int r = sc.nextInt();

    System.out.println("Enter number of columns:");
    int c = sc.nextInt();

    int[][] arr = new int[r][c];

    

    for(int i = 0; i < r; i++) {
        System.out.println("enter lements of row "+(i+1));
        for(int j = 0; j < c; j++) {
            arr[i][j] = sc.nextInt();
        }
    }

    transpose(arr, r, c);
}

}
