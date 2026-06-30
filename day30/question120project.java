import java.util.*;
public class question120project{
    
    static int count=0;
    static int count1 =0;
    static int count2 =0;
    static int count3 =0;
    static int count4=0;
    public static void book(String[] id , String[] name, String[] source ,String[] to,String[] coach, String[] seat,double[] fair){
        System.out.println("how many tickets do you want to book");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        String  c ="";
        int r= count;
        for(int i=count; i<n+r;i++)
        {

            
                System.out.println("Enter details of passenger "+(i+1));
                sc.nextLine();
                System.out.println("Enter the irctc id");
                id[i]=sc.nextLine();
                System.out.println("Enter the passengers name");
                name[i]=sc.nextLine();
                System.out.println("Enter the source destination");
                System.out.println("  varanasi");
                System.out.println("   delhi");
                System.out.println("   prayagraj");
                System.out.println("   bengaluru");
                source[i]= sc.nextLine();
                System.out.println("Enter the final destination");
                System.out.println("   varanasi");
                System.out.println("   delhi");
                System.out.println("   prayagraj");
                System.out.println("   bengaluru");
                to[i]= sc.nextLine();

                

                System.out.println("enter the coach ");
                System.out.println("1.1ST AC");
                System.out.println("2.2ND AC");
                System.out.println("3.3RD AC");
                System.out.println("4.SLEEPER");
                int choice = sc.nextInt();
                switch(choice){
                    case 1: 
                        c= "A1";
                        coach[i]=c;
                        count++;
                        count1++;
                        seat[i]=c+count1;
                        break;
                    case 2:
                        c="A2";
                        coach[i]=c;
                        count++;
                        count2++;
                        seat[i]=c+"-"+count2;
                        break;
                    case 3:
                        c="A3";
                        coach[i]=c;
                        count++;
                        count3++;
                        seat[i]=c+"-"+count3;
                        break;
                    case 4:
                        c="G";
                        coach[i]=c;
                        count++;
                        count4++;
                        seat[i]=c+"-"+count4;
                        break;
                    default:
                        System.out.println("invalid choice");
                }
            
                    if((source[i].equals("varanasi")&& to[i].equals("delhi"))|| source[i].equals("delhi")&& to[i].equals("varanasi")){
                         double pr= 900;
                        if(coach[i].equals("A1")){
                        fair[i]=pr+1900;
                        }
                        else if(coach[i].equals("A2")){
                            fair[i]=pr+1200;

                        }
                        else if(coach[i].equals("A3")){
                            fair[i]=pr+600;
                        }
                        else {
                            fair[i]=pr;
                        }

                    }
                    else if((source[i].equalsIgnoreCase("varanasi")&& to[i].equalsIgnoreCase("prayagraj"))|| source[i].equalsIgnoreCase("prayagraj")&& to[i].equalsIgnoreCase("varanasi")){
                     double pr= 400;
                        if(coach[i].equals("A1")){
                        fair[i]=pr+1900;
                        }
                        else if(coach[i].equals("A2")){
                            fair[i]=pr+1200;

                        }
                        else if(coach[i].equals("A3")){
                            fair[i]=pr+600;
                        }
                        else {
                            fair[i]=pr;
                        }

                    }
                    else if((source[i].equalsIgnoreCase("varanasi")&& to[i].equalsIgnoreCase("bengaluru"))|| source[i].equalsIgnoreCase("bengaluru")&& to[i].equalsIgnoreCase("varanasi")){
                      double pr= 1400;
                        if(coach[i].equals("A1")){
                        fair[i]=pr+1900;
                        }
                        else if(coach[i].equals("A2")){
                            fair[i]=pr+1200;

                        }
                        else if(coach[i].equals("A3")){
                            fair[i]=pr+600;
                        }
                        else {
                            fair[i]=pr;
                        }

                     }
                    else if((source[i].equalsIgnoreCase("delhi")&& to[i].equalsIgnoreCase("prayagraj"))|| source[i].equalsIgnoreCase("prayagraj")&& to[i].equalsIgnoreCase("delhi")){
                     double pr= 800;
                        if(coach[i].equals("A1")){
                        fair[i]=pr+1900;
                        }
                        else if(coach[i].equals("A2")){
                            fair[i]=pr+1200;

                        }
                        else if(coach[i].equals("A3")){
                            fair[i]=pr+600;
                        }
                        else {
                            fair[i]=pr;
                        }

                     }
                    else  if((source[i].equalsIgnoreCase("delhi")&& to[i].equalsIgnoreCase("bengaluru"))|| source[i].equalsIgnoreCase("bengaluru")&& to[i].equalsIgnoreCase("delhi")){
                     double pr= 1500;
                        if(coach[i].equals("A1")){
                        fair[i]=pr+1900;
                        }
                        else if(coach[i].equals("A2")){
                            fair[i]=pr+1200;

                        }
                        else if(coach[i].equals("A3")){
                            fair[i]=pr+600;
                        }
                        else {
                            fair[i]=pr;
                        }

                    }
                    else if((source[i].equalsIgnoreCase("prayagraj")&& to[i].equalsIgnoreCase("bengaluru"))|| source[i].equalsIgnoreCase("bengaluru")&& to[i].equalsIgnoreCase("prayagraj")){
                     double pr= 1400;
                        if(coach[i].equals("A1")){
                        fair[i]=pr+1900;
                        }
                        else if(coach[i].equals("A2")){
                            fair[i]=pr+1200;

                        }
                        else if(coach[i].equals("A3")){
                            fair[i]=pr+600;
                        }
                        else {
                            fair[i]=pr;
                        }

                    }
                    else {
                    System.out.println("enter a valid choice");

                    }
        }
    }


