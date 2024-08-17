package KeepTheChange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        List<Integer> listOfCoins = new ArrayList<>(coins);
        listOfCoins.sort(Collections.reverseOrder());
        List<Integer> computedChange = new ArrayList<>();

        int i = 0;
        while (i < listOfCoins.size() && amount > 0) {
            int coin = listOfCoins.get(i);
            if (amount >= coin) {
                computedChange.add(coin);
                amount -= coin;
            } else {
                i++;
            }
        }

        return computedChange;
    }
}