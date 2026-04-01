package FrameworkChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*Scenario: You are testing a Search Bar. When you type "Apple," the top 3 results must contain the word "Apple."

eg:List<String> results = ["Apple iPhone", "Apple Watch", "Samsung Galaxy", "Apple Mac"]
*/
public class searchBarResults {
    public static boolean searchBar(List<String> results, String keyWord)

    {
//Fail-safe

        if(results==null|| results.isEmpty()) throw new IllegalArgumentException("List is null or empty");


//protect the bounds--if results are less than 3 it should not crash--also to prevent hardocidng to 3
        int limit=Math.min(results.size(),3);

        String lowerCaseKeyWord=keyWord.toLowerCase();//normalization on both sides

        for(int i=0;i<=limit-1;i++)
        {

            if(!results.get(i).toLowerCase().contains(lowerCaseKeyWord))
            {
                System.out.println(results.get(i) +" appears in the top search results ");
                return false;
            }

        }

        return true;

    }

    public static void main(String[] args){

        List<String> results=new ArrayList<>(Arrays.asList("Apple iPhone", "Apple Watch", "Samsung Galaxy", "Apple Mac"));
        String keyWord="Apple";

        System.out.println(searchBar(results,keyWord));



    }

}
