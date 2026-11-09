class Solution {
    public int percentageLetter(String s, char letter) {
        if(s.contains(""+letter))
        {
            int count = 0;
            for(int i = s.indexOf(letter);i<s.length();i++)
            {
                if(s.charAt(i)==letter)
                {
                    count++;
                }
            }

            return (int)(((count*1.0)/s.length())*100);
        }
        else
        {
            return 0;
        }
    }
}

// cleaner version of my code
// int count = 0;

//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == letter) {
//                 count++;
//             }
//         }

//         return (count * 100) / s.length();
