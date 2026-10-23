class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int result=nums[nums.length-1];
        int index=1;
        for(int i=0;i<nums.length-2;i=i+2)
        {
            
            if(nums[nums.length-1]!=nums[nums.length-2])
            {
                result=nums[nums.length-1];
                break;
            }
            if(nums[i]==nums[index] )
            {
                System.out.println("i="+i+",index="+index);
                index=i+3;
            }
            else 
            {
                 result=nums[i];
                 break;
            }
        }
        return result;
    }
}
