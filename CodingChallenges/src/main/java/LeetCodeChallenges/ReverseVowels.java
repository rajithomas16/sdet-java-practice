package LeetCodeChallenges;

public class ReverseVowels {

    public static String reverseVowels(String s)
    {
        char[] chs=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        String vowels="AEIOUaeiou";

//check left to right
//finish the loop as soon and left and right meet
        while(left<right)
        {
//Check 1--check if left is at a vowel or not
            if(!vowels.contains(String.valueOf(chs[left])))
            {
                left++;
            }
//Check 2--check if right is at a vowel or not

          else if (!vowels.contains(String.valueOf(chs[right])))
          {

            right++;
          }
        else
        {
            char temp=chs[left];
            chs[left]=chs[right];
            chs[right]=temp;

            left++;
            right--;

        }
    }

return new String(chs);
}//trampoline



public static void main (String[] args)
        {
            String s = "POTE";
            System.out.println(reverseVowels(s));

        }
    }


