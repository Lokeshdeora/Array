// array user input :Armstrong number remove 
import java.util.*;
public class PalindroneNumberRemove {
    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            int ans=0,x=a[i];
            while(x>0){
                int p=x%10;
                ans=ans*10+p;
                x/=10;
            }
            if (ans!=a[i]) {
                System.out.print(a[i]+" ");
            }
        }
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of arry:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        printArray(a);
    }
}
