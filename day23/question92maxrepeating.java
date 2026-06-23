import java.util.*;
public class question92maxrepeating {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the string");
    String str= sc.nextLine();
    int count=0;
    int count1=0;
    char ch;
    char ans=' ';
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
        if(count1<count)
        {
            count1=count;
            ans=ch;
        }
        count=0;

    }
    System.out.println("the maximum repeating element is- " +ans);
   
}
}

