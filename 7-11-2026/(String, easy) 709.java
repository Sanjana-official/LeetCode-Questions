class Solution {
    public String toLowerCase(String s) {
        // return s.toLowerCase(); using inbuilt function

        //doing manually, t.c = O(n) , s.c = O(n)
        StringBuilder sb = new StringBuilder();
         for(int i = 0 ; i<s.length();i++)
         {
            if(s.charAt(i)>= 65 && s.charAt(i)<=90)
            {
                String s2 = (String.valueOf(s.charAt(i))).toLowerCase();
                sb.append(s2);
            }
            else
            {
                sb.append(s.charAt(i));
            }
         }

         return sb.toString();
    }
}
