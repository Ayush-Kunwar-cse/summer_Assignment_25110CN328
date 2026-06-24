import java.util.*;
public class question95longword {
    public static void longest(String str) {
        String[] arr= str.split(" ");
        String samp;
        String longst="";
        int count=0;int max=0;
        for(int i=0;i<arr.length;i++)
        {
            samp=arr[i];
            count= samp.length();
            if(max<count){
                max=count;
                longst=samp;
                count=0;
            }
        }
        System.out.println("the largest word is ");
        System.out.println(longst);

    }
        

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str= sc.nextLine();
        longest(str);
        
    }
    
}
