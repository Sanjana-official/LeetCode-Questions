class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i =0 , j = s.length()-1;
        while(i<=j)
        {
            char ithchar , jthchar;
            if( s.charAt(i)=='a' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='E' || s.charAt(i)=='U' || s.charAt(i)=='e')
            {
                ithchar = s.charAt(i);
                if( s.charAt(j)=='a' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u' || s.charAt(j)=='A' || s.charAt(j)=='I' || s.charAt(j)=='O' || s.charAt(j)=='E' || s.charAt(j)=='U' || s.charAt(j)=='e')
                {
                    jthchar = s.charAt(j);
                    sb.setCharAt(i, jthchar);
                    sb.setCharAt(j, ithchar);
                    i++;
                    j--;
                }
                else{
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
