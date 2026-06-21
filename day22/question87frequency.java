import java.util.*;
public class question87frequency {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the string");
    String str= sc.nextLine();
    System.out.println("enter the character whose frequency is to be determined");
    char ch= sc.next().charAt(0);
    int count=0;
    for(int i=0;i<str.length();i++)
    {
        if (str.charAt(i)==ch)
        {
            count = count+1;

        }

    }
    System.out.println("the number of "+ch+" is "+(count));
}
}

