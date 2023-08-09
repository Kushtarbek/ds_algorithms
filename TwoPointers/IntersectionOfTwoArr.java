package TwoPointers;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArr {
   public int[] intersection( int[] nums1, int[] nums2){
       Arrays.sort(nums1);
       Arrays.sort(nums2);

       int n = nums1.length;
       int m = nums2.length;

       HashSet<Integer> resSet = new HashSet<>();

       int i =0, j = 0;
       while(i < n && j < m){
           if(nums1[i] < nums2[j]){
               i++;
           } else if( nums1[i] > nums2[j]){
               j++;
           } else if( nums1[i] == nums2[j]){
               resSet.add(nums1[i]);
               i++;
               j++;
           }
       }

       int[] finalRes = new int[resSet.size()];
       int index = 0;
       for( int value : resSet){
           finalRes[index++] = value;
       }
       return finalRes;
   }
}
