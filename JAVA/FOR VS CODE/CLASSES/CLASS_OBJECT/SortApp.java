/*  WAP to create the class name as Sort with two functions name as 
    acceptArray() ,beforeSort(),performSort(),afterSort()
 */

package CLASS_OBJECT;

import java.util.*;

class Sort {
    int arr[];

    void acceptArray(int a[]) {
        arr = a;
    }

    void beforeSort() {
        System.out.println("The before Sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("a[%d] --->%d\n", i, arr[i]);
        }
    }

    void performSort() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = (i + 1); j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void afterSort() {
        System.out.println("After Sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] --->%d\n", i, arr[i]);
        }
    }
}

public class SortApp {
    public static void main(String x[]) {
        int a[] = new int[6];
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter the six subject marks");
        for (int i = 0; i < a.length; i++) {
            a[i] = xyz.nextInt();
        }
        Sort s = new Sort();
        s.acceptArray(a);
        s.beforeSort();
        s.performSort();
        s.afterSort();
    }
}