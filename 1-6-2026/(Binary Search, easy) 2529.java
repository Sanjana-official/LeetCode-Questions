class Solution {
    public int maximumCount(int[] nums) {

        int lastNeg = -1;
        int start = 0, end = nums.length - 1;

        // Find last negative
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] < 0){
                lastNeg = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        int firstPos = nums.length;
        start = 0;
        end = nums.length - 1;

        // Find first positive
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] > 0){
                firstPos = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        int neg = lastNeg + 1;
        int pos = nums.length - firstPos;

        return Math.max(neg, pos);
    }
}
