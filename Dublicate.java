public class Dublicate {
    public static void main(String[] args) {
        int a[]={1,1,2,2,3};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
            
               // a[i]=-1;
                a[j]=-1;
                if (a[i]>0) {
                    System.out.println(a[i]);
                }

                
        }
    }
}
}
