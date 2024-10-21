// a[]
// b[] 

// maximum 
// maximum 
// which one array is maximum 


public class MinimumArray {
    public static void unique(int a[],int b[]){
        int x=a[0];
        int y=b[0];
        for(int i=0;i<a.length;i++){
            if (x<a[i]) {
                x=a[i];
            }
        }
        for(int i=0;i<b.length;i++){
            if (y<b[i]) {
                y=b[i];
            }
        }
        if (x>y) {
            System.out.println("A array is greater");
        }
        else{
            System.out.println("B array is greater");
        }
    }
    public static void main(String[] args) {
        int a[]={2,3,5,6};
        int b[]={5,8,9,7,};
        unique(a,b);
    }
}
