package Array;

public class ResizingArray {
    public static void main(String[] args) {


    }
    private void resize( int max){
        Item[] temp = (Item[]) new Object[max];
        for( int i=0; i< N; i++){
            temp[i] = a[i];
        }
        a = temp;
    }

    public void push(String item){
        if( N == a.length) resize(2*a.length);
        a[N++] = item;
    }

    public String pop(){
        String item = a[--N];
        a[N] = null;
        if(N > 0 && N == a.length/4) resize(a.length/2);
        return item;
    }
}
