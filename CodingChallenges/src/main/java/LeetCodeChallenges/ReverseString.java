package LeetCodeChallenges;
//****************2-POINTER************************The Meeting Point (opposite directions)//
public class ReverseString {
    public static String reverseString(char[] chs)
    {
//in leetcode we can do -->O(1) because we are given string as character array directly so that we dont have to convert it to char Array4
        //u cant do swapping wihtout a temp variable
        int left=0;int right=chs.length-1;

        while(left<right)
        {
            char temp=chs[left];
           chs[left]=chs[right];
           chs[right]=temp;
           left++;
           right--;
        }

        return new String(chs);
    }
    public static void main(String[] args)
    {
char[] chs={'h', 'l', 'e'};
        System.out.println(reverseString(chs));

    }

}
