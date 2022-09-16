package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int a_ = Integer.parseInt(a), b_ = Integer.parseInt(b);
         int res = Integer.compare(5 * a_ * a_ + 3, 5 * b_ * b_ + 3);
         return res != 0 ? res : Integer.compare(a_, b_);
    }
}
