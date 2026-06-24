import java.util.*;
public class question96duplicate {
    public static void duplicate(String str){
        String nstr="";
        String check="";
        char ch;
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            check=check+ch;
            if(nstr.contains(check))
            {
                check="";
            }
            else{
                nstr=nstr+ch;
            }
            check="";
        }
        System.out.println("the new string is ");
        System.out.println(nstr);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str= sc.nextLine();
        duplicate(str);
    }
    
}
