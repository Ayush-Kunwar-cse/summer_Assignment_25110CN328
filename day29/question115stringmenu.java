import java.util.*;
public class question115stringmenu {

    public static void length(String str){
        int len  = str.length();
        System.out.println("the result is");
        System.out.println(len);
    }
    public static void reverse(String str){
        String nstr= "";
        for(int i=0;i<str.length();i++)
        {
            char ch= str.charAt(i);
            nstr= ch+nstr;
            System.out.println("The result is");
            System.out.println(nstr);
        }
    }
    public static void pallindrome(String str){
        String nstr= "";
        for(int i=0;i<str.length();i++)
        {
            char ch= str.charAt(i);
            nstr= ch+nstr;
            if (nstr.equals(str)){
                System.out.println("Yes it is a pallindrome");
            }
            else{
                System.out.println("no its not a pallindrome ");
            }
        }
    }
    public static void upper(String str){
        System.out.println("the result is");
        System.out.println(str.toUpperCase());
    }
    public static void lower(String str){
        System.out.println("the result is");
        System.out.println(str.toLowerCase());
    }
    public static void conc(String str){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the second string");
        String nstr= sc.nextLine();
        System.out.println("the result is");
        System.out.println(str.concat(nstr));
    }
    public static void rem(String str){
        String nstr=str.trim();
        System.out.println("The result is");
        System.out.println(nstr);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("MENU DRIVEN STRING OPERATION");
        System.out.println("----------------------");
        System.out.println("Enter the string");
        String str= sc.nextLine();
       
        System.out.println("Enter your choice");
        System.out.println("---------------------");
        System.out.println("1.Find length");
        System.out.println("---------------------");
        System.out.println("2.Reverse");
        System.out.println("---------------------");
        System.out.println("3.Check pallindrome");
        System.out.println("---------------------");
        System.out.println("4.Convert to upper case");
        System.out.println("---------------------");
        System.out.println("5.Convert to lower case");
        System.out.println("---------------------");
        System.out.println("6.Concatenate");
        System.out.println("---------------------");
        System.out.println("7.Remove white spaces");
        System.out.println("---------------------");
        


        int choice = sc.nextInt();

        switch(choice){
            case 1:
                length(str);
                break;
            case 2:
                reverse(str);
                break;
            case 3:
                pallindrome(str);
                break;
            case 4:
                upper(str);
                break;
            case 5:
                lower(str);
                break;
            case 6:
                conc(str);
                break;
            case 7:
                rem(str);
                break;
              
            default:
                System.out.println("The choice is invalid");

    
            }

}
}
