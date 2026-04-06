package Refreshers;

import java.util.Arrays;

public class ReverseString {

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
