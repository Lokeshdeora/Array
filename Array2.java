import java.util.*;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter int size of array:");
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        System.out.println("enter array element:");
        a[i]=sc.nextInt();
        
    }
    for(int i=0;i<n;i++){
        System.out.println("output array"+a[i]+" ");
        System.out.println("--------------------");
    }
    System.out.println("enter char size of array:");
    int n1=sc.nextInt();
    char c[]=new char[n1];
    for(int i=0;i<n1;i++){
        System.out.println("enter array element:");
        c[i]=sc.next().charAt(0);
    }
    for(int i=0;i<n1;i++){
        System.out.println("output array:"+c[i]+" ");
        System.out.println("----------------");
    }
    System.out.println("enter byte size of array:");
    int n2=sc.nextInt();
    byte b[]=new byte[n2];
    for(int i=0;i<n2;i++){
        System.out.println("enter array element:");
        b[i]=sc.nextByte();
        
    }
    for(int i=0;i<n2;i++){
        System.out.println("output array"+b[i]+" ");
        System.out.println("--------------------");
    }
    System.out.println("enter short size of array:");
    int n3=sc.nextInt();
    short s[]=new short[n3];
    for(int i=0;i<n3;i++){
        System.out.println("enter array element:");
        s[i]=sc.nextShort();
        
    }
    for(int i=0;i<n3;i++){
        System.out.println("output array"+s[i]+" ");
        System.out.println("--------------------");
    }
    System.out.println("enter long size of array:");
    int n4=sc.nextInt();
    long l[]=new long[n4];
    for(int i=0;i<n4;i++){
        System.out.println("enter array element:");
        l[i]=sc.nextLong();
        
    }
    for(int i=0;i<n4;i++){
        System.out.println("output array"+l[i]+" ");
        System.out.println("--------------------");
    }
    System.out.println("enter int float of array:");
    int n5=sc.nextInt();
    float f[]=new float[n5];
    for(int i=0;i<n5;i++){
        System.out.println("enter array element:");
        f[i]=sc.nextFloat();
        
    }
    for(int i=0;i<n5;i++){
        System.out.println("output array"+f[i]+" ");
        System.out.println("--------------------");
    }
    System.out.println("enter int double of array:");
    int n6=sc.nextInt();
    double d[]=new double[n6];
    for(int i=0;i<n6;i++){
        System.out.println("enter array element:");
        d[i]=sc.nextDouble();
        
    }
    for(int i=0;i<n6;i++){
        System.out.println("output array"+d[i]+" ");
        System.out.println("--------------------");
    }
    System.out.println("enter byte size of array:");
    int n7=sc.nextInt();
    boolean bo[]=new boolean[n];
    for(int i=0;i<n7;i++){
        System.out.println("enter array element:");
        bo[i]=sc.nextBoolean();
        
    }
    for(int i=0;i<n7;i++){
        System.out.println("output array"+bo[i]+" ");
        System.out.println("--------------------");
    }
}
}

