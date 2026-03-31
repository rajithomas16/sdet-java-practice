package LeetCodeChallenges;

import java.util.*;


public class UniqueNumberofOccurences {

        public static boolean uniqueOccurrences(int[] arr)
        {
            if (arr.length == 0)
                throw new IllegalArgumentException("Input array is empty");


            Map<Integer,Integer> mp= new HashMap<Integer,Integer>();
            for(int a:arr)
            {
                mp.put(a,mp.getOrDefault(a,0)+1);

            }
            //use set for storing the values of the map pass directly to constructor
            //map.values()-->return a collection and it can be passed to a set constructor
            Set<Integer> countSet = new HashSet<Integer>(mp.values());

            //comapre if the number of key value entries in map is same as  that in set
            //eg: map->[1=3,2=2,3=1]--size()=3 and set stores only values-> [3,2,1] size()=3
            //eg:map->[1=1,2=1]-->size()=2 and set->[1](does not allow any duplicate value) size()=1
            return  mp.size()==countSet.size();

        }

        public static void main(String[] args)
        {
            int [] arr={1,2,2,1,1,3};
            System.out.println(uniqueOccurrences(arr));
        }



    }

