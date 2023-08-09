package TwoPointers;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArr {

   public static int[] intersection(int[] nums1, int[] nums2){
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

// HashSet<Integer> seen = new HashSet<>();
// HashSet<Integer> inter = new HashSet<>();

// for (int i=0; i< nums1.length; i++ ) {
//     if(!seen.contains(nums1[i])){
//         seen.add(nums1[i]);
//     }
// }

// for (int i=0; i < nums2.length; i++) {
//     if(seen.contains(nums2[i])){
//         inter.add(nums2[i]);
//     }
// }
// int n = inter.size();
// int arr[] = new int[n];

// int i=0;
// for(int x : inter)
//     arr[i++] = x;
// return arr;
