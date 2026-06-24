import java.util.*;
public class question94compress {
    public static String compress(String str)
    {
        String cstr= str+" ";
        String dstr="";
        int count=0;
        for(int i=0;i<cstr.length()-1;i++)
            {   
                if(cstr.charAt(i)==cstr.charAt(i+1))
                {
                    count=count+1;
                }
                else
                {
                    dstr=dstr+cstr.charAt(i)+(count+1);
                    count=0;
                }
                    
            }
            return dstr;
                

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str= sc.nextLine();
        String nstr=compress(str);
        System.out.println("the compressed string is");
        System.out.println(nstr);
    }

}
    