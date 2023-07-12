package HashMap;

import java.util.Arrays;
import java.util.HashSet;

public class Intersection {
    public static int[] intersectionOfTwoArr( int [] nums1, int [] nums2){
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> inter = new HashSet<>();

        for (int j : nums1) {
            seen.add(j);
        }

        for (int j : nums2) {
            if (seen.contains(j)) {
                inter.add(j);
            }
        }
        int n = inter.size();
        int[] arr = new int[n];

        int i=0;
        for(int x : inter)
            arr[i++] = x;
        return arr;
    }
    public static void main(String[] args) {
    int [] nums1 = {1,2,2,1};
    int [] nums2 = {2,2};
        System.out.println(Arrays.toString(intersectionOfTwoArr(nums1, nums2)));
    }
}
