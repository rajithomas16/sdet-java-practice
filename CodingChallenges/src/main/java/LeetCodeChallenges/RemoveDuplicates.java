package LeetCodeChallenges;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr)

    {

        int pos=0;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[i-1])//compare to previous to prevent arrayindexoutofBounds exceptions
            {
                arr[pos]=arr[i];
                pos++;
            }
        }

        return pos;

    }

    public static void main(String[] args)
    {
        int[] arr={1,2,3,3,4,4,4};

        int k=removeDuplicates(arr);

        int[] uniqueArray= Arrays.copyOf(arr,k);//clips to size of K
        //Note that after the loop of method above the int[] arr becomes {1,2,3,4,3,4,4} rest of data is trimmed by size k by Array.copyOf()

        System.out.println(Arrays.toString(uniqueArray));



    }

}
