import java.util.*;
public class question93rotation {
    public static void rotation(String str1, String str2){
        String str3= "";
        String str4="";

        if (str1.length()==str2.length()){
            str3=str1+str1;
            str4=str2+str2;
            if (str3.contains(str2)&& str4.contains(str1))
            {
                System.out.println("the strings are rotation of each other");
            }
            else
            {
                System.out.println("the strings are not rotation of each other");
            }
        }
        
    }
    public static void main(String[] args)
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the first string");
            String str1= sc.nextLine();
            String str2=sc.nextLine();
            System.out.println("enter the first string");
            rotation(str1,str2);

        }
}