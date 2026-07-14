class Solution {
public:
    int maxSubArray(vector<int>& arr) {
        int cursum =0, maxsum = INT_MIN;

        for(int val: arr ){
            cursum += val;
            maxsum = max(cursum, maxsum);
            if(cursum <0) cursum =0;
        }
        return maxsum;
        
    }
};