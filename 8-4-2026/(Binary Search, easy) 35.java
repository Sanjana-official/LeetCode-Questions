class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end= nums.length-1, mid=0;
        while(start<=end)
        {
            mid = start + (end - start) / 2;

            if(target == nums[mid])
            {
                return mid;
            }
            else if(target>nums[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return (target>nums[mid]) ? mid+1 : mid; 
    }
}

// https://leetcode.com/problems/search-insert-position/solutions/7642685/best-optimal-solution-olog-n-beats-100-j-2qna
// approach explanation
