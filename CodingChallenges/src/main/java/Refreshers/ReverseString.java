package Refreshers;

import java.util.Arrays;

public class ReverseString {
/*Meeting point of 2 pointer-pblm: ReverseString char[] chs={'h','e','l','l','o'}

In place constant space-O(1) and linear time-O(n)

1)check null check and return exception
2)use left and right pointer to swap the characters
3)return the reversed array
4)note-if the input is just string we will have to convert to character array first .So the space will become O(n) --it grows as input grows

*/
    public static char[] reverseString(char[] chs)

    {
        if(chs==null || chs.length==0) throw new IllegalArgumentException("The input is null");


        int left=0;
        int right=chs.length-1;

        while(left<right)

        {
            char temp=chs[left];
            chs[left]=chs[right];
            chs[right]=temp;

            left++;
            right--;

        }

        return chs;

    }

    public static void main(String[] args)

    {
        char[] chs={'h','e','l','l','o'};
        System.out.println(Arrays.toString(reverseString(chs)));

    }

}
