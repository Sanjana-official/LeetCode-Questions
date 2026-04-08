class Solution {
    public int missingNumber(int[] nums) {
        // T.C = O(N), S.C = O(N)
        // int ans[] = new int[nums.length+1];
        //ans have all the index that ranges from 0 to n with initial value 0 in them.
        // for loop will iterate through nums
        // nums[i] will be the index of ans.
        //all the number that exist will have 1 in them.
        // for(int i=0;i<nums.length;i++)
        // {
        //     ans[nums[i]]=1;
        // }

        // int number=0;
        //for loop will iterate through ans array.
        //whichever number has zero in it means thats the missing number.
        // for(int i=0;i<ans.length;i++)
        // {
        //     if(ans[i]==0)
        //     {
        //         number = i;
        //     }
        // }
        // return number;


        // T.C = O(N), S.C = O(1);
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int sum2 = 0;
        for(int i=0;i<n;i++)
        {
            sum2 += nums[i];
        }

        return sum-sum2;
    }
}

// https://leetcode.com/problems/missing-number/solutions/4754401/beats-98-users-4-approaches-cjavapythonj-bz73
// understood the approach from his explanation.
