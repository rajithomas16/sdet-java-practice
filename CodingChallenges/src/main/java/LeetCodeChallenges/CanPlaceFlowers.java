package LeetCodeChallenges;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
//Theater usher check 1)check the spot taken 2)check left(beginning || i-1) 3)check right (end||i+1) 4)if both empty ie true boolean then place flower[i] as 1 and increase count  5)stop as soon count >= n return true 6)return
        for(int i=0;i<flowerbed.length;i++)
        {
            if(flowerbed[i]==0)//1st Gate-only proceed if current place is not planted

            {
                boolean leftEmpty=(i==0||flowerbed[i-1]==0);//check if i is 0 (ie start) OR value at left side of current position is zero

                boolean rightEmpty=(flowerbed.length-1==0||flowerbed[i-1]==0);//check if i is at the end OR value at left side of current position is zero

                if(leftEmpty&&rightEmpty)
                {
                    flowerbed[i]=1;//plant the flower
                    count++;//increase count to keep track of plant to be planted

                }

            }
            if(count>=n)
            {
                return true;//optimized so that if n is completed you dont need to check rest
            }


        }
        return count>=n;


    }

}
