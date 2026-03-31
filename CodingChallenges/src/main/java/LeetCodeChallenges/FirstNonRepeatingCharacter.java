package LeetCodeChallenges;

import java.util.*;

public class FirstNonRepeatingCharacter {

    public static int firstNonRepeatingChar(String s1)
    {

//fail-first
        if(s1==null||s1.isEmpty()) throw new IllegalArgumentException("Input is null or empty");

        String s = s1.toLowerCase();

//Make freq counter map use getordefault shortcut

        Map<Character,Integer> mp1= new HashMap<Character,Integer>();
//no need to make character array--can directly loop through index and use s.charAt()


        for(int i=0;i<=s.length()-1;i++)
        {

            mp1.put(s.charAt(i),mp1.getOrDefault(s.charAt(i),0)+1);//imagine that s.charAt(i)===>ch


        }
        for(int j=0;j<=s.length()-1;j++)
        {
            if(mp1.get(s.charAt(j))==1)//mp.get(key)-->gives the value of that key in map
            {
                return j;
            }
        }
        return -1;//loop complete without returning indexes then all are repeating
    }

    public static void main(String[] args) {



        System.out.println(firstNonRepeatingChar("india"));

    }

}
