package FrameworkChallenges;
import java.util.*;
public class IsTableSorted {


    public static boolean isTableSortedAscending(List<Double> prices) {

        if (prices == null || prices.size() < 2) return true;


        for (int i = 0; i <= prices.size() - 1; i++) {

            double current = prices.get(i);

            double next = prices.get(i + 1);

            if (current > next) {
                System.out.println(current + " is appearing after " + next);

                return false;
            }


        }

        return true;

    }

    public static void main(String[] args) {
        //declaring array list
        List<Double> accountNamesTotal = new ArrayList<>(Arrays.asList(1.0, 1.0, 1.2, 1.5, 0.5));

       isTableSortedAscending(accountNamesTotal);


    }
}
