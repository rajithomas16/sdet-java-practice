package LeetCodeChallenges;

public class AverageSumSubArray {
    public static double maxAverageSubArray(int[] nums,int k)


    {
        if(nums==null||nums.length<k||k<=0) throw new IllegalArgumentException("Null value or less than subarray");


        int windowSum=0;

        for(int i=0;i<k;i++)
        {
            windowSum+=nums[i];
        }
        int maxSum=windowSum;


        for(int i=k;i<nums.length;i++)
        {

            windowSum +=nums[i]-nums[i-k];

            maxSum=Math.max(maxSum,windowSum);

        }

        return (double)maxSum/k;//double casting
    }
    public static void main(String[] args)
    {
        int[] arr={1, 12, -5, -6, 50, 3};


        System.out.println(maxAverageSubArray(arr,3));



    }
}
