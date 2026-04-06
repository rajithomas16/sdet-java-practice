package LeetCodeChallenges;

public class MergeStringsAlternatively {


    public static String mergeAlternately(String word1, String word2) {


        if(word1==null||word2==null) throw new IllegalArgumentException("String Inputs are null");

        StringBuilder merged = new StringBuilder();//empty bucket

        int i=0;//zipper index at 0


        while(i<word1.length() || i<word2.length())
        {

            if(i<word1.length())
            {
                merged.append(word1.charAt(i));
            }
            if(i<word2.length())
            {
                merged.append(word2.charAt(i));
            }
            i++;
        }

        return merged.toString();


    }
    public static void main(String[] args)
    {

        System.out.println(mergeAlternately("ab","pqr"));


    }
}
