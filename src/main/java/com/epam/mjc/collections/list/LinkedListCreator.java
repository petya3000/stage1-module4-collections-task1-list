package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> list = new LinkedList<>();

        for (Integer el : sourceList){
            if (el % 2 == 0) list.addLast(el);
            else list.addFirst(el);
        }
        return list;
    }
}
