class Solution {
    public int maxScore(String s) {
        int zerocount[] = new int[s.length()];
        int onecount[] = new int[s.length()];

        if(s.charAt(0) == '0')
        {
            zerocount[0] = 1;
        }

        for(int i = 1; i <= s.length()-2 ; i++)
        {
            if(s.charAt(i) == '0')
            {
                zerocount[i] = zerocount[i-1] + 1;
            }
            else
            {
                zerocount[i] = zerocount[i-1];
            }
        }

        if(s.charAt(s.length()-1)=='1')
        {
            onecount[s.length()-1] = 1;
        }

        for(int i = s.length()-2 ; i > 0 ; i--)
        {
            if(s.charAt(i) == '1')
            {
                onecount[i] = onecount[i+1] + 1;
            }
            else
            {
                onecount[i] = onecount[i+1];
            }
        }

        int maximum = Integer.MIN_VALUE;

        for(int i = 0 ; i < onecount.length-1 ; i++ )
        {
            maximum = Math.max(maximum, (zerocount[i]+onecount[i+1]));
        }

        return maximum;
    }
}
