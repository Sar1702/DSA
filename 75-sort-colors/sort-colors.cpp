class Solution {
public:
    void sortColors(vector<int>& nums) {
        int n = nums.size();
        int zerocount = 0 , onecount = 0 , twocount = 0;
        for(int i = 0 ; i<n;i++){
            if (nums[i]==0) zerocount++;
             if (nums[i]==1) onecount++;
              if (nums[i]==2) twocount++;
        }
       int index = 0 ;
       while(zerocount--){
        nums[index++]=0;
       }
       while(onecount--){
        nums[index++]=1;
       }
       while(twocount--){
        nums[index++]=2;
       }
        }
        
    
};