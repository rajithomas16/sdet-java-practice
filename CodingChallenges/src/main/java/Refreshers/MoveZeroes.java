package Refreshers;

import java.util.Arrays;

public class MoveZeroes {
    /*Input: [0, 1, 0, 3, 12]

Goal: Move all 0s to the end without making a copy of the array.

Requirement: Maintain the relative order of the non-zero numbers (i.e., 1 must still come before 3).

1)guard clause
2)slow pointer pos which tracks position and fast pointer i to intertate trough the array and move inplace without creating extra array
3)fill the remaining position with 0s--can be done in single pass by swapping using temp variable
*/
    public static int[] moveZeroes(int[] arr)
    {
        if(arr==null || arr.length==0) throw new IllegalArgumentException("The input is null");

        int pos=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[pos]=arr[i];
                pos++;
            }

        }

        while(pos<arr.length)
        {
            arr[pos]=0;
            pos++;
        }

        return arr;

    }

    public static void main(String[] args)

    {

        int[] arr={0, 1, 0, 3, 12};

        System.out.println(Arrays.toString(moveZeroes(arr)));

    }


}



