package LeetCodeChallenges;

import java.util.Arrays;

public class ReverseWords {
    public static String reverseWords(String s)
    {
        if(s==null||s.isEmpty()) throw new IllegalArgumentException("Input is null");

        String[] words=s.trim().split("\\s+");//  \\s is the magic scissors that ignores all the extra spaces so that if there are 2 spaces
        //it does not consider the extra space as a ghost word.

        int left=0;
        int right=words.length-1;

        while(left<right)
        {
            String temp=words[left];
            words[left]=words[right];
            words[right]=temp;

            left++;
            right--;

        }
//join the string array back into a proper sentence using String.join(delimiter,String[])
        return String.join(" ", words);

    }
    public static void main (String[] args)
    {
        String s = "the   sky is blue";
        System.out.println((reverseWords(s)));

    }

}
