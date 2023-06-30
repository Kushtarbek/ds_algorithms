package Sort;

public class CountSort {
//    public static void main(String[] args) {
//
//    }
public int[] smallerNumbersThanCurrent(int[] nums) {
    int [] count = new int[101];
    int [] sum = new int[101];
    int N = nums.length;
    for (int num : nums) {
        count[num]++;
    }
    for( int i=1; i<101; i++){
        sum[i] = count[i-1] + sum[i-1];
    }
    for( int i=0; i<N; i++){
        nums[i] = sum[nums[i]];
    }
    return nums;
}
}

/*
Explanation:
step 1. count[] array for number counting of given array, sum[] array to store sum count upto any specific number(array length is 100 as range is given 0<=nums<=100)
step 2. traverse given array and update count of each number.
step3. traverse 0 to 100 and update sum count of each number
eg:
sum[3] = sum[2]+count[2](as sum of two does n't include count of 2).
step4. return sum count based on your given input array.
TC=O(n)
SC= O(n)+O(n) = O(n)
*/
