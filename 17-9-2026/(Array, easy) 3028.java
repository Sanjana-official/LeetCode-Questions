class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int zero = 0;
        for(int i=1; i<nums.length; i++){
            nums[i]+=nums[i-1];
            if(nums[i]==0){
                zero++;
            }
        }
        return zero;
    }
}
