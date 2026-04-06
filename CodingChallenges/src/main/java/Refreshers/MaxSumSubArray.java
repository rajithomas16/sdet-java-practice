package Refreshers;

public class MaxSumSubArray {
    /*The "Fixed Window" (Summing)
Problem: MaxSumSubArray.java

Input: int[] arr = [2, 3, 4, 1, 5], k = 3

Logic Check: Calculate the first 3. Then "Slide" by adding the new and subtracting the old.
1)sliding window --adding the new guest and subtracting the leaving guest
2)add first 3 and then find the windowSum, assign it to maxSum and then start from i=k and to full length to array by adding /subtracting

*/
    public static int maxSumSubArray(int[] arr,int k)

    {
        if(arr==null||arr.length<k) throw new IllegalArgumentException("Input is invalid or null");

        int windowSum=0;

        for(int i=0;i<k;i++)
        {
            windowSum+=arr[i];
        }

        int maxSum=windowSum;


        for(int j=k;j<arr.length;j++)
        {

            windowSum+=arr[j]-arr[j-k];//i.e.j-k=(3-3) subtract arr[0] when adding arr[3]

        }

        maxSum=Math.max(windowSum,maxSum);



        return maxSum;

    }



}
