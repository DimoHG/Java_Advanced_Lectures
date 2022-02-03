package listUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        ListUtils<Integer> listUtils = new ListUtils<>();
        list.add(12);
        list.add(1);
        list.add(15);
        list.add(150);
        list.add(-150);
        System.out.println(listUtils.getMin(new ArrayList<Integer>()));
        System.out.println(listUtils.getMax(list));
    }
}
