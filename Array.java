import java.util.*;
public class Array {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of array:");
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        System.out.println("enter element:");
        a[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=a[i];
    }
    System.out.println("sum of elements is:"+sum);
    
}
}