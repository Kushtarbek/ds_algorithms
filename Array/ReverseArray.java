package Array;

public class ReverseArray {
    public static void reverse(int[] nums) {
        int firstZero = 0;
        for( int i=0; i< nums.length; i++){
            if(nums[i] !=0){
                swap(firstZero, i, nums);
                firstZero++;
            }
        }
    }

    private static void swap( int index1, int index2, int [] numbers){
        int val2 = numbers[index2];
        numbers[index2] = numbers[index1];
        numbers[index1] = val2;
    }

}
