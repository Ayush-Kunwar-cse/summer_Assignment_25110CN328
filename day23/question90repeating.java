import java.util.*;
public class question90repeating {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the string");
    String str= sc.nextLine();
    int count=0;
    char ch;
    for(int i=0;i<str.length();i++)
    {
        ch=str.charAt(i);
        for(int j=0;j<str.length();j++)
        {
         if(ch==str.charAt(j))
         {
            count=count+1;
         }
        }
        if(count>1)
        {
            System.out.println("the first repeating character is "+ch);
            break;
        }
        count=0;

    }
   
}
}

