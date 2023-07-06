package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class intersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int [] res = {};
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i =0, j=0;
        while( i< nums1.length && j<nums2.length ){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if( nums1[i] > nums2[j]){
                j++;
            }
            else {
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }

        int [] output = new int[arr.size()];
        int k = 0;
        while(k < arr.size()){
            output[k] = arr.get(k);
            k++;
        }
        return output;
    }
    public static void main(String[] args) {

    }
}
