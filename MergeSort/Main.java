package MergeSort;

public class Main {
    public static void main(String[] args) {
        // merge sort = recursively divide arr in 2, sort, re-combine
        // run-time complexity = O(n log n)
        // space complexity    = O(n)
        int [] array = {8,2,5,3,4,7,6,1};
        mergeSort(array);
        for(int i=0; i< array.length; i++){
            System.out.println(array[i]+" ");
        }
    }


    public static void mergeSort( int [] array){
        int length = array.length;
        if(length <= 1) return; //base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; //left array
        int j = 0; //right array

        for (; i< length; i++ ) {
            if( i < middle){
                leftArray[i] = array[i];
            }else{
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge( int [] leftArr, int [] rightArr, int [] array){
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i=0, l = 0, r = 0; //indices

        //check the conditions for merging
        while( l < leftSize && r < rightSize) {
            if(leftArr[l] < rightArr[r]){
                array[i] = leftArr[l]; // if num on left is not smaller than the right we need to copy
                i++;                   // element in the right array to out original array
                l++;
            }else{
                array[i] = rightArr[r];
                i++;
                r++;
            }
        }

        while( l < leftSize){
            array[i] = leftArr[l];
            i++;
            l++;
        }
        while( r < rightSize){
            array[i] = rightArr[r];
            i++;
            r++;
        }
    }
}
