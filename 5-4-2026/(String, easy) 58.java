class Solution {
    public int lengthOfLastWord(String s) {
        String trimmed = s.trim(); 

        int count = 0;
        int idx = trimmed.length() - 1;

        while (idx >= 0 && trimmed.charAt(idx) != ' ') {
            count++;
            idx--;
        }
    return count;
    }
}
