import java.util.*;
public class question86countwords {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the string");
    String str= sc.nextLine();
    int count=0;
    for(int i=0;i<str.length();i++)
    {
        if (str.charAt(i)==' ')
        {
            count = count+1;

        }

    }
    System.out.println("the number of words are "+(count+1));
}
}
