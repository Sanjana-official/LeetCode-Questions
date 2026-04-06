class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Arrays.sort(nums);
        int nidx=0,idx=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<target)
            {
                nidx++;
            }
            else if(nums[i]==target)
            {
                idx++;
            }
        }
        for(int i=0;i<idx;i++)
        {
            list.add(nidx++);
        }
        return list;

    }
}

//https://leetcode.com/problems/find-target-indices-after-sorting-array/solutions/1600903/concisesimple-beats-100-explained-both-o-4070

//understood the optimized version from his explanation
