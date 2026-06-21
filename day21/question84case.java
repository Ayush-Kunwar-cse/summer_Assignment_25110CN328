import java.util.*;
public class question84case{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the string");
    String str= sc.nextLine();
    char ch;
    int upper=0;
    int lower=0;
    for(int i=0; i<str.length();i++)
    {
        ch= str.charAt(i);
        int check = (int) ch;
        if (check>=65 && check<=90)
        {
            lower= check+32;
            ch =(char) lower;
        }
        else if(check>=97&& check<=122){
            upper=check-32;
            ch=(char) upper;
        }
        System.out.print(ch);
    }
            
    }
 }
    
