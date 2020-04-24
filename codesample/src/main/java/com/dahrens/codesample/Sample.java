package com.dahrens.codesample;

import java.util.List;

public class Sample {
    /** Given two lists of any lengths, return a single integer that is the sum of the values in both lists **/
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


    /** Given two strings, return the number of indices that share the same character **/
    public static int sharedIndices(String item1, String item2) {
        if (item1 == null || item2 == null) {
            return 0;
        }
        int counter = 0;
        for (int i = 0; i < item1.length() && i < item2.length(); i++) {
            if (item1.charAt(i) == item2.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }

    /** Given a string, build a new string with only the uppercase characters of that string **/
    public static String filterUppercase(String orig) {
        StringBuilder buffer = new StringBuilder();
        for(char c: orig.toCharArray()) {
            if (Character.isUpperCase(c)) {
                buffer.append(c);
            }
        }
        return buffer.toString();
    }
}
