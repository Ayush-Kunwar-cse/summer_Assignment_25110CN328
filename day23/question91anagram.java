import java.util.*;
public class question91anagram{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the first string");
    String str= sc.nextLine();
    System.out.println("enter the second string");
    String str2= sc.nextLine();
    char[] ch1= str.toCharArray();
    char[] ch2= str2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    String nstr= new String(ch1);
    String nstr2= new String(ch2);
    if(nstr.equalsIgnoreCase(nstr2))
    {
        System.out.println("the strings are anagram");
    }
    else{
        System.out.println("the strings are not anagram");
    }
    }        
}
