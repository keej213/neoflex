package task3.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class MySortedList<T extends Comparable> extends LinkedList {

    public static void sort(List<Integer> list) {
        Collections.sort(list);
    }
}

