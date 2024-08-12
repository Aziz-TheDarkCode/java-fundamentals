package ListSearchIndex;

import java.util.ArrayList;
import java.util.List;

public class ListSearchIndex {
    public static boolean containsValue(List<Integer> list, Integer value) {
            for(Integer i:list) {
                if (i == value) {
                    return true;
                }
            }
        return false;
    }
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if(list.lastIndexOf(value) == -1|| list.isEmpty()) {
            return null;
        }
        return list.lastIndexOf(value);
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        for (int i = 0; i < list.size(); i++) {
            if (value.equals(list.get(i))) {
                return i;
            }
        }
        return null;
    }
    public static List<Integer> findAllIndexes(List<Integer> list,Integer value) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            if (value.equals(list.get(i))) {
                result.add(i);
            }
        }
        return result;
    }
}
