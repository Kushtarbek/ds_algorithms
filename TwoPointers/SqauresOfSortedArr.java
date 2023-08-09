package TwoPointers;

public class SqauresOfSortedArr {
    public int[] sortedSquares(int[] nums) {
        int i=0; int j= nums.length-1;
        int [] res = new int[nums.length];
        for( int c = nums.length-1; c >= 0; c--){
            if( Math.abs(nums[i]) > Math.abs(nums[j])){
                res[c] = nums[i] * nums[i];
                i++;
            }else{
                res[c] = nums[j] * nums[j];
                j--;
            }
        }
        return res;
    }
}
