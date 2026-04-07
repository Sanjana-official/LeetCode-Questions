class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {

            if (haystack.charAt(i) == needle.charAt(0) &&
                haystack.charAt(i + m - 1) == needle.charAt(m - 1)) {

                int j = 0;
                while (j < m && haystack.charAt(i + j) == needle.charAt(j))
                {
                    j++;
                }

                if (j == m) return i;
            }
        }

        return -1;
    }
}

// my code before .
// class Solution {
//     public int strStr(String haystack, String needle) {
//         if(haystack.length()<needle.length())
//         {
//             return -1;
//         }

//         int idx=-1;int needleidx=0;
//         int nlast =needle.length();

//         for(int i=0;i<haystack.length()-needle.length();i++)
//         {
//             if(haystack.charAt(i)==needle.charAt(0) && needle.charAt(nlast-1)==haystack.charAt(i+nlast-1))
//             {
//                 idx=i;
//                 break;
//             }
//         }
//         if(idx>-1)
//         {
//             for(int i =idx;i<(nlast+idx);i++)
//             {
//                     if(haystack.charAt(i)!=needle.charAt(needleidx))
//                     {
//                         return -1;
//                     }
//                     needleidx++;
//             }
//         }
//         return idx;
//     }
// }
