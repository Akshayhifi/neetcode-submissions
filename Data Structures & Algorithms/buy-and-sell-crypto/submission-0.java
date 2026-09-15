class Solution {
    public int maxProfit(int[] prices) {
        int minprice=prices[0];
        int max=0;

        for(int price:prices){
            if(price<minprice){
                minprice=price;
            }

            int profit=price-minprice;

            if(profit>max){
                max=profit;
            }
        }
        return max;
    }
}
