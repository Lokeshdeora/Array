// array binary form ( 0 and 1 )

// 0 1 1 0 1 0 1 
// sort 
// 0 0 0 1 1 1 1    

import java.util.*;
public class SortZeroOne {
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void sortZeroandOne(int a[]) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (i < count) {
                a[i] = 0;
            } else {
                a[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sortZeroandOne(a);
        printArray(a);
    }
}