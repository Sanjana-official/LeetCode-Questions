class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int prefixsum[] = new int[nums.length];
        prefixsum[0] = nums[0];

        for(int i=1;i<nums.length;i++)
        {
            prefixsum[i] = prefixsum[i-1]+nums[i];
        }

        double maxave = ((1.0*prefixsum[k-1])/k);

        for(int i = k ;i < nums.length ; i++)
        {
            double ave =(((1.0*prefixsum[i])-prefixsum[i-k])/k);
            maxave = Math.max(ave,maxave);
        }

        return maxave;
    }
}
