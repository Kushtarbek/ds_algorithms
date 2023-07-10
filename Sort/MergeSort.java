//package Sort;
///*
//Merge Sort is a stable comparison sort algorithm with exceptional performance.
//Merge Sort uses the merging method and performs at
//O(n log (n)) in the best, average, and worst case.
// */
//
//public class MergeSort {
//    public static void main(String[] args) {
//        int[]     array  = {12, 11, 15, 10, 9, 1, 2, 3, 13, 14, 4, 5, 6, 7, 8};
//        MergeSort sorter = new MergeSort();
//        sorter.mergeSort(array, 0, array.length - 1);
//        System.out.println(java.util.Arrays.toString(array));
//    }
//    public static void mergeSort(int arr [], int start, int end){
//        if( start < end){
//            int mid = (start + end)/2;
//            mergeSort(arr, start, mid);
//            mergeSort(arr, mid, end);
//
//            merge(arr, start, mid, end);
//        }
//    }
//
//    public static void merge(int[] array, int start, int mid, int end){
//        int [] leftArr = new int [mid - start+1];
//        int [] rightArr = new int [end - mid];
//
//        for( int i=0; i<leftArr.length; i++){
//            leftArr[i] = array[start + i];
//        }
//        for (int i = 0; i < rightArr.length; ++i){
//            rightArr[i] = array[mid + 1 + i];
//        }
//        int leftIndex = 0, rightIndex = 0;
//
//        // the index we will start at when adding the subarrays back into the main array
//        int currentIndex = start;
//
//        // compare each index of the subarrays adding the lowest value to the currentIndex
//        while (leftIndex < leftArr.length && rightIndex < rightArr.length)
//        {
//            if (leftArr[leftIndex] <= rightArr[rightIndex])
//            {
//                array[currentIndex] = leftArr[leftIndex];
//                leftIndex++;
//            }
//            else
//            {
//                array[currentIndex] = rightArr[rightIndex];
//                rightIndex++;
//            }
//            currentIndex++;
//        }
//
//        // copy remaining elements of leftArray[] if any
//        while (leftIndex < leftArr.length) array[currentIndex++] = leftArr[leftIndex++];
//
//        // copy remaining elements of rightArray[] if any
//        while (rightIndex < rightArr.length) array[currentIndex++] = rightArr[rightIndex++];
//    }
//}

class MergeSort {
    public static void main(String[] args)
    {
        int[]     array  = {12, 11, 15, 10, 9, 1, 2, 3, 13, 14, 4, 5, 6, 7, 8};
        MergeSort sorter = new MergeSort();
        sorter.mergeSort(array, 0, array.length - 1);
        System.out.println(java.util.Arrays.toString(array));
    }

    // main function that sorts array[start..end] using merge()
    void mergeSort(int[] array, int start, int end)
    {
        // base case
        if (start < end)
        {
            // find the middle point
            int middle = (start + end) / 2;

            mergeSort(array, start, middle); // sort first half
            mergeSort(array, middle + 1, end);  // sort second half

            // merge the sorted halves
            merge(array, start, middle, end);
        }
    }

    // merges two subarrays of array[].
    void merge(int[] array, int start, int middle, int end)
    {
        int[] leftArray  = new int[middle - start + 1];
        int[] rightArray = new int[end - middle];

        // fill in left array
        for (int i = 0; i < leftArray.length; ++i)
            leftArray[i] = array[start + i];

        // fill in right array
        for (int i = 0; i < rightArray.length; ++i)
            rightArray[i] = array[middle + 1 + i];

        /* Merge the temp arrays */

        // initial indexes of first and second subarrays
        int leftIndex = 0, rightIndex = 0;

        // the index we will start at when adding the subarrays back into the main array
        int currentIndex = start;

        // compare each index of the subarrays adding the lowest value to the currentIndex
        while (leftIndex < leftArray.length && rightIndex < rightArray.length)
        {
            if (leftArray[leftIndex] <= rightArray[rightIndex])
            {
                array[currentIndex] = leftArray[leftIndex];
                leftIndex++;
            }
            else
            {
                array[currentIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            currentIndex++;
        }

        // copy remaining elements of leftArray[] if any
        while (leftIndex < leftArray.length) array[currentIndex++] = leftArray[leftIndex++];

        // copy remaining elements of rightArray[] if any
        while (rightIndex < rightArray.length) array[currentIndex++] = rightArray[rightIndex++];
    }
}
