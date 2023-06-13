package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDiffOfArrays {
    List<Integer> getElementsOnlyInFirstList(int[] nums1, int[] nums2) {
        Set<Integer> onlyInNums1 = new HashSet<>();

        // Iterate over each element in the list nums1.
        for (int num : nums1) {
            boolean existInNums2 = false;
            // Check if num is present in the second arg nums2.
            for (int x : nums2) {
                if (x == num) {
                    existInNums2 = true;
                    break;
                }
            }

            if (!existInNums2) {
                onlyInNums1.add(num);
            }
        }


        return new ArrayList<>(onlyInNums1);
    }
    public List<List<Integer>> findDifference( int [] nums1, int [] nums2){
        return Arrays.asList(getElementsOnlyInFirstList( nums1, nums2),
                getElementsOnlyInFirstList(nums2, nums1));
    }


}
