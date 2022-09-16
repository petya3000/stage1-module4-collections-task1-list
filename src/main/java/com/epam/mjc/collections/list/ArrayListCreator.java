package com.epam.mjc.collections.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> al = new ArrayList<>();
        int i = 1;
        for (String el : sourceList){
            if (i % 3 == 0) {
                al.add(el);
                al.add(el);
            }
            i++;
        }
        return al;
    }
}
