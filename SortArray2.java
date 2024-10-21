// input :
// 0 1 2 

// 0 2 1 0 2 1 2 2 1 0 0 

// 0 0 0 0 1 1 1 2 2 2 2 

import java.util.Scanner;
public class SortArray2{
    public static void printArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void sortArray(int a[]){
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
                if(a[i]>a[j]){
                    swap(a,i,j);
                }
            }
        }
        printArray(a);
    }
    public static void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        sortArray(a);
    }
}