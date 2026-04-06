class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //edge cases
        if(n==0)
        {
            return true;
        }
        //edge case
        else if(n == 1 && flowerbed.length==1 && flowerbed[0]==0)
        {
            return true;
            
        }
        //edge case
        else if(n == 1 && flowerbed.length==1 && flowerbed[0]==1)
        {
            return false;
            
        }
        //edge  case
        else if(n > 1 && flowerbed.length==1 )
        {
            return false;
            
        }
        //edge case
        else if(n ==1 && flowerbed.length==2)
        {
            if(flowerbed[0]==0 && flowerbed[1]==0)
            {
                return true;
            }
            else{
                return false;
            }
        }
        //edge case
        else if(n > 1 && flowerbed.length==2 )
        {
            return false;
            
        }
        //normal case
        else{
        int i=1;
        if(flowerbed[0]==0 && flowerbed[1]==0)
        {
            flowerbed[0]=1;
            n--;
        }
        
        while(i<flowerbed.length-1 && n>0)
        {
            if(flowerbed[i]==0 && flowerbed[i-1] != 1 && flowerbed[i+1] != 1)
            {
                flowerbed[i] = 1;
                n--;
            }
            i++;
        }

        if(flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length-2] == 0 && n!=0)
        {
            flowerbed[flowerbed.length-1]=1;
            n--;
        }

        return n==0?true:false;
    }
    }
}
