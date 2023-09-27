package Array;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int [] twoSum( int [] nums, int target){
        HashMap <Integer, Integer> map = new HashMap<>();
        for ( int i=0; i< nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int [] {map.get(target - nums[i]),i};
            }
            map.put(nums[i], i);
        }
        return new int []{};
    }
    public static void main(String[] args) {
    int [] arr = {2,7,11,15};
    System.out.println(Arrays.toString(twoSum(arr, 9)));
    }
}

//brute force
// for( int i=0; i<numbers.length; i++){
//        for( int j=0; j<numbers.length; j++){
//        if(numbers[i] + numbers[j] == target){
//        return new int [] {numbers[i], numbers[j]};
//        }
//        }
//        }
//
//        return null;
