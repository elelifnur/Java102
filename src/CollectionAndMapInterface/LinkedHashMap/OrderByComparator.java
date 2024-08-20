package CollectionAndMapInterface.LinkedHashMap;

import java.util.Comparator;

public class OrderByComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}
