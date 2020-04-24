package com.dahrens.codesample;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class sample_UT {

    @Test
    void sumLists() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4, 5);
        assertEquals(Sample.sumLists(list1, list2), 18);
    }

    @Test
    void sumLists_null() {
        assertEquals(Sample.sumLists(null, null), 0);
    }

    @Test
    void sumLists_partialNull() {
        List<Integer> list1 = Arrays.asList(6, 3);
        assertEquals(Sample.sumLists(list1, null), 9);
    }

}
