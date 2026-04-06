class Solution {
    public int[] decrypt(int[] code, int k) {
        int diffuse[] = new int[code.length];
        if(k>0)
        {
            for(int i=0;i<code.length;i++)
            {
                int sum=0;
                int count =1;
                int idx=i+1;
                while(count<=k)
                {
                    if(idx==code.length)
                    {
                        idx=0;
                    }
                    diffuse[i] += code[idx];
                    sum += code[idx];
                    idx++;
                    count++;
                }

            }
        }
        else if(k<0)
        {
            k = k* (-1);
            for(int i=0;i<code.length;i++)
            {
                int count =1;
                int idx=i-1;
                while(count<=k)
                {
                    if(idx<0)
                    {
                        idx=code.length-1;
                    }
                    diffuse[i] += code[idx];
                    idx--;
                    count++;
                }
            }
        }
        else
        {
            for(int i=0;i<code.length;i++)
            {
                diffuse[i] = 0;
            }
        }
        return diffuse;
    }
}
