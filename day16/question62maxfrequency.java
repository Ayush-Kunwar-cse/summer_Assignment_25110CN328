import java.util.*;

public class question62maxfrequency {
    
    public static void max(int [] arr){
        int max=arr[0];
        int dcount=1;// checks the occurence of each element
        int maxcount=0;// holds the maximum frequemcy

        int maxelement=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if( arr[i]==arr[j])
                {
                    dcount=dcount+1;
                }
            }
            if (maxcount<dcount)
            {
                maxcount =dcount;
                maxelement=arr[i];
            }
            dcount=1;

        }
        System.out.println("the maximum frequency element is "+maxelement+" with frequency of "+maxcount);
    }

    
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1));
            arr[i] = sc.nextInt();
        }

        max(arr);

    }
}