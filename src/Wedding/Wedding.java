package Wedding;

import java.util.*;

public class Wedding {
    public static Map<String,String> createCouple (Set<String> s1, Set<String> s2){
      Map<String,String> returnedMap = new HashMap<>();
        List<String> list1 = new ArrayList<>(s1);
        List<String> list2 = new ArrayList<>(s2);

        int minSize = Math.min(list1.size(), list2.size());
        for (int i=0;i<minSize;i++){

            returnedMap.put(list1.get(i),list2.get(i));
        }
      return returnedMap;
    }
}
