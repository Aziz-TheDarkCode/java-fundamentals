package WeddingComplex;

import java.util.*;

public class WeddingComplex {
    public static Map<String,String> createBestCouple (Map<String, List<String>> groupA,Map<String,List<String>> groupB) {
        Map<String,String> couples = new HashMap<>(groupA.size());
        int numberOfActors = groupA.size();
        // Setting by default couples based on their preferences
        for (int i = 0; i < numberOfActors; i++) {

            List<String> mensPreferences = new ArrayList<>(groupA.keySet());
            List<String> womanPreferences = new ArrayList<>(groupB.keySet());

            //
            System.out.println(mensPreferences.get(i));
            System.out.println(womanPreferences.get(i));
        }

            groupA.forEach((k,v)-> System.out.println("hello"));
        return  couples;
    }
}
