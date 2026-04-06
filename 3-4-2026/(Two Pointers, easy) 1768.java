class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length = Math.min(word1.length(),word2.length());
        int i=0,j=0;
        StringBuilder sb = new StringBuilder("");
        for(int s=0;s<length;s++)
        {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;j++;
        }

        while(i<word1.length())
        {
            sb.append(word1.charAt(i));
            i++;
        }

        while(j<word2.length())
        {
            sb.append(word2.charAt(j));
            j++;
        }

        return sb.toString(); 
    }
}
