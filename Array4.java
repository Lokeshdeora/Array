
import java.util.*;
public class Array4 {
   public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);

    System.out.println("enter a size of array:");

    int n=sc.nextInt(); //

    int a[]=new int[n];

    // taking 
    for(int i=0;i<n;i++){
        System.out.println("enter elemnet:");
        a[i]=sc.nextInt();
    }  
    int sum=0;
    for(int i=0;i<n;i++){
        if (a[i]%2==0) 
        {
            sum+=a[i]; 
        }
    } 
    System.out.println("sum of even number:"+sum);
   }
}