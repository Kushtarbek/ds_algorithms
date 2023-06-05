package Array;

public class PrefixSum {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] answer = new int[n];
        for( int i=0; i< n; i++){
            answer[i] =1;
        }
        int p = 1;
        for( int i =0; i< n; i++){
            answer[i] *= p;
            p *= nums[i];
        }

        int s = 1;
        for( int i = n-1; i >= 0; i--){
            answer[i] *= s;
            s *= nums[i];
        }
        return answer;
    }
//    public static void main(String[] args) {
//
//    }


}
