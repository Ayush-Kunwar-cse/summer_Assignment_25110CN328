import java.util.*;

public class question81length {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str= sc.nextLine();
        char[] arr= str.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            count=count+1;
        }
        System.out.println("the length of the array is "+count);
    }
}