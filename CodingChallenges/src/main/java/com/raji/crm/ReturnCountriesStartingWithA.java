
package com.raji.crm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnCountriesStartingWithA {

    public static List<String> accountNames(List<String> accountNamesTotal) {
        List<String> accountNameswithA = new ArrayList<String>();

        for (String accountName : accountNamesTotal) {

            if (accountName.startsWith("A")) {
                accountNameswithA.add(accountName);
            }

        }
        return accountNameswithA;


    }

    public static void main(String[] args) {
        //declaring array list
        List<String> accountNamesTotal = new ArrayList<>(Arrays.asList("Apache", "Adobe", "apple", "Bosche", "cartier"));

        //calling function and storing the value in another list
        List<String> accountNamesNew = accountNames(accountNamesTotal);

        System.out.println(accountNames(accountNamesNew));

    }
}
