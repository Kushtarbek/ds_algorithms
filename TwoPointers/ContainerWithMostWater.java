package TwoPointers;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max = 0;
        while(l< r ){
            int w = r - l;
            int h =  Math.min(height[l], height[r]);
            int area  = h * w;
            max = Math.max(max, area);
            if(height[l] < height[r]){
                l++;
            }else if(height[l] > height[r]){
                r--;
            }else{
                l++;
                r--;
            }
        }
        return max;
    }
}

/*
Time complexity: O(N)
Space complexity: O(1)
*/

//    public int maxArea(int[] H) {
//        int ans = 0, i = 0, j = H.length-1, res = 0;
//        while (i < j) {
//            if (H[i] <= H[j]) {
//                res = H[i] * (j - i);
//                i++;
//            } else {
//                res = H[j] * (j - i);
//                j--;
//            }
//            if (res > ans) ans = res;
//        }
//        return ans;
//    }
