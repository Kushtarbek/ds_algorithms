package TwoPointers;

import java.util.HashSet;

public class ContainDuplicates {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //     for( int i=0; i<nums.length; i++){
        //         for( int j=i+1; j<nums.length && j<=i+k; j++){
        //             if(nums[j] == nums[i])
        //                 return true;

        //     }
        // }
        //     return false;


        if (nums == null || k < 0) {
            throw new IllegalArgumentException("Input array is null");
        }
        if (nums.length <= 1 || k == 0) {
            return false;
        }

        HashSet<Integer> window = new HashSet<>();
        for( int i=0; i<nums.length; i++){
            if(i > k){
                window.remove(nums[i - k - 1]);
            }
            if(!window.add(nums[i])){
                return true;
            }
        }
        return false;
    }

}