    public static void display(String[] id , String[] name, String[] source ,String[] to,String[] coach, String[] seat,double[] fair){
        System.out.printf("%-7s %-15s %-9s %-9s %-3s %-5s %-5s%n",
        "ID",
        "Name",
        "Source",
        "Destination",
        "Coach",
        "Seat",
        "Fare");
        System.out.println("\n");
        for(int i=0;i< id.length;i++)
        {
            if(fair[i]!=0)
            {
                System.out.printf("%-7s %-15s %-9s %-9s %-3s %-5s %-5.2f%n",
        id[i],
        name[i],
        source[i],
        to[i],
        coach[i],
        seat[i],
        fair[i]);
            }
        }
    }
    public static void cancel(String[] id , String[] name, String[] source ,String[] to,String[] coach, String[] seat,double[] fair, String s){
        int flag=0;
        int ct=0;
        for(int i=0; i<id.length;i++)
        {
            if(seat[i]!=null&&seat[i].equals(s))
            {

                ct=i;
                
                flag=1;
                break;
            }
            
        }
        
        if(flag==1){
            id[ct]=name[ct]=source[ct]=to[ct]=coach[ct]=seat[ct]="cancelled";
                fair[ct]=0;
            System.out.println("deleted");
        }
        else{
            System.out.println("not found");
        }
    }

    public static void main(String[] args) {
        System.out.println("\t\tTICKET BOOKING SYSTEM");
        Scanner sc= new Scanner(System.in);
        String[] id= new String[500];
        String[] name= new String[500];
        String[] source = new String[500];
        String[] to = new String[500];
        String [] coach = new String[500];
        String[] seat = new String[500];
        double fair[] = new double[500];
        int ch=0;
        while(ch!=4){
        System.out.println("Enter the choice no.");
        System.out.println("1.Book more ticket");
        System.out.println("2.Display your all booked tickets");
        System.out.println("3.Cancel ticket");
        System.out.println("4.exit\n");
        ch= sc.nextInt();
        switch(ch){
            case 1:
                book(id, name, source, to, coach, seat, fair);
                System.out.println("the tickets are booked\n");
                break;
            case 2:
                display(id, name, source, to, coach, seat, fair);
                break;

            case 3:
                sc.nextLine();
                System.out.println("enter the seat no. to be cancelled\n");
                String s= sc.nextLine();
                cancel(id, name, source, to, coach, seat, fair, s);
                System.out.println("the ticket is canceled\n");
                break;
            case 4:
                System.out.println("thanks ");
                break;
            
            default:
                System.out.println("enter the valid choice\n");
            
                
            }
        }
        
    }

}