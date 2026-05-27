class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int temp1[] = new int[n/2];
        int temp2[] = new int[n/2];
         int p = 0;
        int neg = 0;

        for(int i = 0 ;  i < n ; i++){
            if(nums[i] > 0){
                temp1[p++] = nums[i];
            }
            else{ 
                temp2[neg++] = nums[i];
            }
        }
        int ans[] = new int[n];
        int posindex = 0 ;
        int negindex = 1 ;
        for(int i = 0 ; i< n/2;i++){
            ans[posindex] = temp1[i];
            ans[negindex] = temp2[i];

            posindex += 2;
            negindex += 2;
        }

        return ans;

    }
}