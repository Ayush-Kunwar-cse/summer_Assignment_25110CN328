import java.util.*;
class question98common{
    public static void common(String str1, String str2){
        String nstr="";
        String sample="";
        char ch;
        for(int i=0;i<Math.max(str1.length(),str2.length());i++)
        {
            ch=str1.charAt(i);
            sample=String.valueOf(ch);
            if(str2.contains(sample)&&(!nstr.contains(sample)))
            {
                nstr=nstr+ch;
            }

        }
        System.out.println("the common characters of the array are");
        System.out.println(nstr);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string 1");
        String str1= sc.nextLine();
        System.out.println("enter the string 2");
        String str2= sc.nextLine();
        common(str1, str2);


    }
}
