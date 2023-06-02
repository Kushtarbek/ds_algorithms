package BigO;
//time: O(/x)
//extra sp.com: O(1)

public class SqrtX {
//    public static void main(String[] args) {
//
//    }
    public int mySqrt(int x ) {
        int i = 0;
        while((long) i*i <= x) {
            i++;
        }
        return i - 1;
    }

    public int mySqrt(int x){
        
    }
}
