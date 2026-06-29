class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] ans  =  new int[queries.length];

        int[] preSum = new int[nums.length];
        preSum[0] =nums[0];

        for(int i = 1; i < nums.length ; i++){
            preSum[i]+=nums[i]+preSum[i-1];
        }
        
        for(int i = 0 ; i  < queries.length ; i++){
            int target = queries[i];
            int left= 0  , right = preSum.length-1;
            int count = 0 ; 


            while (left<= right) {
                int mid = left + (right-left)/2;
                if(preSum[mid]<= target){
                    count = mid+1;
                    left = mid+1;



                }
                else right = mid-1;
                
            }
            ans[i] = count;


        }


        return ans;
        
        
    }
}
