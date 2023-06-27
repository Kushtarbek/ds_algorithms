package Sort;

import java.util.Arrays;

public class SelectionSortArr {
    public static void sortArr( int  [] arr){
        int n = arr.length;

        for( int i=0; i< n-1; i++){
            int minValue = i;

            for( int j=i+1; j< n; j++){
                if(arr[j] < arr[minValue]){
                    minValue = j;
                }
            }
            int temp = arr[minValue];
            arr[minValue] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12, 3};

        sortArr(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));


    }
}
