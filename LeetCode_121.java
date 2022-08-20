/*
Best time to sell stocks
space : O(1)
runtime : O(n)
*/
public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int res=0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > res)
                res = prices[i] - minprice;
        }
        return res;
  }
