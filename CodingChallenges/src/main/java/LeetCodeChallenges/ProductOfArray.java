package LeetCodeChallenges;

import java.util.Arrays;

public class ProductOfArray {

    public static int[] productExceptSelf(int[] nums)
    {
        int n=nums.length;
        int[] leftProduct=new int[n];
        int[] rightProduct=new int[n];
        int[] finalProduct=new int[n];

        leftProduct[0]=1;
        //// 1. LEFT PASS: Each spot is (Everything to its left) * (The neighbor immediately to the left)
        for(int i=1;i<n;i++)
        {

        /// Correct logic: Take the total from the previous house and multiply it by that neighbor
            leftProduct[i]=leftProduct[i-1]*nums[i-1];

        }
        //// 2. RIGHT PASS: Each spot is (Everything to its right) * (The neighbor immediately to the right)
        rightProduct[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {

            //// Correct logic: Take the total from the house on the right and multiply it by that neighbor
            rightProduct[i]=rightProduct[i+1]*nums[i+1];

        }


        for(int i=0;i<n;i++)
        {
            finalProduct[i]=leftProduct[i]*rightProduct[i];

        }


        return finalProduct;

    }
    public static void main(String[] args)
    {

        int[] nums={1,2,3,4};

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

}
