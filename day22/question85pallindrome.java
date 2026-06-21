import java.util.*;
public class question85pallindrome {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the string");
    String str= sc.nextLine();
    String rev="";
    for(int i=(str.length()-1); i>=0;i--)
    {
        rev= rev+str.charAt(i);
    }
    if(str.equals(rev))
    {
        System.out.println("the string is pallindrome");
    }
    else{
        System.out.println("the string is not a pallindrome");
    }
  }
}