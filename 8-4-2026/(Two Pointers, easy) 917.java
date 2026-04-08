class Solution {
    public String reverseOnlyLetters(String str) {
        // T.C = O(N) , S.C = O(N)
        StringBuilder sb = new StringBuilder(str);
        int i=0, j= str.length()-1;
        while(i<j)
        {
            if(str.charAt(i) >= 97 && str.charAt(i) <= 122 || str.charAt(i) >= 65 && str.charAt(i) <= 90)
            {
                if(str.charAt(j) >= 97 && str.charAt(j) <= 122 || str.charAt(j) >= 65 && str.charAt(j) <= 90)
                {
                    char temp = str.charAt(j);
                    sb.setCharAt(j, str.charAt(i));
                    sb.setCharAt(i, temp);
                    i++;j--;
                }
                else
                {
                    j--;
                }
            }
            else
            {
                i++;
            }
        }

        return sb.toString();
    }
}
