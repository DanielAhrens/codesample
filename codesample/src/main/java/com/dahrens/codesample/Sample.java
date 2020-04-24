package com.dahrens.codesample;

import java.util.List;

public class Sample {
    // Given two lists of any lengths, return a single integer that is the sum of the values in both lists
   public static Integer sumLists(List<Integer> list1, List<Integer> list2) {
        Integer subtotal1 = 0;
        Integer subtotal2 = 0;
        if (list1 != null) {
            subtotal1 = list1.stream().reduce(0, Integer::sum);
        }
        if (list2 != null) {
            subtotal2 = list2.stream().reduce(0, Integer::sum);
        }
        return subtotal1 + subtotal2;
    }
}
