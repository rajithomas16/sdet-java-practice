package LeetCodeChallenges;

import java.util.*;


public class KidsWithGreatestNumberOfCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies)

    {
        List<Boolean> result=new ArrayList<>();

        //Find the current highest value and assign it to max value--Fins the king
        int max=0;//since candies' number won't be negative

        for(int candy:candies)
        {
            if(candy>max)
            {max=candy;}

        }
        //now add extraCandies to each of the candy and compare with the current King-compare teach+extra with kind and add to result array

        for(int candy:candies)
        {
            result.add(candy+extraCandies>=max);
        }

        return result;


    }
    public static void main(String[] args)
    {
        int[] candies={4,2,1,1,2};


        System.out.println(kidsWithCandies(candies,1));



    }
}


