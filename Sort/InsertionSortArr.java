package Sort;

public class InsertionSortArr {

    /*
    Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time.
     It's less performant than advanced sorting algorithms, but it can still have some advantages:
     it's really easy to implement and it's efficient on small data structures almost sorted.

    The algorithm divides the data structure in two sublists: a sorted one, and one still to sort.
    Initially, the sorted sublist is made up of just one element and it gets progressively filled.
    For every iteration, the algorithm picks an element on the unsorted sublist and inserts it at
    the right place in the sorted sublist. It's available in several variants such as Gnome Sort.
     */

    //Avg: O(n2)
    //Worst: O(n2)
    //sc: O(1)
    void insertionSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {

    }
}
