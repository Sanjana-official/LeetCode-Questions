class Solution {
    public int[] shuffle(int[] nums, int n) {
          int ans[] = new int[2*n];
          int count=1;

          //x
          ans[0]=nums[0];
          for(int i=2;i<=nums.length-2;i=i+2)
          {
            ans[i]=nums[count];
            count++;
          }

          for(int i=1;i<nums.length;i=i+2)
          {
            ans[i]=nums[n];
            n++;
          }

          return ans;
    }
}
