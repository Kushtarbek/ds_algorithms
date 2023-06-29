package BigO;

public class fibonacciNums {
    public int climbStairs(int n) {
        if( n == 1) return 1;

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        for( int i=3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {

    }
}

/*
if(n==1){
    return 1;
}
        if(n==2){
        return 2;
        }

        int cur = 0;
        int prev1 = 2;
        int prev2 = 1;
        for(int i=3; i<=n; i++){
            cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }
        return cur;
*/

