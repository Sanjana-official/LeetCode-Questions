class Solution {
  //mine is brute force
  //t.c = O(n log n) because of sorting, s.c = O(n) because of char arrays
    public char findTheDifference(String s, String t) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String sSorted = String.valueOf(ch);

        char[] cht = t.toCharArray();
        Arrays.sort(cht);
        String tSorted = String.valueOf(cht);

        for(int i =0; i<s.length();i++)
        {
            int numb = sSorted.charAt(i);
            int compare = (sSorted.charAt(i)&tSorted.charAt(i));
            if(compare!=numb)
            {
                return tSorted.charAt(i);
            }
        }

        return tSorted.charAt(tSorted.length()-1);
    }
}

// liked this solution : https://leetcode.com/problems/find-the-difference/solutions/7658684/best-optimal-solution-easy-solution-java-9yb1
