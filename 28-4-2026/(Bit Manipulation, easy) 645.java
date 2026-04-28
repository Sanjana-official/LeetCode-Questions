class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int ans[]= new int[2];

        //repeated number
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                ans[0]=nums[i];
            }
        }

        //missing number
        for(int i = 1; i <= nums.length; i++) {
            boolean found = false;
            for(int num : nums) {
                if(num == i) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                ans[1] = i;
                break;
            }
        }

        return ans;
    }
}
