package Array;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        //Find the maximum of the array values
        double max = a[0];
        for( int i =1; i<a.length; i++){
            if(a[i] > max) max = a[i];
        }


        //Compute the average of the array values
        int N = a.length;
        double sum = 0.0;
        for( int i =0; i<N; i++){
            sum+= a[i];
        }
        double average = sum/N;


        //Copy to another array
        int N1 = a.length;
        double[] b = new double[N1];
        for( int i=0; i<N1; i++){
            b[i] = a[i];
        }


        //Reverse the elements within an array
//        int N2 = a.length;
//        for( int i=0; i<N2 /2; i++){
//            double temp = a[i];
//            a[i] = a[N2-1-i];
//            a[N2-i-1] = (int) temp;
//        }

    }
    //Reverse the elements within an array
    private static int reverseArray(int[] arr, int start, int end){
//        if( start > end){
//            return;
//        }else{
//            int temp;
//            temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            reverseArray(arr, start +1, end -1);
//        }
        //Reverse array with while loop
        private static void reverseArray(int[] a){
            int i = 0, j = a.length, temp;
            while (i < j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }

        }


            public int reverse(int x) {
                int rev = 0;
                while (x != 0) {
                    int pop = x % 10;
                    x /= 10;
                    if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
                    if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
                    rev = rev * 10 + pop;
                }
                return rev;
        }
    }
}
