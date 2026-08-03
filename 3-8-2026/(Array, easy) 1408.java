class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int j = 0;
            while (j < words.length) {
                if (i != j && words[j].contains(words[i])) {
                        ans.add(words[i]);
                        break;
                }
                j++;
            }
        }
       
        return ans;
    }
}
