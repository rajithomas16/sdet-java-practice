package LeetCodeChallenges;

public class MergeStringsAlternatively {

//zipper and bucket --while and 2 ifs
    public static String mergeAlternately(String word1, String word2) {
//Time Complexity: $O(n + m)$ where n and m are the lengths of the strings.
//Space Complexity: $O(n + m)$ for the StringBuilder output.

        if(word1==null||word2==null) throw new IllegalArgumentException("String Inputs are null");//Guard clause

        StringBuilder merged = new StringBuilder();//empty bucket

        int i=0;//zipper index at 0


        while(i<word1.length() || i<word2.length())//initial gatekeeper
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
