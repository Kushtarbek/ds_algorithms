package Array;

public class buildArrayLC1920 {
    public static int [] buildArr( int [] nums){
        int[] ans = new int[nums.length];
        for( int i =0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
