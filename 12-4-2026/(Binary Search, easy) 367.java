class Solution {
    //brute force t.c= (its square root times it will run)
    public boolean isPerfectSquare(int num) {
        int count =  0 ;
        int number = num;
        int subs = 1;
        while(num>0)
        {
            num = num - subs;
            count++;
            subs += 2;
            // System.out.println(count);
        }
        if(count*count == number)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

// binary search solution from : https://leetcode.com/problems/valid-perfect-square/solutions/7847119/valid-perfect-square-using-binary-search-mnr8

