package TwoPointers;

import java.util.HashSet;

public class ArithmeticTriplets {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int i = 0;
        int j = 1;
        int count = 0;
        while(i<=j&&j<nums.length){
            if(nums[j]-nums[i]<diff){
                System.out.println("diff< "+nums[i]+"-"+nums[j]);
                j++;
            }else if(nums[j]-nums[i]>diff){
                i++;
            }else{
                if(set.contains(nums[j]+diff)){
                    count++;
                }
                i++;
                j++;
            }

        }
        return count;
    }
}
