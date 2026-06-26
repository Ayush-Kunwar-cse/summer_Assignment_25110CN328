import java.io.OutputStream;
import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class question101guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran =  new Random();
        System.out.println("NUMBER GUESSING GAME");
        System.out.println();
        System.out.println("LET'S PLAY");
        System.out.println();

        while(true)
        {
        int r=ran.nextInt(100)+1; 
        System.out.println("enter your guess between 1 to 100");
        int guess= sc.nextInt();

        if(r==guess)
        {
            System.out.println("yay!! you  won the game");
        }

        else
        {
            System.out.println("oops!! it looks like your guess was wrong");

        }
        System.out.println("Do you want to play again");
        System.out.println("ENTER 1.FOR YES \n Enter 2 FOR NO");
        int op= sc.nextInt();
        if(op==1)
        {
            continue;
        }
        else if (op==2)
        {
            break;
        }
        
        else
        {
            System.out.println("invalid choice");
        }
    }


    }
    
}
