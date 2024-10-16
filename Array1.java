    import java.util.*;
    public class Array1 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("enter size of array: ");
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0;i<n;i++){
                System.out.print("Enter Array Element: ");
                a[i] = sc.nextInt();
            }
            System.out.println("First Element: "+a[0]);
            System.out.println("Last Element: "+a[a.length-1]);
            if(n%2==0){
                System.out.println("Middle Element: "+a[(a.length)/2-1]);
                System.out.println(a[a.length/2]);
            }
            else{
                System.out.println("Middle Element: "+a[a.length/2]);
            }
            System.out.println("---------------------------------");

            System.out.println("enter size of char array:");
            int x=sc.nextInt();
            char c[]=new char[x];
            for(int i=0;i<x;i++){
                System.out.print("enter array element :");
                c[i]=sc.next().charAt(0);
            }
            System.out.println("first element:"+c[0]);
            System.out.println("last element :"+c[c.length-1]);
            if (x%2==0) {
                System.out.println("middle element:"+c[(c.length)/2]);
                System.out.println(c[c.length/2]);
            }
            else{
                System.out.println("middle element"+c[(c.length)/2]);
            }
            System.out.println("----------------------");
            System.out.println("enetr size of short array");
            int y=sc.nextInt();
            short s[]=new short[y];
            for(int i=0;i<y;i++){
                System.out.println("enter array element:");
                s[i]=sc.nextShort();
            }       
                System.out.println("first element:" +s[0]);
                System.out.println("last element:"+s[s.length-1]);
                if (y%2==0) {
                    System.out.println("middle element:"+s[(s.length)/2-1]);
                    System.out.println(s[s.length/2]);
                }
                else{
                    System.out.println("midele element:"+s[(s.length)/2]);
                }
                System.out.println("------------------------");

                System.out.println("enetr size of long array");

                int z=sc.nextInt();
                long l[]=new long[z];
                for(int i=0;i<z;i++){
                    System.out.println("enter array element:");
                    l[i]=sc.nextLong();
                }
                
                System.out.println("first element:"+l[0]);
                System.out.println("last element:"+l[l.length-1]);
                if (z%2==0) {
                    System.out.println("middle element:"+l[(l.length)/2-1]);
                    System.out.println(l[l.length]/2);
                }
                else{
                    System.out.println("middle elemnet:"+l[(l.length)/2]);
                }
                System.out.println("------------------------");

                System.out.println("enetr size of float array");
                int t=sc.nextInt();
                float f[]=new float[t];
                for(int i=0;i<t;i++){
                    System.out.println("enter array element:");
                    f[i]=sc.nextFloat();
                }
                System.out.println("first element:"+f[0]);
                System.out.println("last element:"+f[f.length-1]);
                if (t%2==0) {
                    System.out.println("middle element:"+f[(f.length)/2-1]);
                    System.out.println(f[f.length]/2);
                }
                else{
                    System.out.println("middle elemnet:"+f[(f.length)/2]);
                }
                System.out.println("------------------------");

                System.out.println("enetr size of double array");
                int p=sc.nextInt();
                double d[]=new double[p];
                for(int i=0;i<p;i++){
                    System.out.println("enter array element:");
                    d[i]=sc.nextDouble();
                }
                System.out.println("first element:"+d[0]);
                System.out.println("last element:"+d[d.length-1]);
                if (p%2==0) {
                    System.out.println("middle element:"+d[(d.length)/2-1]);
                    System.out.println(d[d.length]/2);
                }
                else{
                    System.out.println("middle elemnet:"+d[(d.length)/2]);
                }
                System.out.println("------------------------");

                System.out.println("enetr size of byte array");
                int e=sc.nextInt();
                byte b[]=new byte[e];
                for(int i=0;i<e;i++){
                    System.out.println("enter array element:");
                    b[i]=sc.nextByte();
                }
                System.out.println("first element:"+b[0]);
                System.out.println("last element:"+b[b.length-1]);
                if (e%2==0) {
                    System.out.println("middle element:"+b[(b.length)/2-1]);
                    System.out.println(b[b.length]/2);
                }
                else{
                    System.out.println("middle elemnet:"+b[(b.length)/2]);
                }
                System.out.println("------------------------");

                System.out.println("enetr size of boolean array");
                int q=sc.nextInt();
                boolean v[]=new boolean[q];
                for(int i=0;i<q;i++){
                    System.out.println("enter array element:");
                    v[i]=sc.nextBoolean();
                }
                System.out.println("first element:"+v[0]);
                System.out.println("last element:"+v[v.length-1]);
                if (q%2==0) {
                    System.out.println("middle element:"+v[(v.length)/2-1]);
                    
                
                }
                else{
                    System.out.println("middle elemnet:"+v[(v.length)/2]);
                }
                System.out.println("------------------------");
            }

        }

