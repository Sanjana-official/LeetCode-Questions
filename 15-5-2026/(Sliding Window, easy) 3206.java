class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n=colors.length;
        int c=0;
        for(int i=0;i<n;i++){
            int l=i-1;
            int r=i+1;
            if(i==0){
                l=n-1;
                r=i+1;
            }
            else if(i==n-1){
                l=i-1;
                r=0;
            }
            if(colors[l]==colors[r] && colors[i]!=colors[l]){
                c++;
            }
        }
        return c;
    }
}
