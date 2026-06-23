import java.util.*;
public class question89nonrepeating {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the string");
    String str= sc.nextLine();
    int count=0;
    char ch;
    char ch1=' ';
    int flag=0;
    for(int i=0;i<str.length();i++)
    {
        ch=str.charAt(i);
        for(int j=0;j<str.length();j++)
        {
         if(j!=i){
            if(ch==str.charAt(j))
            {
                flag=1;
                break;
            }
            else{
                flag=0;
            }
        }
            
        }
        if(flag==0)
            {
                
                    
                     ch1=str.charAt(i);
                     System.out.println("the first non repeating character is "+ch1 );
                     break;
                    
                
            }

        

    }
   
}
}

