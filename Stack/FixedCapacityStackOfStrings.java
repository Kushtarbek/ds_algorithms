package Stack;

public class FixedCapacityStackOfStrings {
    private String [] s;
    private int N = 0;

    public FixedCapacityStackOfStrings( int capacity){
        s = new String[capacity];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public void push(String item){
        s[N++] = item;
    }

    public String pop(){
        return s[--N];
    }
    public static void main(String[] args) {

    }
}
//Defect in using an array - you have to declare the size of array ahead of time
//Stack has certain capacity and if there more capacity added you have to deal with it.
//if array is full, create a new array of twice the size, and copy items.

/**
 * public ResizingArrayStack(){
 *     s = new String[1];
 * }
 * public void push(String item){
 *     if(N == s.length); resize(2 * s.length);
 *     s[N++] = item;
 * }
 *
 * private void resize( int capacity){
 *     String[] copy = new String[capacity];
 *     for( int i=0; i<N; i++){
 *         copy[i] = s[i];
 *     }
 *     s = copy;
 * }
 *
 * */
