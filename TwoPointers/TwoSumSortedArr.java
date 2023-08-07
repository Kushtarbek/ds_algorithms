package TwoPointers;

public class TwoSumSortedArr {
    public static void main(String[] args) {
    int[] nums = {1, 2, 4, 6, 8, 9, 14, 15};
    int target = 13;
        System.out.println(checkForTarget(nums, target));
    }
    public static boolean checkForTarget(int [] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int curr = (arr[left] + arr[right]);
            if(curr == target){
                return true;
            }
            if(curr > target){
                right--;
            }else {
                left++;
            }

        }
        return false;
    }
}
