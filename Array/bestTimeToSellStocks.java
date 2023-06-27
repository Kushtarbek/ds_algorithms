package Array;

public class bestTimeToSellStocks {
    public static int maxProfit(int[] prices)
    {
        int res = 0;
        for(int i =1; i< prices.length; i++){
            if(prices[i] - prices[i-1] > 0){
                res += prices[i] - prices[i-1];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int [] prs = {7,1,5,3,6,4};
        System.out.println(maxProfit(prs));
    }
}
