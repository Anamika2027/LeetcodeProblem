class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int bestDay=prices[0], maxProfit=0;
        for(int i=0;i<prices.size();i++){
            if(prices[i]>bestDay){
                maxProfit=max(maxProfit,prices[i]-bestDay);
            }
            bestDay=min(bestDay,prices[i]);
        }
        return maxProfit;
    }
};