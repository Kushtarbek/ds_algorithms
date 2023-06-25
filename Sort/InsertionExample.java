package Sort;

/**
 * . Each item is immediately determined to be in its proper place in the array, and the total running time is linear.
 * (The running time of selection sort is quadratic for such an array.) The same is true
 * for arrays whose keys are all equal (hence the condition in Proposition B that the keys must be distinct).
 */
public class InsertionExample {
    public static void sort( Comparable[] a){
        int N = a.length;
        for(int i = 1; i < N; i++){
            for( int j = i; j > 0 && less(a[j], a[j-1]); j--){
                exch(a, j, j-1);
            }
        }
    }
    public static void main(String[] args) {

    }
}

/*
  Typical examples of partially sorted arrays are the following:
       ■ An array where each entry is not far from its final position
       ■ A small array appended to a large sorted array
       ■ An array with only a few entries that are not in place
  Insertion sort is an efficient method for such arrays; selection sort is not. Indeed, when
  the number of inversions is low, insertion sort is likely to be faster than any sorting method.
 */
