class Solution {
    public int absDifference(int[] nums, int k) {
        int l = nums.length;
        Arrays.sort(nums);
        int sSum = 0, lSum = 0;
        for (int i = 0; i < k; i++) {
            sSum += nums[i];           
            lSum += nums[l - 1 - i];   
        }
        return Math.abs(lSum - sSum);
    }
}
