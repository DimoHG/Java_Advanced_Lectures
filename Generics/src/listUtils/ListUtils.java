package listUtils;

import java.util.Collections;
import java.util.List;

public class ListUtils<T extends Comparable<T>> {


    public  T getMax(List<T> list){
        if(list.isEmpty()){
            throw new IllegalArgumentException();
        }
        return Collections.max(list);
    }

    public T getMin(List<T> list){
        if(list.isEmpty()){
            throw new IllegalArgumentException();
        }
        T currentMin = list.get(0);

        for (int i = 1; i <list.size(); i++) {
            T currentElement = list.get(i);
            if(currentMin.compareTo(currentElement) > 0){
                currentMin = currentElement;
            }
        }
        return currentMin;
    }
}
