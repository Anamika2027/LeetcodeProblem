class Solution {
public:
    int maxArea(vector<int>& height) {
        int maxWater=0, lp=0,rp= height.size()-1;
        while(lp<rp){
            int width=rp-lp;
            int ht=min(height[lp],height[rp]);
            int currWater=width*ht;
            maxWater=max(currWater,maxWater);
            height[lp]>height[rp]?rp--:lp++;
        }
        return maxWater;
    }
};