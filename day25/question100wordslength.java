import java.util.*;
class question100wordslength {
    public static void sort(String[]arr){
        String temp=" ";
        for(int i=0;i<arr.length-1;i++)
        {

            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j].length()>arr[j+1].length() ){
                    temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                
                }
            
            }
            System.out.println("the sorted array is "); 

            for(int i=0;i<arr.length;i++)
            {
               System.out.print(arr[i]+" ");
            }
        }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of names to be entered");
        int n= sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n];
        System.out.println("enter the names");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }
        sort(arr);
    }
}