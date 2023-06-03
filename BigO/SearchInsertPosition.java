package BigO;

public class SearchInsertPosition {
//    public static void main(String[] args) {
//
//    }
    public int searchInsertPosition( int[] nums, int target){
        int lo = 0;
        int hi = nums.length - 1;
        while( lo <= hi){
            int mid = lo + (hi - lo) /2;
            if( target == nums[mid]){
                return mid;
            }else if( target < nums[mid]){
                hi = mid - 1;
            }else if( target > nums[mid]){
                lo = mid+1;
            }
        }
        return lo;

        /***
         * int len = nums.length;
         * int ind = 0;
         * while( ind < len && nums[ind] < target) {
         *     ind++;
         * }
         * return ind;
         */

    }
}
