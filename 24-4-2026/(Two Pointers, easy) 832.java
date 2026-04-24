class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        for(int i=0;i<image.length;i++)
        {
            for(int j = 0; j<image.length ; j++)
            {
                if(image[i][j]==0)
                {
                    image[i][j]=1;
                }
                else
                {
                    image[i][j]=0;
                }
            }
        }

        for(int i=0;i<image.length;i++)
        {
            int a=0,b=image.length-1;
            for(int j = 0; j<image.length/2 ; j++)
            {
                int temp = image[i][a];
                image[i][a] = image[i][b];
                image[i][b] = temp;
                a++;
                b--;
            }
        }

        return image;
    }
}
