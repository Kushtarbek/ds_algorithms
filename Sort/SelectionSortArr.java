package Sort;

import java.util.Arrays;


/*
Selection Sort is an iterative and in-place sorting algorithm that
divides the data structure in two sublists: the ordered one, and the
unordered one. The algorithm loops for all the elements of the data
structure and for every cycle picks the smallest element of the
unordered sublist and adds it to the sorted sublist, progressively filling it.

It's a really simple and intuitive algorithm that does not require
additional memory, but it's not really efficient on big data structures
 due to its quadratic time complexity.

This algorithm has been upgraded and enhanced in several variants such as Heap Sort.
 */
//Average complexity: O(n2)
//Worst Case: O(n2)
//Space Complexity: O(1)

public class SelectionSortArr {
    public static void sortArr( int  [] arr){
        int n = arr.length;

        for( int i=0; i< n-1; i++){
            int minIdx = i;

            for( int j=i+1; j< n; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12, 3};

        sortArr(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));


    }
}
