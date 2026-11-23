class Solution {
    public String reverseByType(String s) {
        
        int l=0,r=s.length()-1;
        char ar[]=s.toCharArray();
        while(l<r){
            while(l<r && !Character.isLetter(ar[l])) l++;
            while(l<r && !Character.isLetter(ar[r]))r--;
            if(l<r){char t=ar[l];
            ar[l]=ar[r];
                    ar[r]=t;
                   l++;
                   r--;}
        }
        l=0;r=s.length()-1;
         while(l<r){
            while(l<r && Character.isLetter(ar[l])) l++;
            while(l<r && Character.isLetter(ar[r]))r--;
            if(l<r){char t=ar[l];
                    ar[l]=ar[r];
                    ar[r]=t;
                   l++;
                   r--;}
        }
        return new String(ar);
    }
}
