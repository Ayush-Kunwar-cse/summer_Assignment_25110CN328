import java.util.*;
public class question83count {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the string");
    String str= sc.nextLine();
    char ch;
    int countv=0;
    int countc=0;
    for(int i=0; i<str.length();i++)
    {
        ch= str.charAt(i);
        if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') )
        {
            if(ch=='a'|| ch=='A'|| ch=='e'|| ch=='E'|| ch=='O'|| ch=='o'|| ch=='i'|| ch=='I'|| ch=='u' || ch=='U')
            {
                countv= countv +1;
            }
            else{
                countc=countc+1;
            }
            
        }
    }
    System.out.println("total no of vowels are "+countv);
    System.out.println("total no of consonents are "+countc);
}
}