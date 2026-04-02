package LeetCodeChallenges;

import java.util.Arrays;

public class MaxSumSubArray {
   // ****************Sliding Window--with i as new guest and i-k as the leaving guest
   public static int maxSumSubArray(int[] arr,int k)

   {
       int windowSum=0;
       int maxSum=0;

//i is the new guest and i-k is the leaving guest so add arr[i] and remove arr[i-k] from the windowSum
       for(int i=0;i<=k-1;i++)
       {
           windowSum+=arr[i];//get intial sum till k elements
       }


       for(int i=k;i<=arr.length-1;i++)
       {

           windowSum+=arr[i]-arr[i-k];


           maxSum=Math.max(windowSum,maxSum);//assign the currentSUm to maxSum if it bcomes greater

       }


       return maxSum;

   }

    public static void main(String[] args)
    {
        int[] arr={1,2,3,3,4,4,4};


        System.out.println(maxSumSubArray(arr,3));



    }





}
